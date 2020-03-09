<%-- 
    Document   : tiro
    Created on : 09-mar-2020, 19:19:36
    Author     : DAW202
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="modelo.Coordenada"%>
<%@page import="modelo.Tiro"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table{
                width: 50%;
            }
        </style>
    </head>
    <body>
        <h1>Tiro Parabólico</h1>
        <%;String angulo_seleccionado, velocidad_seleccionada;
        if(request.getAttribute("angulo")==null){
            angulo_seleccionado = "0";
        }else{
            angulo_seleccionado = String.valueOf(request.getAttribute("angulo"));
        }
        
        if(request.getAttribute("velocidad")==null){
            velocidad_seleccionada = "0";
        }else{
            velocidad_seleccionada = String.valueOf(request.getAttribute("velocidad"));
        }
        ArrayList angulos = (ArrayList) request.getAttribute("angulos"); 
        DecimalFormat df = new DecimalFormat("0.00");
        %>
        
        <form action="tiro" method="post">
            <label for="velocidad">Velocidad(m/s)</label><input type="text" value="<%=velocidad_seleccionada%>" name="velocidad" id="velocidad">
            <br><br><label for="angulo">Angulo:</label>
            <select name="angulo" id="angulo">
                       <% for (int i=0; i<angulos.size(); i++) {
                       String selec="";
                       Object angulo = angulos.get(i);
                       
                       if ( angulo.equals(angulo_seleccionado) ) {
                           selec = "selected";
                       }
                       %>
                       <option value="<%=angulo %>" <%=selec%> ><%=angulo %></option>
                        
                            
                       <% } %>     
            </select>
            <br>
            <input type="submit" value="Enviar">
            
            <% if ( request.getAttribute("tiro")!=null ) {
                Tiro tiro = (Tiro) request.getAttribute("tiro");%>
                <h1>El alcance es: <%= df.format(tiro.getAlcanceMaximo()) %></h1>
                <h1>La altura maxima(cm) es: <%= df.format(tiro.getAlturaMaxima()) %></h1>
           <% }%>
           
           
            <% if ( request.getAttribute("coordenadas")!=null ) {
                ArrayList<Coordenada> coordenadas = (ArrayList<Coordenada>) request.getAttribute("coordenadas");%>
                

            <table border="1">
               <tr><th>X</th><th>Y</th>
                <% for (int i=0; i<coordenadas.size(); i++){
                    Coordenada coor = coordenadas.get(i);  
                %>
               <tr>
                   <td class="gris"><%= df.format(coor.getX()) %></td>
                    <td class="gris"><%= df.format(coor.getY())  %></td>
                </tr>
             <% } %>
            </table>
                
           <% }%>
            
        </form>
        
    </body>
</html>
