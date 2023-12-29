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

import com.example.barang.Adapter.BarangAdapter;
import com.example.barang.Connection.APIClient;
import com.example.barang.Connection.APIInterface;
import com.example.barang.Model.BarangModel;
import com.example.barang.Model.UserModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddBarangActivity  extends AppCompatActivity {
    private BarangModel user;
    BarangAdapter adapter;
    EditText kode_barang;
    EditText nama_barang;
    EditText harga_beli;
    EditText harga_jual;
    EditText stok;
    Button add;
    com.google.android.material.floatingactionbutton.FloatingActionButton addButton;
    ListView KDCard;
    ArrayList<UserModel> KDModelArrayList;
    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barang_add);
        //Bundle extras = getIntent().getExtras();
        //user = (UserModel) extras.get("user");


        // calling this activity's function to
        // use ActionBar utility methods
        kode_barang =  findViewById(R.id.kode_barang);
        nama_barang =  findViewById(R.id.nama_barang);
        harga_beli =  findViewById(R.id.harga_beli);
        harga_jual =  findViewById(R.id.harga_jual);
        stok =  findViewById(R.id.stok);

        add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apiInterface = APIClient.getClient().create(APIInterface.class);
                String a = kode_barang.getText().toString();
                String b = nama_barang.getText().toString();
                String c = harga_beli.getText().toString();
                String d = harga_jual.getText().toString();
                String e = stok.getText().toString();
                Call<String> call3 = apiInterface.add_barang(a,b,c,d,e);
                call3.enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {
                        String userList = response.body();
                        Toast.makeText(getApplicationContext(), userList,
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(AddBarangActivity.this, BarangActivity.class);
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
            Intent i = new Intent(AddBarangActivity.this, BarangActivity.class);
            i.putExtra("user",user);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}