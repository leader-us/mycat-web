<template>
  <v-dialog
    v-model="this.comutil.CURDDialog.show"
    fullscreen
    hide-overlay
    transition="dialog-bottom-transition"
  >
    <v-card>
      <v-toolbar color="#B22222" dark>
        <v-subheader>
          <b>{{this.comutil.CURDDialog.title}}</b>
        </v-subheader>
        <v-spacer></v-spacer>
        <v-btn icon dark @click="comutil.CURDDialog.close()">
          <v-icon>mdi-close</v-icon>
        </v-btn>
      </v-toolbar>
      <v-component :type="this.comutil.CURDDialog.vueComponent"></v-component>
    </v-card>
  </v-dialog>
</template>
<script>
export default {
  props: {
    title: String
  },
  data() {
    return {
      notifications: false,
      sound: true,
      widgets: false
    }
  },
  methods: {

  }
}
</script>
