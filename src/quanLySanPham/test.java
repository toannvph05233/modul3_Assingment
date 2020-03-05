package quanLySanPham;

import Controller.SanPham;
import Model.ReturnSP_JDBC;

import java.util.ArrayList;

public class test {



    public static void main(String[] args) {
        ReturnSP_JDBC return_jdbc = new ReturnSP_JDBC();
        ArrayList<SanPham> list = return_jdbc.return_ListSP();

        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }

    }
}
