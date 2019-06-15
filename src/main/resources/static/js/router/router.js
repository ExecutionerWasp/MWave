import Vue from 'vue'
import VueRouter from 'vue-router'
import WelcomePage from '../views/WelcomePage.vue';

Vue.use(VueRouter)

const routes = [
    {path: '/', component: WelcomePage},
    {path: '*', component: WelcomePage}
]

export default new VueRouter({
    mode: 'history',
    routes
})
