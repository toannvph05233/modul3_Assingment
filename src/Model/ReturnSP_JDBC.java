package Model;

import Controller.SanPham;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class ReturnSP_JDBC {
    MyJDBC myJDBC = new MyJDBC();

    public ArrayList<SanPham> return_ListSP() {
        try {
            ArrayList<SanPham> listSP = new ArrayList<>();
            Connection collection = myJDBC.connecJDBC();
            Statement statement = collection.createStatement();
            String sql = "SELECT * FROM sanpham";
            ResultSet resultset = statement.executeQuery(sql);

            while (resultset.next()) {
                SanPham sanPham;
                String idSP = resultset.getString(1);
                String idLSP = resultset.getString(2);
                String nameSP = resultset.getString(3);
                Float giaSP = resultset.getFloat(4);
                Date ngaynhapSP = resultset.getDate(5);
                String img = resultset.getString(6);

                sanPham = new SanPham(idSP, idLSP, nameSP, giaSP, ngaynhapSP, img);
                listSP.add(sanPham);
            }
            return listSP;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
