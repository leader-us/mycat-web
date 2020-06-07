<template>
  <v-update-domain :meta="this.$data" :saveact="comutil.FormInfo.ActRetainInput">
    <v-text-field v-model="formdata.name" :counter="10" :rules="nameRules" label="Name" required></v-text-field>

    <v-text-field v-model="formdata.email" :rules="emailRules" label="E-mail" required></v-text-field>

    <v-select
      v-model="formdata.select"
      :items="items"
      :rules="[v => !!v || 'Item is required']"
      label="Item"
      required
    ></v-select>

    <v-checkbox
      v-model="checkbox"
      :rules="[v => !!v || 'You must agree to continue!']"
      label="Do you agree?"
      required
    ></v-checkbox>
  </v-update-domain>
</template>
<script>
export default {
  data: () => ({
    updateurl: '/house/update',
    formdata: {
      id: '',
      name: '',
      email: '',
      select: ''
    },
    nameRules: [
      v => !!v || 'Name is required',
      v => (v && v.length <= 10) || 'Name must be less than 10 characters'
    ],
    emailRules: [
      v => !!v || 'E-mail is required',
      v => /.+@.+\..+/.test(v) || 'E-mail must be valid'
    ],
    items: ['Item 1', 'Item 2', 'Item 3', 'Item 4'],
    checkbox: false,
    lazy: false
  }),

  methods: {}
}
</script>
