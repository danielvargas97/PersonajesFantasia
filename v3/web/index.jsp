<%-- 
    Document   : index
    Created on : 18-feb-2017, 20:03:22
    Author     : Invitado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body {
                background: #1e5799;
                background: -moz-linear-gradient(top,  #1e5799 0%, #7db9e8 100%);
                background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#1e5799), color-stop(100%,#7db9e8));
                background: -webkit-linear-gradient(top,  #1e5799 0%,#7db9e8 100%);
                background: -o-linear-gradient(top,  #1e5799 0%,#7db9e8 100%);
                background: -ms-linear-gradient(top,  #1e5799 0%,#7db9e8 100%);
                background: linear-gradient(to bottom,  #1e5799 0%,#7db9e8 100%);
                filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#1e5799', endColorstr='#7db9e8',GradientType=0 );
                background-attachment: fixed;
            }
            #submit{
            font-family: Futura, "Trebuchet MS", Arial, sans-serif;
            display: inline-block;
            color: white;
            background-color: black;
            text-align: center;
            padding: 20px;
            text-decoration: none;
            border:1;
            
            transition: all 500ms ease;
            
            }
            #submit:hover {
                background-color: red;
                transition: all 500ms ease;
            }     
      
            #submit:focus{
                outline:none;
            }
        </style>
    </head>
    <body>
        
        <p style="font-size:50px;" align="center">Bienvenido</p>
        <p style="font-size:30px;" align="center">Seleccione su personaje</p>
        <form name="formu" action="MiServlet" method="post">
            <TABLE BORDER="1" align=center> 
                <TR>
                    <TD><p><input type=submit value="Humano" id="submit" name="boton"  style="font-size:30px;"></p></TD> 
                    <TD><p><input type=submit value="Elfo" id="submit" name="boton" style="font-size:30px;"></p></TD> 
                    <TD><p><input type=submit value="Enano" id="submit" name="boton" style="font-size:30px;"></p></TD> 
                    <td><p><input type=submit value="Mago" id="submit" name="boton" style="font-size:30px;"></p></td>
                    <td><p><input type=submit value="Orco" id="submit" name="boton" style="font-size:30px;"></p></td>      
                </TR>
            </table>
            <div align="center" >
                <br>
                <input type="number" id="numero"  name="cantidad"  min="1" max="5" style="font-size:30px;">
            </div>
        </form>
    </body>
</html>


