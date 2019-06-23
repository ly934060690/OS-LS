import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import page1 from '@/components/nlp/page1'
import page2 from '@/components/nlp/page2'
import page3 from '@/components/nlp/page3'
import page4 from '@/components/nlp/page4'
import page5 from '@/components/nlp/page5'
import page6 from '@/components/nlp/page6'
import page7 from '@/components/nlp/page7'
import home from '@/components/index/home'
import user from '@/components/user'
import jump from '@/components/jump'

import table1 from '@/components/nlptable/table1'
import table2 from '@/components/nlptable/table2'
import table3 from '@/components/nlptable/table3'
import table4 from '@/components/nlptable/table4'
import table5 from '@/components/nlptable/table5'
import table6 from '@/components/nlptable/table6'
import table7 from '@/components/nlptable/table7'


Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/components/nlp/page1',
        name: 'page1',
      component: page1
    }
    ,
    {
      path: '/components/nlp/page2',
      name: 'page2',
      component: page2
    }
    ,
    {
      path: '/components/nlp/page3',
      name: 'page3',
      component: page3
    }
    ,
    {
      path: '/components/nlp/page4',
      name: 'page4',
      component: page4
    }
    ,
    {
      path: '/components/nlp/page5',
      name: 'page5',
      component: page5
    }
    ,
    {
      path: '/components/nlp/page6',
      name: 'page6',
      component: page6
    }
    ,
    {
      path: '/components/nlp/page7',
      name: 'page7',
      component: page7
    },
    {
      path: '/components/user',
      name: 'user',
      component: user
    },
    {
      path: '/components/index/home',
      name: 'home',
      component: home
    },
    {
      path: '/components/jump',
      name: 'jump',
      component: jump
    },
    {
      path:'/components/nlptable/table1',
      name:'table1',
      component:table1
    },
    {
      path:'/components/nlptable/table2',
      name:'table2',
      component:table2
    },
    {
      path:'/components/nlptable/table3',
      name:'table3',
      component:table3
    },
    {
      path:'/components/nlptable/table4',
      name:'table4',
      component:table4
    },
    {
      path:'/components/nlptable/table5',
      name:'table5',
      component:table5
    },
    {
      path:'/components/nlptable/table6',
      name:'table6',
      component:table6
    },
    {
      path:'/components/nlptable/table7',
      name:'table7',
      component:table7
    },
  ]
})