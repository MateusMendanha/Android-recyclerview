package com.mateusmm.trabalhoandroidmateusmm;

public class List extends Abstract{

    public List(String texto) {
        super(texto);
    }

    @Override
    public int getType() {
        return LIST_TYPE;
    }

}
