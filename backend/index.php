<?php
    session_start();
    $con = new mysqli("localhost","root","","db_barang");
    if(isset($_GET['title'])){
        if($_GET['title']=="LOGIN"){
            require("login.php");
            print_r(login_proses());
        }
        else if($_GET['title']=="GET_USER"){
            require("user.php");
            print_r(get_user());
        }
        else if($_GET['title']=="ADD_USER"){
            require("user.php");
            print_r(add_user());
        }
        else if($_GET['title']=="EDIT_USER"){
            require("user.php");
            print_r(edit_user());
        }
        else if($_GET['title']=="DELETE_USER"){
            require("user.php");
            print_r(delete_user());
        }

        
        else if($_GET['title']=="GET_SUPLIER"){
            require("suplier.php");
            print_r(get_suplier());
        }
        else if($_GET['title']=="ADD_SUPLIER"){
            require("suplier.php");
            print_r(add_suplier());
        }
        else if($_GET['title']=="EDIT_SUPLIER"){
            require("suplier.php");
            print_r(edit_suplier());
        }
        else if($_GET['title']=="DELETE_SUPLIER"){
            require("suplier.php");
            print_r(delete_suplier());
        }


        
        else if($_GET['title']=="GET_BARANG"){
            require("barang.php");
            print_r(get_barang());
        }
        else if($_GET['title']=="ADD_BARANG"){
            require("barang.php");
            print_r(add_barang());
        }
        else if($_GET['title']=="EDIT_BARANG"){
            require("barang.php");
            print_r(edit_barang());
        }
        else if($_GET['title']=="DELETE_BARANG"){
            require("barang.php");
            print_r(delete_barang());
        }


        
        else if($_GET['title']=="GET_PENERIMAAN_BARANG"){
            require("penerimaan_barang.php");
            print_r(get_penerimaan_barang());
        }
        else if($_GET['title']=="ADD_PENERIMAAN_BARANG"){
            require("penerimaan_barang.php");
            print_r(add_penerimaan_barang());
        }
        else if($_GET['title']=="EDIT_PENERIMAAN_BARANG"){
            require("penerimaan_barang.php");
            print_r(edit_penerimaan_barang());
        }
        else if($_GET['title']=="DELETE_PENERIMAAN_BARANG"){
            require("penerimaan_barang.php");
            print_r(delete_penerimaan_barang());
        }


        
        else if($_GET['title']=="GET_PENGELUARAN"){
            require("pengeluaran.php");
            print_r(get_pengeluaran());
        }
        else if($_GET['title']=="ADD_PENGELUARAN"){
            require("pengeluaran.php");
            print_r(add_pengeluaran());
        }
        else if($_GET['title']=="EDIT_PENGELUARAN"){
            require("pengeluaran.php");
            print_r(edit_pengeluaran());
        }
        else if($_GET['title']=="DELETE_PENGELUARAN"){
            require("pengeluaran.php");
            print_r(delete_pengeluaran());
        }


        
        else if($_GET['title']=="GET_PERMINTAAN"){
            require("permintaan.php");
            print_r(get_permintaan());
        }
        else if($_GET['title']=="ADD_PERMINTAAN"){
            require("permintaan.php");
            print_r(add_permintaan());
        }
        else if($_GET['title']=="EDIT_PERMINTAAN"){
            require("permintaan.php");
            print_r(edit_permintaan());
        }
        else if($_GET['title']=="DELETE_PERMINTAAN"){
            require("permintaan.php");
            print_r(delete_permintaan());
        }


        
        else if($_GET['title']=="GET_ORDER"){
            require("order.php");
            print_r(get_order());
        }
        else if($_GET['title']=="ADD_ORDER"){
            require("order.php");
            print_r(add_order());
        }
        else if($_GET['title']=="EDIT_ORDER"){
            require("order.php");
            print_r(edit_order());
        }
        else if($_GET['title']=="DELETE_ORDER"){
            require("order.php");
            print_r(delete_order());
        }


        else if($_POST['title']=="LOGIN_TRUE"){
            require("login.php");
            print_r(check_login());
        }
        else if($_POST['title']=="ADD"){
            require("add.php");
            print_r(add());
        }
        else if($_POST['title']=="GET_HISTORY"){
            require("add.php");
            print_r(get_all());
        }
    }
