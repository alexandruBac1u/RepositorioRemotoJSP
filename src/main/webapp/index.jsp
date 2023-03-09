<%-- 
    Document   : index
    Created on : 25-feb-2023, 12:42:26
    Author     : Profesor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <title>JSP Page</title>     
    </head>
    <body>
   
    <center>       
        <form method="get" action="ServletController">
            <h2><b>Elige un codigo de pais, para saber informacion de el:</b></h2>
            <p class="text-center"><input type="checkbox" name="name" value="ABW">ABW <br/>
            <input type="checkbox" name="name" value="ROM">ROM <br/>
            <input type="checkbox" name="name" value="ESP">ESP <br/>
            <input type="checkbox" name="name" value="FRA">FRA <br/>
            <input type="checkbox" name="name" value="ALB">ALB <br/>
            <input type="checkbox" name="name" value="JPN">JPN <br/>
            <input type="checkbox" name="name" value="BOL">BOL <br/>
            <input type="checkbox" name="name" value="DEU">DEU <br/>
            <input type="checkbox" name="name" value="RUS">RUS <br/></p>
             <input type="submit" name="operacion" value="Country">
        </form>
    </center>
    <footer class="text-center text-lg-start position-absolute bottom-0 start-50 translate-middle-x">
  <!-- Copyright -->
  <div class="text-center p-3">
    © 2023 Copyright:
    <h3>Alberto Alexandru Baciu</h3>
  </div>
  <!-- Copyright -->
</footer>
    </body>
</html>
