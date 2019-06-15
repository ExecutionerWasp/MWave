<template>
    <v-header>
        <v-toolbar app fixed clipped-left>
            <v-toolbar-side-icon @click.stop="drawer">
                <v-icon color="green">{{drawerIcon}}</v-icon>
            </v-toolbar-side-icon>
            <v-spacer></v-spacer>
            <v-toolbar-title>Musical Wave</v-toolbar-title>
            <v-spacer></v-spacer>
            <v-toolbar-side-icon @click.stop="player">
                <v-icon color="green">{{playerIcon}}</v-icon>
            </v-toolbar-side-icon>
        </v-toolbar>
    </v-header>
</template>

<script>
    export default {
        name: "AppHeader",
        props: ['drawer', 'player'],
        data() {
            return {
                drawerIcon: 'home',
                playerIcon: 'library_music'
            }
        }
    }
</script>

<style scoped>

</style>
