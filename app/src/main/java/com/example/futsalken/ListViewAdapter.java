package com.example.futsalken;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


public class ListViewAdapter extends ArrayAdapter<FutsalItem> {

    private List<FutsalItem> futsalItemList;

    private Context context;

    public ListViewAdapter(List<FutsalItem> futsalItemList, Context context) {
        super(context, R.layout.list_item, futsalItemList);
        this.futsalItemList = futsalItemList;
        this.context = context;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View listViewItem = inflater.inflate(R.layout.list_item, null, true);

        TextView textViewName = listViewItem.findViewById(R.id.textViewName);
        TextView textViewAddress = listViewItem.findViewById(R.id.textViewAddress);
        TextView textViewPhone = listViewItem.findViewById(R.id.textViewPhone);
        ImageView imgVIew = listViewItem.findViewById(R.id.Poster);


        FutsalItem futsalItem = futsalItemList.get(position);

        textViewName.setText(futsalItem.getName());
        textViewAddress.setText(futsalItem.getAddress());
        textViewPhone.setText(futsalItem.getPhone());

        Glide.with(context).load(futsalItem.getPoster()).into(imgVIew);

        return listViewItem;
    }
}