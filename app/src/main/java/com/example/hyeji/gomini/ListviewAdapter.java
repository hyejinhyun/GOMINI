package com.example.hyeji.gomini;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.*;

import com.bumptech.glide.Glide;

import java.util.*;

public class ListviewAdapter extends BaseAdapter {
    Context context;
    ArrayList<Listviewitem> list_itemArrayList;
    ViewHolder viewholder;

    class ViewHolder{
        TextView content_textView;
        ImageView imageView;
    }

    public ListviewAdapter(Context context, ArrayList<Listviewitem> list_itemArrayList) {
        this.context = context;
        this.list_itemArrayList = list_itemArrayList;
    }

    @Override
    public int getCount() {
        return this.list_itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list_itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, null);

            viewholder = new ViewHolder();
            viewholder.content_textView = (TextView) convertView.findViewById(R.id.content_textView);
            viewholder.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(viewholder);
        }

        else{
            viewholder = (ViewHolder)convertView.getTag();
        }

        Listviewitem listviewitem = list_itemArrayList.get(position);

        viewholder.content_textView.setText(list_itemArrayList.get(position).getContent());
        Glide.with(context).load(list_itemArrayList.get(position).getImage()).into(viewholder.imageView);

        return convertView;
    }
}
