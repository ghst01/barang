package com.example.barang;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.barang.Adapter.BarangAdapter;
import com.example.barang.Connection.APIClient;
import com.example.barang.Connection.APIInterface;
import com.example.barang.Model.BarangModel;
import com.example.barang.Model.DataBarangModel;
import com.example.barang.Model.DataSuplierModel;
import com.example.barang.Model.SuplierModel;
import com.example.barang.Model.UserModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BarangActivity    extends AppCompatActivity {
    private BarangModel user;
    BarangAdapter adapter;
    com.google.android.material.floatingactionbutton.FloatingActionButton addButton;
    ListView KDCard;
    ArrayList<BarangModel> KDModelArrayList;
    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barang_layout);
        //Bundle extras = getIntent().getExtras();
        //user = (UserModel) extras.get("user");


        // calling this activity's function to
        // use ActionBar utility methods
        apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<DataBarangModel> call3 = apiInterface.get_barang();
        call3.enqueue(new Callback<DataBarangModel>() {
            @Override
            public void onResponse(Call<DataBarangModel> call, Response<DataBarangModel> response) {


                DataBarangModel userList = response.body();
                Log.d("tes",response.body().toString());

                KDModelArrayList = userList.getData();
                KDCard = findViewById(R.id.gridCard);

                adapter = new BarangAdapter(getApplicationContext(), KDModelArrayList, user, BarangActivity.this);

                KDCard.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<DataBarangModel> call, Throwable t) {
                call.cancel();
            }
        });


        addButton = findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BarangActivity.this, AddBarangActivity.class);
                //i.putExtra("user",user);
                startActivity(i);
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
            Intent i = new Intent(BarangActivity.this, BarangActivity.class);
            i.putExtra("user", user);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
