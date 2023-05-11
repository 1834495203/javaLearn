<script setup lang="ts">
    import { useRoute, useRouter } from 'vue-router'

    const route = useRoute()
    const router = useRouter()
    if (sessionStorage.getItem('code') === null) router.back()
</script>

<template>
    <h2>hello wrold</h2>
</template>