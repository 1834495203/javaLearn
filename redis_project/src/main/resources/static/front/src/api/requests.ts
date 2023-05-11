import axios from 'axios'

const _axios = axios.create({
    //修改默认的前缀设置
    baseURL:import.meta.env.VITE_BACKEND_API_BASE_URL,
})

_axios.defaults.withCredentials = true

_axios.interceptors.request.use(
    (config)=>{
        config.headers.set('Authorization', 'aaa-bbb-ccc')
        return config
    },
    (error)=>{
        if(error.response.status === 500){
            alert('服务器已关闭')
        }
        // return Promise.reject(error)
        return Promise.resolve()
    }
)

//响应拦截器
_axios.interceptors.response.use(
    (response)=>{
        //状态码为 2xx 及响应成功
        return response
    },
    (error)=>{
        //状态码大于 2xx 及响应失败
        if(error.response.status === 404){
            //处理异常
        }else if(error.response.status === 500){
        }
        // return Promise.reject(error)
        return Promise.resolve()
    }
)

export default _axios