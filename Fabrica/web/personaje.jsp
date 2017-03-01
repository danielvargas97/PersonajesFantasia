<%-- 
    Document   : personaje
    Created on : 23-feb-2017, 8:44:24
    Author     : Invitado
--%>

<%@page import="java.awt.Image"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String arma = (String) session.getAttribute("Arma");
    String cuerpo =  (String) session.getAttribute("Cuerpo");
    String escudo = (String)session.getAttribute("Escudo");
    String montura = (String)session.getAttribute("Montura");
    String fabrica = (String)session.getAttribute("Fabrica");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>¡¡¡Creado con la fabrica de <%=fabrica%>s!!! </h1>
        
        <canvas id="myCanvas" width="1300" height="780" style="border:1px solid #d3d3d3;">
        Your browser does not support the HTML5 canvas tag.
        </canvas>
        
        <script>
            var imgArma= new Image();
            var imgCuerpo = new Image();
            var imgEscudo = new Image();
            var imgMontura = new Image();
            
            imgArma.src='<%=arma%>';
            imgCuerpo.src='<%=cuerpo%>';
            imgEscudo.src='<%=escudo%>';
            imgMontura.src='<%=montura%>';
            
            window.onload = function() {
                var canvas = document.getElementById("myCanvas");
                var ctx = canvas.getContext("2d");
                var alto = 150;
                var ancho = 250;
                //var img = document.getElementById("arma");
               ctx.drawImage(imgArma, 30, 30,ancho,alto);
               ctx.drawImage(imgCuerpo, 300, 30,ancho,alto);
               ctx.drawImage(imgEscudo,30,200,ancho,alto);
               ctx.drawImage(imgMontura,300,200,ancho,alto);
            };
        </script>
        
        
        
    </body>
</html>
