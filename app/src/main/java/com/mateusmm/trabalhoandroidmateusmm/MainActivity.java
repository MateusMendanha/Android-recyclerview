package com.mateusmm.trabalhoandroidmateusmm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Abstract> itens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        itens = new ArrayList<>();
        itens.add(new Grid("Filme1", R.drawable.a));
        itens.add(new Grid("Filme2", R.drawable.b));
        itens.add(new Grid("Filme3", R.drawable.c));
        itens.add(new Grid("Filme4", R.drawable.d));
        itens.add(new com.mateusmm.trabalhoandroidmateusmm.List("Andrew Russell Garfield"));
        itens.add(new com.mateusmm.trabalhoandroidmateusmm.List("Tom Holland"));
        itens.add(new com.mateusmm.trabalhoandroidmateusmm.List("Cillian Murphy"));
        itens.add(new com.mateusmm.trabalhoandroidmateusmm.List("Robert Downey Jr."));


        GridLayoutManager manager = new GridLayoutManager(this, 2);
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                Abstract item = itens.get(position);
                switch (item.getType()) {
                    case Abstract.GRID_TYPE:
                        // grid items to take 1 column
                        return 1;
                    default:
                        // list items to take 2 columns
                        return 2;
                }
            }
        });

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.lst_items);
        recyclerView.setLayoutManager(manager);

        Adapter adapter = new Adapter(this, itens);
        recyclerView.setAdapter(adapter);

    }
}