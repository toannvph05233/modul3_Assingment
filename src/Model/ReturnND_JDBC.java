package Model;

import Controller.NguoiDung;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ReturnND_JDBC {
    MyJDBC myJDBC = new MyJDBC();

    public ArrayList<NguoiDung> return_ListND() {
        try {
            ArrayList<NguoiDung> listND = new ArrayList<>();
            Connection collection = myJDBC.connecJDBC();
            Statement statement = collection.createStatement();
            String sql = "select * \n" +
                    "from nguoidung inner join loaiacout on nguoidung.iduser = loaiacout.iduser ";
            ResultSet resultset = statement.executeQuery(sql);

            while (resultset.next()) {
                NguoiDung nguoiDung;
                String iduser = resultset.getString(1);
                String password = resultset.getString(2);
                String fullname = resultset.getString(3);
                int sdt = resultset.getInt(4);
                int idloaiuser = resultset.getInt(5);
                String loaiuser = resultset.getString(7);

                nguoiDung = new NguoiDung(iduser,password,fullname,sdt,idloaiuser,loaiuser);
                listND.add(nguoiDung);
            }
            return listND;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
