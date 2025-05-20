package com.model;

import com.impl.CompositeProduct;
import com.impl.UnitProduct;
import com.impl.WeightProduct;
import com.inte.IPrice;

public class Order extends CompositeProduct {

  private Client client;

  public Order(Client client) {
    this.client = client;
  }

  public void add(IPrice product) {
    super.addProduct( product );
  }

  public void remove(IPrice product) {
    super.removeProduct( product );
  }

  public void stablishQuantity(IPrice product, int quantity) {
    if(product instanceof UnitProduct) {
      UnitProduct p = (UnitProduct) product;
      p.setQuantity( quantity );
    }
  }

  public void stablishWeight(IPrice product,  double weight) {
    if(product instanceof WeightProduct) {
      WeightProduct p = (WeightProduct) product;
      p.setWeight( weight );
    }
  }

}
