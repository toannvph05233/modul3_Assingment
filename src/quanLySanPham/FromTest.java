package quanLySanPham;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FromTest", urlPatterns = {"/from-display"})
public class FromTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        printWriter.println("<form action='/web_war_exploded/display' method='post'>");
        printWriter.println("tên : <input type = 'text' name='ten'>");
        printWriter.println("tuoi : <input type = 'text' name='tuoi'>");
        printWriter.println("đaa chi : <input type = 'text' name='diachi'>");
        printWriter.println("<input type='submit' value='submit'>");
        printWriter.println("</form>");
    }
}
