package com.example.barang;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.barang.Connection.APIClient;
import com.example.barang.Connection.APIInterface;
import com.example.barang.Model.UserModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EditBarangActivity  extends AppCompatActivity {
    private UserModel user;
    EditText kode_barang;
    EditText nama_barang;
    EditText harga_beli;
    EditText harga_jual;
    EditText stok;
    Button edit,hapus;
    String kode_barangs;
    String nama_barangs;
    String harga_belis;
    String harga_juals;
    String stoks;
    com.google.android.material.floatingactionbutton.FloatingActionButton addButton;
    ListView KDCard;
    ArrayList<UserModel> KDModelArrayList;
    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barang_edit);
        Bundle extras = getIntent().getExtras();
        kode_barangs = (String) extras.get("kode_barang");
        nama_barangs = (String) extras.get("nama_barang");
        harga_belis = (String) extras.get("harga_beli");
        harga_juals = (String) extras.get("harga_jual");
        stoks = (String) extras.get("stok");



        kode_barang =  findViewById(R.id.kode_barang);
        nama_barang =  findViewById(R.id.nama_barang);
        harga_beli =  findViewById(R.id.harga_beli);
        harga_jual =  findViewById(R.id.harga_jual);
        stok =  findViewById(R.id.stok);
        kode_barang.setText(kode_barangs);
        nama_barang.setText(nama_barangs);
        harga_beli.setText(harga_belis);
        harga_jual.setText(harga_juals);
        stok.setText(stoks);


        edit = findViewById(R.id.edit);
        hapus = findViewById(R.id.hapus);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apiInterface = APIClient.getClient().create(APIInterface.class);
                String a = nama_barang.getText().toString();
                String b = harga_beli.getText().toString();
                String c = harga_jual.getText().toString();
                String d = stok.getText().toString();
                String e = kode_barang.getText().toString();
                Call<String> call3 = apiInterface.edit_barang(a,b,c,d,e);
                call3.enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {
                        String userList = response.body();
                        Toast.makeText(getApplicationContext(), userList,
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(EditBarangActivity.this, BarangActivity.class);
                        //i.putExtra("user",user);
                        startActivity(i);
                    }

                    @Override
                    public void onFailure(Call<String> call, Throwable t) {
                        call.cancel();
                    }
                });


            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apiInterface = APIClient.getClient().create(APIInterface.class);

                String d = kode_barang.getText().toString();


                Call<String> call = apiInterface.delete_barang(d);
                call.enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {
                        String userList = response.body();
                        Toast.makeText(getApplicationContext(), userList,
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(EditBarangActivity.this, BarangActivity.class);
                        //i.putExtra("user",user);
                        startActivity(i);
                    }

                    @Override
                    public void onFailure(Call<String> call, Throwable t) {
                        call.cancel();
                    }
                });

            }
        });







    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        MenuItem item = menu.findItem(R.id.logout);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == android.R.id.home) {
            this.finish();
            return true;
        } else if (itemId == R.id.barangMenu) {
            Intent i = new Intent(EditBarangActivity.this, BarangActivity.class);
            i.putExtra("user",user);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
