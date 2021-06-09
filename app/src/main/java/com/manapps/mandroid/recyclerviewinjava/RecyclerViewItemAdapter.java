package com.manapps.mandroid.recyclerviewinjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewItemAdapter extends RecyclerView.Adapter<RecyclerViewItemAdapter.ItemViewHolder> {

    class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView itemLabel;

        public ItemViewHolder(View itemView) {
            super(itemView);
            itemLabel = (TextView) itemView.findViewById(R.id.item_label);
        }
    }

    private Context context;
    private List<DataModel> dataModelList;

    public RecyclerViewItemAdapter(Context context, List<DataModel> dataModelList) {
        this.context = context;
        this.dataModelList = dataModelList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        try {
            DataModel dataModel = dataModelList.get(position);
            holder.itemLabel.setText(dataModel.getTitle());
        } catch (Exception e) {
        }

        holder.itemView.setOnClickListener(view -> Toast.makeText(context, dataModelList.get(position).getTitle() + ": Clicked!!", Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    private void addData() {

    }

}


