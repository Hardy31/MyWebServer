package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //        устанавливаем  тип возвращаемого контента и кодировку
        resp.setContentType("text/html; charset=UTF-8");

        //        получаем ссылку  на выходной поток и заполняем в него наш ответ
        try(PrintWriter printWriter = resp.getWriter()){
            printWriter.println("<!DOCTYPE html>");
            printWriter.println("<html> <head>");
                printWriter.println("<meta http-eqiv='Content-Type'  content='text/html; charset=UTF-8'>");
                printWriter.println("<titl> Hello World Vav! </titl> </head>");
                printWriter.println("<body>");
                    printWriter.println("<h1> Hello World ! How are you?</h1>");
                    printWriter.println("<p> Request URI: "+ req.getRequestURI() + "</p>");
                    printWriter.println("<p> Protocol   : "+ req.getProtocol() + "</p>");
                    printWriter.println("<p> PathInfo   : "+ req.getPathInfo() + "</p>");
                    printWriter.println("<p> RemoteAddress: "+ req.getRemoteAddr() + "</p>");
                    printWriter.println("<p> RemoteUser   : "+ req.getRemoteUser() + "</p>");
                    printWriter.println("<p> RemotePort   : "+ req.getRemotePort() + "</p>");

                    printWriter.println("<p> Ramdom Numer   : <strong>"+ Math.random() + "</strong></p>");
                printWriter.println("</body>");
            printWriter.println("</html>");
            req.getRequestDispatcher("/");

        }
    }
}
