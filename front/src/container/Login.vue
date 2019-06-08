<template>
  <div class="login">
    <h1>ここにログインページ作成</h1>
    <Login />
  </div>
</template>

<script>
import Login from '@/components/Login.vue'

export default {
  name: 'login',
  components: {
    Login
  }
}
</script>

<style scoped>
/* .login {
  position: relative;
} */
</style>
