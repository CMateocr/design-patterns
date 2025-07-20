package com;

import com.factory.Factory;
import com.model.Black;
import com.model.Square;

public class BridgeApp {
  public static void main(String[] args) {
    Factory f = new Factory();
    f.init();

    Black blackColor = f.create( Black.class );
    Square square = f.create(Square.class, blackColor);

    square.render();

  }
}
