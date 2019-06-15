<template>
        <v-card>
            <v-card-title>Now play &nbsp:&nbsp {{this.name}}</v-card-title>
            <vuetify-audio :file="file" :ended="audioFinish" :color="green"></vuetify-audio>
        </v-card>
</template>

<script>
    import VuetifyAudio from 'vuetify-audio';
    export default {
        name: "Player",
        props: ['url', 'author', 'name'],
        data() {
            return {
                file: 'http://www.noiseaddicts.com/samples_1w72b820/290.mp3',
            };
        },
        components: {
            'vuetify-audio': VuetifyAudio
        },
        // If you want to use ended callback add below code
        methods: {
            audioFinish () {
                console.log('You see this means audio finish.');
            }
        }
    }
</script>

<style scoped>

</style>
