
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h2>Resultado</h2>
        <section>
            <div class="container">
                <div class="row">
                    <div class="col-2"></div>
                    <div class="col-8">
                        <div class="card">
                            <div class="card-header">
                                <h4>Paises seleccionados</h4>
                            </div>
                            <table class="table table-striped">
                                <thead class="thead-dark">
                                <tr>
                                    <th scope="col">Code</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Population</th>
                                    <th scope="col">Region</th>
                                    <th></th>
                                </tr>
                                </thead> 
                                <tbody>
                                <c:forEach items="${paises}" var="pais">
                                    <tr>
                                        <td>${pais.code}</td>
                                        <td>${pais.name}</td>
                                        <td>${pais.population}</td>
                                        <td>${pais.region}</td>
                                        <td></td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="col-2"></div>
                </div>
            </div>
    </section>
    </center>
 <footer class=" text-center text-lg-start position-absolute bottom-0 start-50 translate-middle-x">
  <!-- Copyright -->
  <div class="text-center p-3">
    © 2023 Copyright:
    <h3>Alberto Alexandru Baciu</h3>
  </div>
  <!-- Copyright -->
</footer>
</body>
</html>
