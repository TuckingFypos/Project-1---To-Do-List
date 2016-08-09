package com.example.tuckingfypos.to_do_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TuckingFypos on 7/25/16.
 */
public class ToDoListAdapter extends ArrayAdapter<ToDoItem> {
    List<ToDoItem> items;

    public ToDoListAdapter(Context context, List<ToDoItem> items) {
        super(context, android.R.layout.simple_list_item_2, items);
        this.items = items;
    }

    @Override
    public int getCount() {
        if(items.size()!=0){return items.size();}else{

        return 0;}
    }

    @Override
    public ToDoItem getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ToDoItem item = items.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
        }

        TextView itemName = (TextView) convertView.findViewById(android.R.id.text1);
        TextView itemDescription = (TextView) convertView.findViewById(android.R.id.text2);

        itemName.setText(item.getmTitle());
        itemDescription.setText(item.getmDescription());

        return convertView;
    }
}
