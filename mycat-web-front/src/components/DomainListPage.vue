<template>
  <v-container>
    <alert-dialog></alert-dialog>
    <full-dialog></full-dialog>
    <v-row align="center" justify="space-around">
      <slot name="searchslot"></slot>
      <v-btn text :loading="querying" @click="onSearch">
        <v-icon color="primary" large>mdi-card-search</v-icon>
      </v-btn>
    </v-row>
    <v-row>
      <v-expansion-panels hover light v-model="panel" multiple>
        <v-expansion-panel v-for="(item,i) in rows" :key="i">
          <v-expansion-panel-header>
            <div align="start">
              <v-badge color="red" :content="item.tip">
                <v-icon color="primary">{{comutil.getTipIconName(item.tipType)}}</v-icon>
              </v-badge>
              <span v-html="meta.row(item)" />
            </div>
          </v-expansion-panel-header>
          <v-expansion-panel-content>
            <div v-html="meta.content(item)"></div>
            <v-divider></v-divider>
            <v-row justify="end">
              <div style="margin-top: 10px">
                <v-btn
                  icon
                  id="detailbtn"
                  @click="showDetailScreen(i,meta.id(item),meta.title(item))"
                >
                  <v-icon large color="primary">mdi-subtitles-outline</v-icon>
                </v-btn>
                <slot name="btnslot"></slot>
                <v-btn
                  icon
                  @click="routeToUpdateOrCreateScreen(false,i,meta.id(item),meta.title(item))"
                >
                  <v-icon large color="primary">mdi-sticker-plus-outline</v-icon>
                </v-btn>
                <v-btn
                  icon
                  @click="routeToUpdateOrCreateScreen(true,i,meta.id(item),meta.title(item))"
                >
                  <v-icon large color="primary">mdi-pencil</v-icon>
                </v-btn>
                <v-btn icon @click="confirmDel(i,meta.id(item),meta.title(item))">
                  <v-icon large color="primary">mdi-delete-forever</v-icon>
                </v-btn>
              </div>
            </v-row>
          </v-expansion-panel-content>
        </v-expansion-panel>
      </v-expansion-panels>
    </v-row>
  </v-container>
</template>
<script>
export default {
  props: ['meta'],
  data() {
    return {
      querying: false,
      panel: [],
      rows: null
    }
  },
  methods: {
    confirmDel(index, theId, title) {
      var alert = {
        title: this.comutil.OptInfo.delete.title,
        itemInfo: title,
        content: this.comutil.OptInfo.delete.content,
        alType: this.comutil.AlertType.WARN,
        callBack: this.deleteItem,
        callBackParams: { index: index, id: theId, title: title }
      }
      console.log('confirm delete row  index ' + index + ' id:' + theId)
      this.comutil.Alert.showAlert(alert)
    },
    showDetailScreen(index, theId, title) {
      //  this.$router.push()
      //  this.comutil.showAlert
      this.comutil.CURDDialog.showDialog({
        vueComponent: this.meta.detailurl,
        title: title
      })
    },
    routeToUpdateOrCreateScreen(update, index, theId, title) {
      let url = this.meta.createurl
      let dialogtitle = this.meta.createtitle
      if (update) {
        url = this.meta.updateurl
        dialogtitle = title
      }

      this.comutil.CURDDialog.showDialog({
        itemIndex: index,
        itemId: theId,
        title: dialogtitle,
        vueComponent: url
      })
    },
    async deleteItem(selectedParm) {
      console.log(
        'do syn delete row ' + selectedParm.id + ' ,url  ' + this.meta.deleteurl
      )
      await new Promise(resolve => setTimeout(resolve, 3000))
      let { data } = await this.axioscall.post(this.meta.deleteurl, {})
      console.log('data ' + data)
      this.$data.rows.splice(selectedParm, 1)
    },
    async onSearch() {
      let queryparam = this.meta.queryparams()
      console.log('do search ' + JSON.stringify(queryparam))
      this.comutil.MessageBox.show(JSON.stringify(queryparam))
      this.querying = true
      let mydata = this.$data
      let data = null
      try {
        data = await this.axioscall.post(this.meta.queryurl, queryparam)
        mydata.rows = data
      } catch (e) {
        console.log(' exec call error ' + e)
        this.comutil.MessageBox.show(e)
      } finally {
        this.querying = false
      }
    }
  },
  mounted: function() {
    this.$data.rows = this.meta.rows
    console.log('DomainListPage mounted')
    this.onSearch()
  }
}
</script>
