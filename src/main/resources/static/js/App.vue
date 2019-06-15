<template xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">
    <v-app dark>
        <router-view></router-view>
    </v-app>
</template>

<script>

    import WelcomePage from "./views/WelcomePage.vue";

    export default {
        name: "App",
        components: {
            WelcomePage
        }
    }
</script>
<style scoped>

</style>
