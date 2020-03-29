<template>
  <v-dialog
    v-model="comutil.Alert.show"
    fullscreen
    hide-overlay
    persistent
    transition="dialog-bottom-transition"
  >
    <v-card>
      <v-toolbar color="#B22222" dark>
        <v-subheader>
          <b>{{this.comutil.Alert.title}}</b>
        </v-subheader>
        <v-spacer></v-spacer>
        <v-btn icon dark @click="closeAlert()">
          <v-icon>mdi-close</v-icon>
        </v-btn>
      </v-toolbar>
      <v-row>
        <div style="margin:20px">
          <b>{{comutil.Alert.itemInfo}}</b>
          <BR />
          {{comutil.Alert.content}}
        </div>
      </v-row>
      <v-row class="text-center" justify="center" v-if="comutil.Alert.isprocess">
        <v-progress-circular :size="50" color="primary" indeterminate></v-progress-circular>
      </v-row>
      <v-row class="text-center" justify="center" v-else>
        <v-btn style="margin-right: 20px" color="primary" @click="confirm()">确定</v-btn>
        <v-btn color="primary" @click="closeAlert()">取消</v-btn>
      </v-row>
      <v-row class="text-center" v-show="comutil.Alert.errmsg">
        <span>{{comutil.Alert.errmsg}}</span>
      </v-row>
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
    confirm() {
      this.comutil.Alert.close(true)
    },
    closeAlert() {
      this.comutil.Alert.close(false)
    }
  }
}
</script>
