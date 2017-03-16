<%-- 
    Document   : personaje
    Created on : 23-feb-2017, 8:44:24
    Author     : Invitado
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="personaje.Personaje"%>
<%@page import="java.awt.Image"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String arma = (String) session.getAttribute("Arma");
    String cuerpo =  (String) session.getAttribute("Cuerpo");
    String escudo = (String)session.getAttribute("Escudo");
    String montura = (String)session.getAttribute("Montura");
    ArrayList<Personaje> ejercito = (ArrayList<Personaje>)session.getAttribute("Ejercito");
    Integer cantidad = ejercito.size();
    System.out.println(cantidad);
   
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>¡¡¡Construcción Hecha !!! Soldados:<%=cantidad.toString()%> </h1>
        
        <canvas id="myCanvas" width="1300" height="600" style="border:1px solid #d3d3d3;">
        Your browser does not support the HTML5 canvas tag.
        </canvas>
        
        <script>
            var cantidad = <%=cantidad%>;
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
                var alto = 350;
                var ancho = 500;
                //var img = document.getElementById("arma");
                /*
                 * Empieza a imprimir los personajes
                 */
                for(var i = 1; i<= cantidad; i++){
                    ctx.drawImage(imgCuerpo, 30*i, 30*i,alto,ancho);
                    ctx.drawImage(imgMontura,30*i,30*i,alto,ancho);
                    ctx.drawImage(imgArma, 30*i, 30*i,alto,ancho);
                    ctx.drawImage(imgEscudo,30*i,30*i,alto,ancho);
                }
                
            };
        </script>
        
        
        
    </body>
</html>
