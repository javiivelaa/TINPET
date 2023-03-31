package services;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Perro;
import dao.Raza;
import dao.SexoPerro;
import manager.PerroManager;


@WebServlet("/crearPerro")
public class CrearPerro extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		
		String razaS = request.getParameter("raza");
		Raza razaE = Raza.valueOf(razaS);
		String edad = request.getParameter("edad");
		int edadI = Integer.parseInt(edad);
		String sexoS = request.getParameter("sexo");
		SexoPerro sexoE = SexoPerro.valueOf(sexoS);
		String nombre = request.getParameter("nombre");
		boolean cartillaVacunacion;
		boolean enfermedad;
		boolean conviveAnimales;
		boolean pedigri;
		if(request.getParameter("cartillaVacunacion").equals("si")){
		    cartillaVacunacion = true;
		}
		else
		{
			cartillaVacunacion = false;
		}
		if(request.getParameter("enfermedad").equals("si")){
		    enfermedad = true;
		}
		else
		{
			enfermedad = false;
		}
		if(request.getParameter("conviveAnimales").equals("si")){
		    conviveAnimales = true;
		}
		else
		{
			conviveAnimales = false;
		}
		if(request.getParameter("pedigri").equals("si")){
		    pedigri = true;
		}
		else
		{
			pedigri = false;
		}

		Perro p = new Perro(razaE, edadI, sexoE, nombre, cartillaVacunacion, enfermedad, conviveAnimales, pedigri);
		
		List<Perro> Perro = PerroManager.getListaPerro();
		Perro.add(p);
	}
}
