

package controlador;

import datos.Ciudad;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import datos.Conexion;
import datos.Paises;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name="ServletController", urlPatterns={"/ServletController"})
public class ServletController extends HttpServlet {
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    //    processRequest(request, response);
String operacion = request.getParameter("operacion");
    switch(operacion){
            case "Buscar":
//        String[] nombres=request.getParameterValues("name");
//
//			String sqlStr="select * from city where ";
//			for (int i=0; i<nombres.length;i++){
//				sqlStr=sqlStr+ "name ='" + nombres[i] +"'";
//				if (i != nombres.length -1) sqlStr += "OR ";
//			}
//			sqlStr += " AND population>0 ORDER BY population DESC";
//			System.out.println(sqlStr);
//
//            Connection conn = null;
//            PreparedStatement stmt = null;
//            ResultSet rs = null;
//            Ciudad ciudad= null;
//            List<Ciudad> ciudades=new ArrayList<>();
//        try {
//            conn = Conexion.getConnection();
//            stmt = conn.prepareStatement(sqlStr);
//            rs = stmt.executeQuery(sqlStr);
//            while (rs.next()) {
//				Ciudad c=new Ciudad();
//				c.setId(rs.getInt("id"));
//				c.setName(rs.getString("name"));
//				c.setCountrycode(rs.getString("countrycode"));
//				c.setPopulation(rs.getInt("population"));
//				c.setDistrict(rs.getString("district"));
//				ciudades.add(c);
//            }
//            System.out.println("ciudades: " + ciudades);
//
//	    request.setAttribute("ciudades",ciudades);
//	    request.getRequestDispatcher("vistafinal.jsp").forward(request, response);
//                 
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        } finally {
//            Conexion.close(rs);
//            Conexion.close(stmt);
//            Conexion.close(conn);
//        }
    System.out.println("--------------------------- PRUEBA -------------------------------");
            break;
      case "Country" :
        String[] nombres=request.getParameterValues("name");
        String sqlStr="select * from country where ";
			for (int i=0; i<nombres.length;i++){
				sqlStr=sqlStr+ "code ='" + nombres[i] +"'";
				if (i != nombres.length -1) sqlStr += "OR ";
			}
			sqlStr += " ORDER BY POPULATION";
			System.out.println(sqlStr);

            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Paises> paises=new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sqlStr);
            rs = stmt.executeQuery(sqlStr);
            while (rs.next()) {
		Paises p=new Paises();
                p.setCode(rs.getString("code"));
                p.setName(rs.getString("name"));
                p.setPopulation(rs.getInt("population"));
                p.setRegion(rs.getString("region"));
                paises.add(p);
            }

	    request.setAttribute("paises",paises);
	    request.getRequestDispatcher("vistafinal.jsp").forward(request, response);
                 
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
            break; 
        }
              
}

}
