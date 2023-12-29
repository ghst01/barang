package com.example.barang.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.barang.EditBarangActivity;
import com.example.barang.Model.BarangModel;
import com.example.barang.Model.SuplierModel;
import com.example.barang.Model.UserModel;
import com.example.barang.R;

import java.util.ArrayList;

public class BarangAdapter    extends ArrayAdapter<BarangModel> {
    BarangModel user;
    Context activity;
    public BarangAdapter(@NonNull Context context, ArrayList<BarangModel> courseModelArrayList, BarangModel user, Context activity) {
        super(context, 0, courseModelArrayList);
        this.user = user;
        this.activity = activity;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.barang_card, parent, false);
        }

        BarangModel courseModel = getItem(position);
        LinearLayout d = listitemView.findViewById(R.id.layout);
        TextView a = listitemView.findViewById(R.id.nama_barang);
        TextView b = listitemView.findViewById(R.id.harga_beli);
        TextView c = listitemView.findViewById(R.id.harga_jual);

        a.setText("Nama Barang : "+courseModel.getNama_barang());
        b.setText("Harga Beli : "+String.valueOf(courseModel.getHarga_beli()));
        c.setText("Harga Jual : "+courseModel.getHarga_jual());

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(activity, EditBarangActivity.class);
                i.putExtra("kode_barang",courseModel.getKode_barang());
                i.putExtra("nama_barang",courseModel.getNama_barang());
                i.putExtra("harga_beli",courseModel.getHarga_beli());
                i.putExtra("harga_jual",courseModel.getHarga_jual());
                i.putExtra("stok",courseModel.getStok());
                activity.startActivity(i);
            }
        });




        return listitemView;
    }
}
