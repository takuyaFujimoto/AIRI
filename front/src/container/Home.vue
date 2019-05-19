<template>
  <div class="home">
    <HelloWorld :hoge="hoge"/>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'home',
  components: {
    HelloWorld
  },
  data: () => ({
    hoge: 'hoge',
    piyo: 'piyo',
    fuga: 'fuga'
  })
}
</script>
