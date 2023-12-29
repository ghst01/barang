<?php
    function get_barang(){
        global $con;
        $data_barang = $con->query("select * from barang");
        $data = array();
        $datas=array();
        while($d = $data_barang->fetch_assoc()){
            array_push($datas,$d);

        }
        $data['data']=$datas;
        return json_encode($data);
    }
    function add_barang(){
        global $con;
        $con->query("
            insert into barang (kode_barang,nama_barang,harga_beli,harga_jual,stok)
            values ('".$_GET['kode_barang']."','".$_GET['nama_barang']."','".$_GET['harga_beli']."','".$_GET['harga_jual']."','".$_GET['stok']."')
        ");
        return json_encode("Data Berhasil Ditambahkan");
    }
    function edit_barang(){
        global $con;
        $con->query("
            update barang set kode_barang='".$_GET['kode_barang']."'
            , nama_barang= '".$_GET['nama_barang']."'
            , harga_beli='".$_GET['harga_beli']."'
            , harga_jual='".$_GET['harga_jual']."'
            , stok='".$_GET['stok']."'
            where kode_barang = '".$_GET['kode_barang']."'
        ");
        return json_encode("Data Berhasil Diubah");
    }
    function delete_barang(){
        global $con;
        $con->query("
            delete from barang where kode_barang = '".$_GET['kode_barang']."'
        ");
        return json_encode("Data Berhasil Dihapus");
    }

    
    function check_login(){
        if(isset($_SESSION['id_donatur'])){
            return json_encode(array(
                "id" => $_SESSION['id'],
                "barangname" => $_SESSION['barangname'],
                "password" => $_SESSION['password'],
                "role" => $_SESSION['role'],
                "status" => "success"
            ));
        }
        else{
            return json_encode(array(
                "id" => "a",
                "barangname" => "a",
                "password" => "a",
                "status" => "failed"
            ));
        }
    }
