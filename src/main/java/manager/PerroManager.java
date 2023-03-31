package manager;

import java.util.LinkedList;
import java.util.List;

import dao.Perro;
import dao.Raza;
import dao.SexoPerro;



public class PerroManager {
	
	public static List<Perro> getListaPerro()
	{
		List<Perro> perros = new LinkedList<Perro>();
		Perro p1 = new Perro(Raza.GOLDEN_RETRIEVER, 5, SexoPerro.HEMBRA, "Teresita", true, false, true, true);
		perros.add(p1);
		
		return perros;
	}
}