<template>
    <v-list-tile @click="">
        <v-list-tile-action>
            <v-btn fab dark small color="green">
                <v-icon dark>{{icon}}</v-icon>
            </v-btn>
        </v-list-tile-action>
        <v-list-tile-content>
            <v-list-tile-title>{{email}}</v-list-tile-title>
        </v-list-tile-content>
    </v-list-tile>
</template>

<script>
    export default {
        name: "UserMeta",
        data(){
            return{
                icon: 'face',
                email: 'JaroslavKulpi@gmail.com'
            }
        }
    }
</script>

<style scoped>

</style>
