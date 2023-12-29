<?php
    function get_all(){
        global $con;
        $data_user = $con->query("select * from hasil");
        $data = array('data'=>[]);
        while($d = $data_user->fetch_assoc()){
            array_push($data['data'],$d);
        }
        return json_encode($data);
    }

    function add(){
        global $con;
        $data_user = $con->query("
            INSERT INTO hasil(nama,umur,hasil,id_user)
            values ('".$_POST['nama']."','".$_POST['umur']."','".$_POST['hasil']."','".$_POST['id']."')
        ");
        return json_encode(array(
            "message" => "Analisa Berhasil Dilakukan",
            "status" => "success"
        ));
    }
