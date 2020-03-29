<template>
  <v-row align="center">
    <v-dialog v-model="alertshow" fullscreen transition="dialog-bottom-transition">
      <v-card>
        <v-toolbar :color="comutil.Alert.color">
          <v-subheader>
            <div d-flex>
              <div>
                <b>{{comutil.Alert.title}}</b>
              </div>
              <div>{{comutil.Alert.itemInfo}}</div>
            </div>
          </v-subheader>
          <v-spacer></v-spacer>
          <v-btn icon @click="closeAlert()">
            <v-icon>mdi-close</v-icon>
          </v-btn>
          <v-btn icon @click="openAlert()">
            <v-icon>mdi-close</v-icon>
          </v-btn>
        </v-toolbar>
        <div>
          <span>data</span>
        </div>
      </v-card>
    </v-dialog>
    <v-layout justify-center>
      <v-card-actions>
        <v-btn primary>
          <span>SignUp</span>
        </v-btn>`enter code here`
      </v-card-actions>
    </v-layout>
    <div>
      <span>Detal Info</span>
    </div>
  </v-row>
</template>
<script>
export default {
  props: ['show'],
  data: () => ({
    alertshow: false
  }),
  watch: {
    show: function(newV, oldV) {
      console.log('watched show changed to ' + newV)
      this.alertshow = newV
    }
  },
  mounted: function() {
    console.log('mounted ')
    this.alertshow = this.show
  },
  methods: {
    validate() {
      this.$refs.form.validate()
    },
    closeDialog() {
      this.alertshow = false
    }
  }
}
</script>
