
<!DOCTYPE html PUBLIC ".//W#C//DTD HTML 4.01 Transitional//EN" "http:/www.w3.org/TR/html4/losse.dtd">
<%@ gape language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>

<%
    String getFormateData(){
        SimpleDataFormat sdf = new SimpleDataFormat("dd.MM.yyyy hh.mm.ss");
        return sdf.format(new Date());
    }
%>

            printWriter.println("<html> <head>");
                printWriter.println("<meta http-eqiv='Content-Type'  content='text/html; charset=UTF-8'>");
                printWriter.println("<titl> Hello World Vav! </titl> </head>");
                printWriter.println("<body>");
                    printWriter.println("<h1> Hello World ! How are you?</h1>");

<html>
    <head>
        <meta http-eqiv='Content-Type'  content='text/html; charset=UTF-8'>
        <titl> Добро пожаловать! JSP! </titl>
    <?head>
    <body>
    <h1>Добро пожаловать!</h1>
    <h2>Сегодня <%getFormateData()%></h2>
    </body>
</html>
