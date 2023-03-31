package manager;

import java.util.LinkedList;
import java.util.List;

import dao.Usuario;
import dao.Ciudad;
import dao.Pais;
import dao.SexoPersona;



public class UsuarioManager {
	
	public static List<Usuario> getListaUsuario()
	{
		List<Usuario> usuarios = new LinkedList<Usuario>();
		Usuario u1 = new Usuario("Lourdes", "Jimenez", SexoPersona.Mujer , 22, Ciudad.Cordoba, Pais.Espana, "lourdes@gmail.com", 658997410, "Contrasena12345");
		usuarios.add(u1);
		
		return usuarios;
	}
}