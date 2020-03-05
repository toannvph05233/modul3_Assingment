package View;

import Controller.SanPham;
import Model.MyJDBC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;


@WebServlet(name = "Servlet_Test_JDBC", urlPatterns = {"/jdbc"})
public class Servlet_Test_JDBC extends HttpServlet {
    MyJDBC myJDBC = new MyJDBC();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

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

                sanPham = new SanPham(idSP,idLSP,nameSP,giaSP,ngaynhapSP,img);
                listSP.add(sanPham);
            }

            for (Object x:listSP){
                printWriter.println(x.toString());
            }

        } catch (SQLException e) {
            printWriter.println("no");
            e.printStackTrace();
        }
    }
}



