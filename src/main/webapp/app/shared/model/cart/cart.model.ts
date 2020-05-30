export interface ICart {
  id?: number;
  userName?: string;
  productTitle?: string;
  amount?: number;
}

export class Cart implements ICart {
  constructor(public id?: number, public userName?: string, public productTitle?: string, public amount?: number) {}
}
