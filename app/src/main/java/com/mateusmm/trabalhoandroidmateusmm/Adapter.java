package com.mateusmm.trabalhoandroidmateusmm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static class GridViewHolder extends RecyclerView.ViewHolder {
        TextView txt_label;

        public GridViewHolder(View itemView){
            super(itemView);
            txt_label = (TextView) itemView.findViewById(R.id.txt_label);
        }
    }
    private class ListViewHolder extends RecyclerView.ViewHolder {
        TextView txt_label;

        public ListViewHolder(View itemView) {
            super(itemView);
            txt_label = (TextView) itemView.findViewById(R.id.txt_label);
        }
    }
    private Context context;
    private LayoutInflater layoutInflater;

    private java.util.List<Abstract> itens;

    public Adapter(Context aContext, java.util.List<Abstract> item) {
        context = aContext;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        itens = item;

    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
    @Override
    public int getItemViewType(int position) {
        return itens.get(position).getType();

    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == Abstract.GRID_TYPE) {
            View itemView = layoutInflater.inflate(R.layout.view_grid, parent, false);
            // work here if you need to control height of your items
            // keep in mind that parent is RecyclerView in this case
            int height = parent.getMeasuredHeight() / 4;
            itemView.setMinimumHeight(height);
            return new GridViewHolder(itemView);
        } else {
            View itemView = layoutInflater.inflate(R.layout.view_list, parent, false);
            return new ListViewHolder(itemView);
        }
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int position) {
        int type = getItemViewType(position);
        if (type == Abstract.GRID_TYPE) {
            Grid item = (Grid) itens.get(position);
            GridViewHolder holder = (GridViewHolder) viewHolder;
            holder.txt_label.setText(item.getTexto());
        } else {
            List item = (List) itens.get(position);
            ListViewHolder holder = (ListViewHolder) viewHolder;
            holder.txt_label.setText(item.getTexto());
        }
    }
}
