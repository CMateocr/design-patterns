package com.colors;

import com.annotation.Component;
import com.inter.IColor;

@Component(value = "green")
public class Green implements IColor {
    @Override
    public void draw(int border) {
        System.out.println("green color, " + border + " cm.");
    }
}
