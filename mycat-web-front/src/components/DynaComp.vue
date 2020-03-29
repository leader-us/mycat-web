<template>
  <component :is="component" v-if="component" />
</template>
<script>
export default {
  name: 'v-component',
  props: ['type'],
  data() {
    return {
      component: null
    }
  },
  watch: {
    type: function(newValue) {
      console.log('watch load  ,type ' + this.type)
      this.loadComponent()
    }
  },
  mounted() {
    console.log('mount load  ,type ' + this.type)
    this.loadComponent()
  },
  methods: {
    loadComponent() {
      if (this.type === null || this.type === undefined || this.type === '') {
        return
      }
      var name = this.type
      var path = ''
      var index = name.lastIndexOf('/')
      if (index > 0) {
        name = this.type.substring(index)
        path = this.type.substring(0, index)
      }
      this.component = () => import(`${path}${name}.vue`)
      console.log('mounted success load comp ' + JSON.stringify(this.component))
    }
  }
}
</script>
