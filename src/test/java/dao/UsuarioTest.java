package dao;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest 
{
	private Usuario u;
	
	@BeforeEach
	void init()
	{
		u = new Usuario("Javi", "Vela", SexoPersona.Hombre, 20, Ciudad.Sevilla, Pais.Espana, "javiervelacuvillo7@gmail.com", 637667340, "CoNtRaSeNa");
	}
	
	@Test
	void testGetNombre() {
		assertTrue(u.getNombre() == "Javi", "Nombre incorrecto.");
	}
	@Test
	void testSetNombre() {
		u.setNombre("Javier");
		assertTrue(u.getNombre() == "Javier", "Nombre incorrecto.");
	}
	@Test
	void testGetSexo() {
		assertTrue(u.getSexo() == SexoPersona.Hombre, "Sexo incorrecto.");
	}
	@Test
	void testSetSexo() {
		u.setSexo(SexoPersona.Mujer);
		assertTrue(u.getSexo() == SexoPersona.Mujer, "Sexo incorrecto.");
	}
	@Test
	void testGetCiudad() {
		assertTrue(u.getCiudad() == Ciudad.Sevilla, "Ciudad incorrecta.");
	}
	@Test
	void testSetCiudad() {
		u.setCiudad(Ciudad.Almeria);
		assertTrue(u.getCiudad() == Ciudad.Almeria, "Ciudad incorrecta.");
	}
	@Test
	void testGetPais() {
		assertTrue(u.getPais() == Pais.Espana, "Pais incorrecto.");
	}
	@Test
	void testSetPais() {
		u.setPais(Pais.PaisesBajos);
		assertTrue(u.getPais() == Pais.PaisesBajos, "Pais incorrecto.");
	}
	@Test
	void testGetEmail() {
		assertTrue(u.getEmail() == "javiervelacuvillo7@gmail.com", "Email incorrecto.");
	}
	@Test
	void testSetEmail() {
		u.setEmail("javiivelaa@gmail.com");
		assertTrue(u.getEmail() == "javiivelaa@gmail.com", "Email incorrecto.");
	}
	@Test
	void testGetTelefono() {
		assertTrue(u.getTelefono() == 637667340, "Telefono incorrecto.");
	}
	@Test
	void testSetTelefono() {
		u.setTelefono(666666666);
		assertTrue(u.getTelefono() == 666666666, "Telefono incorrecto.");
	}
	@Test
	void testGetContrasena() {
		assertTrue(u.getContrasena() == "CoNtRaSeNa", "Contrasena incorrecto.");
	}
	@Test
	void testSetContrasena() {
		u.setContrasena("contrasena");
		assertTrue(u.getContrasena() == "contrasena", "Contrasena incorrecto.");
	}
}
