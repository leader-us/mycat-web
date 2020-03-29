<template>
  <div>
    <v-alert  v-model="this.$store.state.showalert"
      color="pink"
      dark
      border="top"
      icon="mdi-sticker-alert-outline"
      transition="scale-transition" persistent
    >
      Phasellus tempus. Fusce ac felis sit amet ligula pharetra condimentum. In dui magna, posuere eget, vestibulum et, tempor auctor, justo. Pellentesque posuere. Curabitur ligula sapien, tincidunt non, euismod vitae, posuere imperdiet, leo.
      Phasellus nec sem in justo pellentesque facilisis. Phasellus magna. Cras risus ipsum, faucibus ut, ullamcorper id, varius ac, leo. In hac habitasse platea dictumst. Praesent turpis.
      <div class="text-center">
        <v-btn color="primary" @click="this.$root.closeAlert">取消</v-btn>
        <v-btn color="primary" @click="this.$root.closeAlert">确定</v-btn>
      </div>
    </v-alert>
  </div>
</template>
<script>
</script>
