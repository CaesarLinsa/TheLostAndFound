
import Layout from '@/layout'

const foundpageRounter = {
  path: '/foundpage',
  component: Layout,
  redirect: 'noRedirect',
  name: 'found1',
  meta: {
    title: 'found1',
    icon: 'international'
  },
  children:[
    {
      path:'found',
      component: () => import('@/views/foundpage/found'),
      name: 'foundgoods',
      meta: {
        title: 'foundgoods',
        icon: 'find-open'
      }
    },
    {
      path:'foundlist',
      component: () => import('@/views/foundpage/foundlist'),
      name: 'foundlists',
      meta: {
        title: 'foundlists',
        icon: 'find-close'
      }
    }
  ]
}

export default foundpageRounter
