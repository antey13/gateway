import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'product',
        loadChildren: () => import('./store/product/product.module').then(m => m.StoreProductModule)
      },
      {
        path: 'cart',
        loadChildren: () => import('./cart/cart/cart.module').then(m => m.CartCartModule)
      },
      {
        path: 'order',
        loadChildren: () => import('./order/order/order.module').then(m => m.OrderOrderModule)
      }
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ]
})
export class GatewayEntityModule {}
