package com.mateusmm.trabalhoandroidmateusmm;

public abstract class Abstract {

    public static final int GRID_TYPE = 0;
    public static final int LIST_TYPE = 1;

    private String texto;

    public Abstract(String texto){
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    abstract public int getType();
}
