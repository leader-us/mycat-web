<template>
  <v-update-domain :saveact="comutil.FormInfo.ActCloseRefresh">
    <v-text-field v-model="name" :counter="10" :rules="[v => comutil.Validator.houseNameCheck(v)]" label="Name" required></v-text-field>

    <v-text-field v-model="email" :rules="[v => comutil.Validator.emailCheck(v)]" label="E-mail" required></v-text-field>

    <v-select
      v-model="select"
      :items="items"
      :rules="[v => comutil.Validator.itemCheck(v)]"
      label="Item"
      required
    ></v-select>

    <v-checkbox
      v-model="checkbox"
      :rules="[v => comutil.Validator.agreeCheck(v)]"
      label="Do you agree?"
      required
    ></v-checkbox>
  </v-update-domain>
</template>
<script>
export default {
  data: () => ({
    name: 'aaa',
    email: 'his@hpe.com',
    select: 'Item 2',
    items: ['Item 1', 'Item 2', 'Item 3', 'Item 4'],
    checkbox: true
  }),

  methods: {}
}
</script>
