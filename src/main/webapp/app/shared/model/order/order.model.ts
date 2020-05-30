export interface IOrder {
  id?: number;
  deviliveryStatus?: string;
  productTitle?: string;
}

export class Order implements IOrder {
  constructor(public id?: number, public deviliveryStatus?: string, public productTitle?: string) {}
}
