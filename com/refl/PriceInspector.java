package com.refl;

import com.impl.CompositeProduct;
import com.impl.UnitProduct;
import com.impl.WeightProduct;
import com.inte.IPrice;
import com.model.Order;

import java.lang.reflect.Field;
import java.util.List;

public class PriceInspector {
  public static void printDetails(IPrice product) {
    Class<?> clazz = product.getClass();

    System.out.println("clase: " + clazz.getName());

    Field[] fields = clazz.getDeclaredFields();

    for(Field field : fields) {
      field.setAccessible(true);
      try{
        Object value = field.get(product);

        System.out.println("field: " + field.getName());

        System.out.println("value: " + value);
      } catch (IllegalAccessException e) {
        System.err.println("no se puede acceder a name");
//        throw new RuntimeException(e);
      }
    }

    if(product instanceof CompositeProduct) {
      List<IPrice> subProduct = ((CompositeProduct) product).getProducts();
      for (IPrice prod : subProduct) {
        printDetails( prod );
      }
    }

  }

  public void changePrice(Order order, String name, double newPrice) {
    for(IPrice product : order.getProducts()) {

    }
  }

  public void recursiveChangePrice(IPrice product, String name, double newPrice) {

    Class<?> clazz = product.getClass();

    try {
      Field nameField = clazz.getDeclaredField( name );

      nameField.setAccessible(true);

      Object valueName = nameField.get(product);

      if(valueName != null && valueName.equals(name)) {
        Field prodField = null;

        if( product instanceof UnitProduct ) {
          prodField = clazz.getDeclaredField("price");
        }

        if( product instanceof WeightProduct ) {
          prodField = clazz.getDeclaredField("weightPrice");
        }

        if( prodField != null) {
          prodField.setAccessible(true);
          prodField.set(product, newPrice);

          System.out.println("cambiando precio para: " + name + ": " + newPrice);
        }
      }

    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }
}
