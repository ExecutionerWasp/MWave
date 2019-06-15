<template>
    <v-app>
        <app-header :drawer="drawerHandling" :player="playerHandling"/>
        <v-navigation-drawer
                v-model="this.drawer"
                clipped
                fixed
                app
        >
            <v-list>
                <user-meta />

                <v-list-tile @click="">
                    <v-list-tile-action>
                        <v-icon>input</v-icon>
                    </v-list-tile-action>
                    <v-list-tile-content>
                        <v-list-tile-title>Add Track</v-list-tile-title>
                    </v-list-tile-content>
                </v-list-tile>
                <v-list-tile @click="">
                    <v-list-tile-action>
                        <v-icon>recent_actors</v-icon>
                    </v-list-tile-action>
                    <v-list-tile-content>
                        <v-list-tile-title>Sign Out</v-list-tile-title>
                    </v-list-tile-content>
                </v-list-tile>
            </v-list>
        </v-navigation-drawer>
        <v-navigation-drawer
                v-model="this.player"
                fixed
                right
                app
        >
            <v-list>
                <player :url="this.nowPlayUrl" :author="this.nowPlayAuthor" :name="this.nowPlayName"/>
                <template v-slot:activator>
                    <v-list-tile>
                        <v-list-tile-title>Users</v-list-tile-title>
                    </v-list-tile>
                </template>
                <v-list-tile>
                    <v-list-tile-title>Play Lists</v-list-tile-title>
                    <v-list-tile-action>
                        <v-icon>playlist_play</v-icon>
                    </v-list-tile-action>
                </v-list-tile>
                <play-lists/>
            </v-list>
        </v-navigation-drawer>
        <v-content>
            <v-layout column>
                <v-flex>
                    <v-layout class="ml-5 mr-5">
                        <v-flex>
                            <v-text-field>
                                <template v-slot:label="">
                                    <v-icon style="vertical-align: middle">search</v-icon>
                                </template>
                            </v-text-field>
                        </v-flex>
                        <v-flex>
                            <v-btn color="green" class="mt-3">
                                Search
                            </v-btn>
                        </v-flex>
                    </v-layout>
                </v-flex>
                <v-flex>
                    <v-card>
                        <v-list>
                            <v-list-tile
                                    v-for="item in items"
                                    :key="item.title"
                                    avatar
                                    @click="onPlay(item.name, item.author, item.url)"
                            >

                                <v-list-tile-avatar>
                                    <v-icon color="green">{{play}}</v-icon>
                                </v-list-tile-avatar>

                                <v-list-tile-content>
                                    {{item.author}} - {{item.name}}
                                </v-list-tile-content>
                            </v-list-tile>
                        </v-list>
                    </v-card>
                </v-flex>
            </v-layout>
            <app-footer/>
        </v-content>
    </v-app>
</template>

<script>
    import AppFooter from "../components/AppFooter.vue";
    import AppHeader from "../components/AppHeader.vue";
    import Player from "../components/Player.vue";
    import PlayLists from "../components/PlayLists.vue";
    import UserMeta from "../components/UserMeta.vue";
    export default {
        name: "WelcomePage",
        components: {
            UserMeta,
            AppFooter,
            AppHeader,
            Player,
            PlayLists
        },
        data() {
            return {
                drawer: true,
                player: true,
                nowPlayName: '',
                nowPlayAuthor: '',
                nowPlayUrl: '',

                play: 'play_arrow',
                items: [
                    {author: 'Jason Oner', name: 'Savage'},
                    {author: 'Travis Howard', name: 'Best of me'},
                    {author: 'Ali Connors', name: 'Unstoppable'},
                    {author: 'Cindy Baker', name: 'Flirt'},
                    {author: 'Jason Oner', name: 'Savage'},
                    {author: 'Travis Howard', name: 'Best of me'},
                    {author: 'Ali Connors', name: 'Unstoppable'},
                    {author: 'Cindy Baker', name: 'Flirt'},
                    {author: 'Jason Oner', name: 'Savage'},
                    {author: 'Travis Howard', name: 'Best of me'},
                    {author: 'Ali Connors', name: 'Unstoppable'},
                    {author: 'Cindy Baker', name: 'Flirt'}
                ]
            }
        },

        methods: {
            drawerHandling() {
                let local = this.drawer
                this.drawer = !this.drawer
                return local;
            },
            playerHandling() {
                let local = this.player
                this.player = !this.player
                return local;
            },

            onPlay(name, author, url) {
                this.nowPlayName = name
                this.nowPlayAuthor = author
                this.nowPlayUrl = url
            }
        }
    }
</script>

<style scoped>

</style>
