<%-- 
    Document   : index
    Created on : 18-feb-2017, 20:03:22
    Author     : Invitado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h1>Bienvenido</h1>
        <h2>Seleccione su personaje</h2>
        <form name="formu" action="MiServlet" method="get">
            <p><input type=submit value="humano"></p> <p><input type=submit value="elfo"></p>
            <canvas id="myCanvas" width="200" height="100"
            style="border:1px solid #c3c3c3;">
            Your browser does not support the canvas element.
            </canvas>

            <script>
                var canvas = document.getElementById("myCanvas");
                var ctx = canvas.getContext("2d");
                ctx.fillStyle = "#FFF000";
                ctx.fillRect(0,0,200,100);
            </script>
        </form>
            
    </body>
</html>


