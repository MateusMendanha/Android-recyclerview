package com.mateusmm.trabalhoandroidmateusmm;

public class Grid extends Abstract{

    public Grid(String texto) {
        super(texto);
    }

    @Override
    public int getType() {
        return GRID_TYPE;
    }
}
