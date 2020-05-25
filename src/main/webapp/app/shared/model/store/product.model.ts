export interface IProduct {
  id?: number;
  title?: string;
  amount?: number;
  price?: number;
}

export class Product implements IProduct {
  constructor(public id?: number, public title?: string, public amount?: number, public price?: number) {}
}
