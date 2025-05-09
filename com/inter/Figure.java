package com.inter;

public abstract class Figure {
    protected IColor color;

    public Figure(IColor color) {
        this.color = color;
    }

    public abstract void drawFigure(int border);

    public abstract void modifyBorder(int border, int increment);
}
