package com.mateusmm.trabalhoandroidmateusmm;

public class Grid extends Abstract{
    private int imagem;
    public Grid(String texto, int img) {
        super(texto);
        this.imagem = img;
    }

    public int getImagem() {
        return imagem;
    }

    @Override
    public int getType() {
        return GRID_TYPE;
    }
}
