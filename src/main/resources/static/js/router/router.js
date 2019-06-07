import Vue from 'vue'
import VueRouter from 'vue-router'
import TrackList from '../views/TrackList.vue'

Vue.use(VueRouter)

const routes = [
    {path: '/', component: TrackList},
    {path: '*', component: TrackList}
]

export default new VueRouter({
    mode: 'history',
    routes
})