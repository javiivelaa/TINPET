package services;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Ciudad;
import dao.Pais;
import dao.SexoPersona;
import dao.Usuario;
import manager.UsuarioManager;


@WebServlet("/crearUsuario")
public class CrearUsuario extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String sexoS = request.getParameter("sexo");
		SexoPersona sexoE = SexoPersona.valueOf(sexoS);
		String edad = request.getParameter("edad");
		String ciudadS = request.getParameter("ciudad");
		Ciudad ciudadE = Ciudad.valueOf(ciudadS);
		String paisS = request.getParameter("pais");
		Pais paisE = Pais.valueOf(paisS);
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		String contrasena = request.getParameter("contrasena");
		
		int edadI = Integer.parseInt(edad); 
		long telefonoL = Long.parseLong(telefono);
		Usuario u = new Usuario(nombre, apellidos, sexoE, edadI, ciudadE, paisE, email, telefonoL, contrasena);
		
		List<Usuario> usuarios = UsuarioManager.getListaUsuario();
		usuarios.add(u);
	}
}
