package com;

import com.colors.Black;
import com.colors.Brown;
import com.colors.Green;
import com.factory.Factory;
import com.impl.Rectangle;
import com.impl.Triangle;
import com.inter.Figure;
import com.inter.IColor;

public class Main {
    public static void main(String[] args) {

        Factory f = new Factory();

        f.init("com.colors");
        f.init("com.impl");

        Black blackColor = f.create(Black.class);

        Brown brownColor = f.create(Brown.class);

        Figure f1 = f.create(Triangle.class, brownColor);
        Figure f2 = f.create(Rectangle.class, blackColor);

        f1.drawFigure(6);
        f2.drawFigure(8);
    }
}