import Vue from 'vue'
import Vuetify from 'vuetify'
import '@mdi/font/css/materialdesignicons.css'
Vue.use(Vuetify)
export default new Vuetify({icons: {
  iconfont: 'mdi' // || 'mdi' || 'mdiSvg' || 'md' || 'fa' || 'fa4' || 'faSvg'
},
theme: {
  themes: {
    light: {
      primary: '#FFBF00',
      secondary: '#B22222',
      anchor: '#8c9eff',
      accent: '#8c9eff',
      error: '#b71c1c'
    },
    dark: {
      primary: '#FFBF00',
      secondary: '#b0bec5',
      anchor: '#8c9eff',
      accent: '#8c9eff',
      error: '#b71c1c'
    }
  }
}

})
