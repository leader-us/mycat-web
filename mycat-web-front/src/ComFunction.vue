<script type="text/javascript">
// 定义一些公共的属性和方法
const AlertType = {
  SUCCESS: 'success',
  INFO: 'info',
  WARN: 'warning',
  ERROR: 'error'
}
const Constant = {
  baseURL: 'http://localhost:8080'
}
const Token = {
  token: null,
  expireTime: null,
  refreshToken: null,
  user: null,
  validToken() {
    return this.token != null
  },
  updateData(targObj) {
    Object.assign(this, targObj)
    console.log(JSON.stringify(this))
  },
  setNewToken(newToken) {
    state.store.commit('setToken', newToken)
  }
}
const ComInfo = {
  curtime: new Date().getTime(),

  updateCurtime() {
    this.curtime = new Date().getTime()
    state.store.commit('updateComInfo', this)
  },
  updateData(targObj) {
    Object.assign(this, targObj)
  }
}
const FormInfo = {
  ActClose: 1,
  ActCloseRefresh: 2,
  ActRetainInput: 3,
  ActRetainInputReset: 4
}
const OptInfo = {
  delete: {
    title: '警告：您正在准备删除这个数据!',
    content:
      '警告！！！数据删除操作是不可恢复的操作！因为疏忽而导致业务数据丢失可能会导致业务运营发生严重后果或者个人信息资料的严重缺失，请在删除前认真检查数据删除的合理性、必要性、以及由此可能造成的损失和后果，如果确定要执行删除操作，可以点击相应按钮执行，否则建议取消本次操作。'
  },
  update: {
    title: '提示：您是否确定本次修改操作？',
    content:
      '注意：数据修改后会持久存储，数据的正确性影响到业务运营或者个人信息资料的虚假和错误，请在提交修改前认真检查每一处修改，确保所有的修改都是正确的，特别注意可能同时要修改并追加备注信息以表明此次修改操作的原因和说明，如果上述检查都已经仔细完成，可以点击相应按钮提交保存，否则建议返回检查。'
  }
}
const MessageBox = {
  visible: false,
  content: '',
  timeout: 5000,
  close() {
    state.store.commit('updateMessageBox', { visible: false, content: null })
    console.log('alert ' + Alert.show)
  },
  show(msg, timtout = 3000) {
    this.timeout = timtout
    this.content = msg
    this.visible = true
    state.store.commit('updateMessageBox', {
      visible: this.visible,
      content: this.content,
      timeout: this.timeout
    })
  },
  updateData(obj) {
    Object.assign(this, obj)
  }
}

const Alert = {
  show: false,
  title: '警告',
  content: '',
  itemInfo: '',
  isprocess: false,
  alType: AlertType.INFO,
  color: 'green',
  callBack: null,
  callBackParams: {},
  async close(needcallback) {
    let closeDialog = !needcallback || this.callBack === null
    if (needcallback && this.callBack != null) {
      console.log(' exec call back before close alert ')
      this.isprocess = true
      state.store.commit('updateAlert', { alert: this, show: true })
      try {
        closeDialog = await this.callBack(this.callBackParams)
      } catch (e) {
        console.log(' exec call error ' + e)
        Alert.isprocess = false
        state.store.commit('updateAlert', { alert: this, show: true })
        MessageBox.show(e)
      } finally {
        this.isprocess = false
        state.store.commit('updateAlert', { alert: this, show: true })
      }
    }

    // close input dialog'
    if (!closeDialog) {
      return
    }
    state.store.commit('updateAlert', {
      alert: {
        isprocess: false,
        callBack: null,
        callBackParams: null,
        errmsg: null
      },
      show: false
    })
    console.log('closed alert  !!! ')
  },
  updateAlert(alertObj, show) {
    Object.assign(this, alertObj)
    switch (this.alType) {
      case AlertType.SUCCESS:
        this.color = 'blue'
        break
      case AlertType.INFO:
        this.color = 'green'
        break
      case AlertType.WARN:
        this.color = 'red'
        break
      case AlertType.ERROR:
        this.color = 'black'
    }
    this.show = show
  },
  showAlert(alertObj) {
    state.store.commit('updateAlert', { alert: alertObj, show: true })
    console.log('show alert ')
  }
}
const CURDDialog = {
  show: false,
  title: '',
  itemId: '',
  itemIndex: '',
  vueComponent: null,
  callBack: null,
  callBackParams: {},
  async close(needcallback) {
    let closeDialog = !needcallback || this.callBack === null
    if (needcallback && this.callBack != null) {
      try {
        closeDialog = await this.callBack(this.callBackParams)
      } catch (e) {
        console.log(' exec call error ' + e)
        MessageBox.show(e)
      } finally {
        //
      }
    }
    // close input dialog'
    if (!closeDialog) {
      return
    }
    state.store.commit('updateCURDDialog', {
      dialog: { vueComponent: null, callBack: null, callBackParams: null },
      show: false
    })
    console.log('closed CURDDialog  !!! ')
  },
  updateData(targObj, show) {
    Object.assign(this, targObj)
    this.show = show
  },
  showDialog(targObj) {
    this.callBack = null
    this.callBackParams = null
    this.vueComponent = null
    state.store.commit('updateCURDDialog', { dialog: targObj, show: true })
    console.log('show CURDDialog ')
  }
}
const state = {
  store: null,
  Token: Token,
  alert: Alert,
  ComInfo: ComInfo,
  CURDDialog: CURDDialog,
  MessageBox: MessageBox
}
const httpUrl = 'http://39.105.17.99:8080/'
const tipIconMap = new Map([
  [0, 'mdi-tooltip-text-outline'],
  [1, 'mdi-sticker-check-outline'],
  [2, 'mdi-sticker-alert-outline'],
  [3, 'mdi-sticker-remove']
])
function getTipIconName(tipType) {
  return tipIconMap.get(tipType)
}

// 暴露出这些属性和方法
export default {
  Constant,
  Token,
  ComInfo,
  state,
  Alert,
  FormInfo,
  MessageBox,
  CURDDialog,
  AlertType,
  OptInfo,
  httpUrl,
  getTipIconName
}
</script>
