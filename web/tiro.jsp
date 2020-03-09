<%-- 
    Document   : tiro
    Created on : 09-mar-2020, 19:19:36
    Author     : DAW202
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tiro Parabólico</h1>
        <% 
        ArrayList angulos = (ArrayList) request.getAttribute("angulos"); %>
        
        <form action="tiro" method="post">
            <label for="velocidad">Velocidad(m/s)</label><input type="text" name="velocidad" value="" id="nombre">
            <br><br><label for="angulo">Angulo:</label>
            <select name="angulo" id="angulo">
                       <% for (int i=0; i<angulos.size(); i++) {
                       String selec="";
                       Object angulo = angulos.get(i);
                       
                       /*if ( angulos.equals(tiempo) ) {
                           selec = "selected";
                       }*/
                       %>
                       <option value="<%=angulo %>" <%=selec%> ><%=angulo %></option>
                        
                            
                       <% } %>     
            </select>
            <br>
            <input type="submit" value="Enviar">
            
            
        </form>
        
    </body>
</html>
