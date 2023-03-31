package dao;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PerroTest 
{
	private Perro p;
	
	@BeforeEach
	void init()
	{
		p = new Perro(Raza.GOLDEN_RETRIEVER, 5, SexoPerro.MACHO, "Tano", true, false, true, true);
	}
	
	@Test
	void testGetRaza() {
		assertTrue(p.getRaza() == Raza.GOLDEN_RETRIEVER, "Raza incorrecta.");
	}
	@Test
	void testSetRaza() {
		p.setRaza(Raza.BEAGLE);
		assertTrue(p.getRaza() == Raza.BEAGLE, "Raza incorrecta.");
	}
	@Test
	void testGetEdad() {
		assertTrue(p.getEdad() == 5, "Edad incorrecta.");
	}
	@Test
	void testSetEdad() {
		p.setEdad(8);
		assertTrue(p.getEdad() == 8, "Edad incorrecta.");
	}
	@Test
	void testGetSexo() {
		assertTrue(p.getSexo() == SexoPerro.MACHO, "Sexo incorrecto.");
	}
	@Test
	void testSetSexo() {
		p.setSexo(SexoPerro.HEMBRA);
		assertTrue(p.getSexo() == SexoPerro.HEMBRA, "Sexo incorrecto.");
	}
	@Test
	void testGetNombre() {
		assertTrue(p.getNombre() == "Tano", "Nombre incorrecto.");
	}
	@Test
	void testSetNombre() {
		p.setNombre("Nazareno");
		assertTrue(p.getNombre() == "Nazareno", "Nombre incorrecto.");
	}
	@Test
	void testIsCartillaVacunacion() {
		assertTrue(p.isCartillaVacunacion(), "Vacunación incorrecta.");
	}
	@Test
	void testSetCartillaVacunacion() {
		p.setCartillaVacunacion(false);
		assertTrue(!p.isCartillaVacunacion(), "Vacunación incorrecta.");
	}
	@Test
	void testIsEnfermedad() {
		assertTrue(p.isCartillaVacunacion(), "Enfermedad incorrecta.");
	}
	@Test
	void testSetEnfermedad() {
		p.setCartillaVacunacion(true);
		assertTrue(p.isCartillaVacunacion(), "Enfermedad incorrecta.");
	}
	@Test
	void testIsConviveAnimales() {
		assertTrue(p.isConviveAnimales(), "Convivencia incorrecta.");
	}
	@Test
	void testSetConviveAnimales() {
		p.setConviveAnimales(false);
		assertTrue(!p.isConviveAnimales(), "Convivencia incorrecta.");
	}
	@Test
	void testIsPedigri() {
		assertTrue(p.isPedigri(), "Pedigri incorrecto.");
	}
	@Test
	void testSetPedigri() {
		p.setCartillaVacunacion(false);
		assertTrue(p.isPedigri(), "Pedigri incorrecto.");
	}
}
