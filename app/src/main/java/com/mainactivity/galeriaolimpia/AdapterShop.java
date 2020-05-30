package com.mainactivity.galeriaolimpia;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdapterShop extends ArrayAdapter<Shop> {

    private Activity activity;
    private ArrayList<Shop> shops;
    private LayoutInflater inflater = null; //static


    public AdapterShop(Activity activity, int resourceId, ArrayList<Shop> shops) {
        super(activity, resourceId, shops);

        try {
            this.activity = activity;
            this.shops = shops;
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        } catch (Exception e) {

        }
    }

    public int getCount() {
        return shops.size();
    }

    @Override
    public int getPosition(@Nullable Shop item) {
        return super.getPosition(item);
    }

    @Nullable
    @Override
    public Shop getItem(int position) {
        return super.getItem(position);
    }

    public static class ViewHolder {
        public ImageView displayView;
        public TextView tvName;
        public TextView tvInfo;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        final ViewHolder holder;

        try {
            if (convertView == null) {
                view = inflater.inflate(R.layout.listview_single_element, null);
                holder = new ViewHolder();
                holder.displayView = view.findViewById(R.id.img);
                holder.tvName = view.findViewById(R.id.tvName);
                holder.tvInfo = view.findViewById(R.id.tvInfo);

                view.setTag(holder);
            } else {
                holder = (ViewHolder) view.getTag();
            }

            holder.displayView.setImageResource(shops.get(position).getImg());
            holder.tvName.setText(shops.get(position).getCategory());
            holder.tvInfo.setText(shops.get(position).getOpenHr());

        } catch (Exception e) {

        }

        return view;
    }
}
