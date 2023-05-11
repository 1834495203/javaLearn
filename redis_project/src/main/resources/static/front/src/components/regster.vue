<script setup lang="ts">
    import { ElMessage, FormInstance } from 'element-plus';
    import { ref, watch, onMounted } from 'vue'
    import { useRouter } from 'vue-router'
    import axios from '../api/requests'
    import { msgModel } from '../model/models'
 
    const register = ref({phone:''})
    const vaild = ref({val:''})
    const formRef = ref<FormInstance>()
    const msgModel = ref<msgModel>()
    const isDis = ref<boolean>(false)
    const isBtnDisMsg = ref<string>('发送验证码')
    const canRegster = ref<boolean>(true)
    const toValidForm = ref<FormInstance>()
    const config = {
        headers:{
            'Content-Type':'application/json'
        }
    }
    const router = useRouter()

    onMounted(()=>{
        if (sessionStorage.getItem('isDis') === 'true') isDis.value = true
    })

    watch(()=>isDis.value, ()=>{
        if (isDis) {
            let num = Number(sessionStorage.getItem('time')) ?? 10
            const time = setInterval(()=>{
                if (num != 0) {
                    num--
                    sessionStorage.setItem('time', String(num))
                    isBtnDisMsg.value = `请${num}秒后重试`
                }
                if (num === 0) {
                clearInterval(time)
                isDis.value = false
                isBtnDisMsg.value = '发送验证码'
            }
            }, 1000)
        }
    })

    const submitForm = (formEl: FormInstance | undefined)=>{
        if (!formEl) return
        formEl.validate((vaild)=>{
            if(vaild){
                axios.post('api/user', register.value.phone, config).then((e)=>{
                    if(e.status === 200){
                        ElMessage.success('发送成功')
                        msgModel.value = e.data
                        isDis.value = true
                        canRegster.value = false
                        sessionStorage.setItem('time', '10')
                        sessionStorage.setItem('isDis', String(isDis.value))
                    }
                })
            }
            else {
                ElMessage.error('发送失败')
                return false
            }
        })
    }

    const toRegster = (formEl: FormInstance | undefined)=>{
        if (!formEl) return
        formEl.validate((v)=>{
            if (v){
                axios.post('api/reg', vaild.value.val, config)
                .then((e)=>{
                    if (e.status === 200){
                        msgModel.value = e.data
                        console.log(msgModel.value)
                        if (msgModel.value?.code === 202){
                            ElMessage.success('注册成功')
                            sessionStorage.setItem('code', vaild.value.val)
                            router.push({
                                path: 'regster/fill',
                                params: {
                                    'code': vaild.value.val
                                }
                            })
                        } else ElMessage.error('验证码错误')
                        sessionStorage.clear()
                    }
                })
                .catch((e)=>{
                    if (e.status === 404) ElMessage.error('没有该资源!')
                    else if (e.status === 500) ElMessage.error('处理异常!')
                    else if (e.status === 400) ElMessage.error('坏的请求!')
                })
            }
        })
    }

    
</script>

<template>
    <div class="register">
        <el-form label-position="right" label-width="150px" 
        style="max-width: 460px" :model="register" ref="formRef">
            <el-space fill>
                <el-form-item label="手机号 +86" prop="phone" label-width="100px" 
                :rules="[
                {required: true, message: '手机号不能为空'},
                ]">
                    <div class="sendTel">
                        <el-input v-model="register.phone" autocomplete="off"/>
                        <el-button type="primary" style="margin-left: 5px;"
                        @click="submitForm(formRef)" ref="submit"
                        :disabled="isDis">{{ isBtnDisMsg }}</el-button>
                    </div>
                </el-form-item>
            </el-space>
        </el-form>

        <el-form :model="vaild" label-position="right" label-width="150px" 
        style="max-width: 460px" ref="toValidForm">
            <el-space fill>
                <el-form-item label="验证码" label-width="100px" prop="val"
                :rules="[
                {required: true, message: '验证码不能为空'},
                ]">
                    <div class="sendTel">
                        <el-input v-model="vaild.val" autocomplete="off" 
                        :disabled="canRegster"/>
                        <el-button type="primary" 
                        style="margin-left: 5px;" :disabled="canRegster"
                        @click="toRegster(toValidForm)">注册</el-button>
                    </div>
                </el-form-item>
            </el-space>
        </el-form>
    </div>
    <RouterView />
</template>

<style scoped>
    .register {
        margin: 15px 40px;
    }

    .sendTel {
        width: 100%;
        display: flex;
        flex-wrap: nowrap;
    }

    .el-button {
        width: 100px;
    }
</style>