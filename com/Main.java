package com;

import com.impl.CompositeProduct;
import com.impl.UnitProduct;
import com.impl.WeightProduct;
import com.model.Client;
import com.model.Order;

public class Main {
  public static void main(String[] args) {

    Order order = new Order(Client.CARLOS);

    UnitProduct coke = new UnitProduct("coke", "drink", 2.3, 3);

    UnitProduct buzzlighyear = new UnitProduct("buzzlighyear", "toy", 10.99, 1);

    UnitProduct keyboard = new UnitProduct("keyboard", "technology", 25, 2);

    WeightProduct salmon = new WeightProduct("salmon", "fish", 3.5, 6);

    WeightProduct meat = new WeightProduct("meat", "food", 8, 10);

    WeightProduct rice = new WeightProduct("rice", "food", 6.6, 20);

    CompositeProduct composite = new CompositeProduct();

    composite.addProduct(buzzlighyear);
    composite.addProduct(keyboard);
    composite.addProduct(coke);

    order.add(salmon);
    order.add(meat);
    order.add(rice);
    order.add(composite);

    System.out.println("Total: " + order.getFullPrice());
  }
}