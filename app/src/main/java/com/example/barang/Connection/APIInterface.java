package com.example.barang.Connection;



import com.example.barang.Model.DataBarangModel;
import com.example.barang.Model.DataOrderModel;
import com.example.barang.Model.DataPenerimaanBarangmodel;
import com.example.barang.Model.DataPengeluaranModel;
import com.example.barang.Model.DataPermintaanModel;
import com.example.barang.Model.DataSuplierModel;
import com.example.barang.Model.DataUserModel;
import com.example.barang.Model.UserModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {


    @POST("/index.php?title=LOGIN")
    Call<UserModel> login(@Query("username") String username);
    @GET("/index.php?title=GET_USER")
    Call<DataUserModel> get_user();
    @POST("/index.php?title=ADD_USER")
    Call<String> add_user(@Query("nama_user") String username,@Query("password") String password,@Query("status_name") String status_name);

    @POST("/index.php?title=EDIT_USER")
    Call<String> edit_user(@Query("nama_user") String username,@Query("password") String password,@Query("status_name") String status_name,@Query("kode_user") String kode_user);

    @POST("/index.php?title=DELETE_USER")
    Call<String> delete_user(@Query("kode_user") String kode_user);
    @GET("/index.php?title=GET_SUPLIER")
    Call<DataSuplierModel> get_suplier();
    @POST("/index.php?title=ADD_SUPLIER")
    Call<String> add_suplier(@Query("kode_suplier") String kode_suplier,@Query("nama_suplier") String nama_suplier,@Query("alamat") String alamat,@Query("no_telpon") String no_telpon);

    @POST("/index.php?title=EDIT_SUPLIER")
    Call<String> edit_suplier(@Query("kode_suplier") String kode_suplier,@Query("nama_suplier") String nama_suplier,@Query("alamat") String alamat,@Query("no_telpon") String no_telpon);

    @POST("/index.php?title=DELETE_SUPLIER")
    Call<String> delete_suplier(@Query("kode_suplier") String kode_suplier);


    ///////////////////////
    @GET("/index.php?title=GET_BARANG")
    Call<DataBarangModel> get_barang();

    @POST("/index.php?title=ADD_BARANG")
    Call<String> add_barang(@Query("kode_barang") String kode_barang,@Query("nama_barang") String nama_barang,@Query("harga_beli") String harga_beli,@Query("harga_jual") String harga_jual,@Query("stok") String stok);

    @POST("/index.php?title=EDIT_BARANG")
    Call<String> edit_barang(@Query("kode_barang") String kode_barang,@Query("nama_barang") String nama_barang,@Query("harga_beli") String harga_beli,@Query("harga_jual") String harga_jual,@Query("stok") String stok);

    @POST("/index.php?title=DELETE_BARANG")
    Call<String> delete_barang(@Query("kode_barang") String kode_barang);


    ///////////////////////
    @GET("/index.php?title=GET_PENERIMAAN_BARANG")
    Call<DataPenerimaanBarangmodel> get_penerimaan_barang();

    @POST("/index.php?title=ADD_PENERIMAAN_BARANG")
    Call<String> add_penerimaan_barang(@Query("no_surat_jalan") String no_surat_jalan,@Query("tanggal_penerimaan") String tanggal_penerimaan,@Query("kode_user") String kode_user,@Query("nama_barang") String nama_barang,@Query("jumlah_penerimaan") String jumlah_penerimaan);

    @POST("/index.php?title=EDIT_PENERIMAAN_BARANG")
    Call<String> edit_penerimaan_barang(@Query("no_surat_jalan") String no_surat_jalan,@Query("tanggal_penerimaan") String tanggal_penerimaan,@Query("kode_user") String kode_user,@Query("nama_barang") String nama_barang,@Query("jumlah_penerimaan") String jumlah_penerimaan);

    @POST("/index.php?title=DELETE_PENERIMAAN_BARANG")
    Call<String> delete_penerimaan_barang(@Query("no_surat_jalan") String no_surat_jalan);


    ///////////////////////
    @GET("/index.php?title=GET_PENGELUARAN")
    Call<DataPengeluaranModel> get_pengeluaran();

    @POST("/index.php?title=ADD_PENGELUARAN")
    Call<String> add_pengeluaran(@Query("no_pengeluaran") String no_pengeluaran,@Query("tanggal_pengeluaran") String tanggal_pengeluaran,@Query("no_permintaan") String no_permintaan,@Query("nama_barang") String nama_barang,@Query("nama_pelanggan") String nama_pelanggan);

    @POST("/index.php?title=EDIT_PENGELUARAN")
    Call<String> edit_pengeluaran(@Query("no_pengeluaran") String no_pengeluaran,@Query("tanggal_pengeluaran") String tanggal_pengeluaran,@Query("no_permintaan") String no_permintaan,@Query("nama_barang") String nama_barang,@Query("nama_pelanggan") String nama_pelanggan);

    @POST("/index.php?title=DELETE_PENGELUARAN")
    Call<String> delete_pengeluaran(@Query("no_pengeluaran") String no_pengeluaran);


    ///////////////////////
    @GET("/index.php?title=GET_PERMINTAAN")
    Call<DataPermintaanModel> get_permintaan();

    @POST("/index.php?title=ADD_PERMINTAAN")
    Call<String> add_permintaan(@Query("no_permintaan") String no_permintaan,@Query("tanggal_permintaan") String tanggal_permintaan,@Query("jumlah_permintaan") String jumlah_permintaan,@Query("kode_barang") String kode_barang,@Query("kode_user") String kode_user,@Query("status_permintaan") String status_permintaan);

    @POST("/index.php?title=EDIT_PERMINTAAN")
    Call<String> edit_permintaan(@Query("no_permintaan") String no_permintaan,@Query("tanggal_permintaan") String tanggal_permintaan,@Query("jumlah_permintaan") String jumlah_permintaan,@Query("kode_barang") String kode_barang,@Query("kode_user") String kode_user,@Query("status_permintaan") String status_permintaan);

    @POST("/index.php?title=DELETE_PERMINTAAN")
    Call<String> delete_permintaan(@Query("no_permintaan") String no_permintaan);


    ///////////////////////
    @GET("/index.php?title=GET_ORDER")
    Call<DataOrderModel> get_order();

    @POST("/index.php?title=ADD_ORDER")
    Call<String> add_order(@Query("id_order") String id_order,@Query("kode_barang") String kode_barang,@Query("tanggal") String tanggal,@Query("jumlah_diperlukan") String jumlah_diperlukan,@Query("kode_user") String kode_user);

    @POST("/index.php?title=EDIT_ORDER")
    Call<String> edit_order(@Query("id_order") String id_order,@Query("kode_barang") String kode_barang,@Query("tanggal") String tanggal,@Query("jumlah_diperlukan") String jumlah_diperlukan,@Query("kode_user") String kode_user);

    @POST("/index.php?title=DELETE_ORDER")
    Call<String> delete_order(@Query("id_order") String id_order);

}
