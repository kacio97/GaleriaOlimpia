package com.mainactivity.galeriaolimpia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.TotalCaptureResult;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

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

//    public static class ViewHolderShop {
//        public ImageView logo;
//        public ImageView photo;
//        public TextView shopName;
//        public EditText phone;
//        public EditText description;
//    }


    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
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

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//               final ViewHolderShop holderShop = new ViewHolderShop();

//               v = inflater.inflate(R.layout.shop_details_layout, null);

//               holderShop.logo = v.findViewById(R.id.ivLogo);
//               holderShop.photo = v.findViewById(R.id.ivPic);
//               holderShop.shopName = v.findViewById(R.id.tvShopName);
//               holderShop.phone = v.findViewById(R.id.etPhone);
//               holderShop.description = v.findViewById(R.id.etDescription);

//               v.setTag(holderShop);

                String info = "LIST VIEW CLICK LISTENER at " + position + " position";
                Toast toast = Toast.makeText(getContext(), info, Toast.LENGTH_LONG);
                toast.show();

//                holderShop.logo.setImageResource(shops.get(position).getImg());
//                holderShop.photo.setImageResource(shops.get(position).getImgShop());
//                holderShop.shopName.setText(shops.get(position).getCategory());
//                holderShop.phone.setText(shops.get(position).getPhone());
//                holderShop.description.setText(shops.get(position).getDescription());



//                activity.setContentView(v);

                Intent intent = new Intent(getContext(),ShopDetailsActivity.class);
                intent.putExtra("logo", shops.get(position).getImg());
                intent.putExtra("shopImg",shops.get(position).getImgShop());
                intent.putExtra("category",shops.get(position).getCategory());
                intent.putExtra("phone",shops.get(position).getPhone());
                intent.putExtra("description",shops.get(position).getDescription());

                activity.startActivity(intent);

            }
        });

        return view;
    }
}
