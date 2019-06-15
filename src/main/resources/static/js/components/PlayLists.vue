<template>
    <v-layout>
        <v-flex>
            <v-card>
                <v-list>
                    <v-list-tile
                            v-for="item in play_lists"
                            :key="item.title"
                            avatar
                            @click=""
                    >

                        <v-list-tile-avatar>
                            <v-icon color="green">{{play}}</v-icon>
                        </v-list-tile-avatar>

                        <v-list-tile-content>
                            {{item.name}}
                        </v-list-tile-content>
                    </v-list-tile>
                </v-list>
            </v-card>
        </v-flex>
    </v-layout>
</template>
<script>
    export default {
        data() {
            return {
                play: 'play_arrow',
                play_lists: [
                    {name: 'Power'},
                    {name:'Lite'},
                    {name:'Other'}
                    ]
            }
        }
    }
</script>
<style>

</style>
