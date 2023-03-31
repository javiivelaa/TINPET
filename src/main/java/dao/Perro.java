package dao;

public class Perro {
    private Raza raza;
    private int edad;
    private SexoPerro sexo;
    private String nombre;
    private boolean cartillaVacunacion;
    private boolean enfermedad;
    private boolean conviveAnimales;
    private boolean pedigri;
    
	public Perro(Raza raza, int edad, SexoPerro sexo, String nombre, boolean cartillaVacunacion, boolean enfermedad, boolean conviveAnimales, boolean pedigri) {
		super();
		this.raza = raza;
		this.edad = edad;
		this.sexo = sexo;
		this.nombre = nombre;
		this.cartillaVacunacion = cartillaVacunacion;
		this.enfermedad = enfermedad;
		this.conviveAnimales = conviveAnimales;
		this.pedigri = pedigri;
	}
	public Raza getRaza() {
		return raza;
	}
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public SexoPerro getSexo() {
		return sexo;
	}
	public void setSexo(SexoPerro sexo) {
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isCartillaVacunacion() {
		return cartillaVacunacion;
	}
	public void setCartillaVacunacion(boolean cartillaVacunacion) {
		this.cartillaVacunacion = cartillaVacunacion;
	}
	public boolean isEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(boolean enfermedad) {
		this.enfermedad = enfermedad;
	}
	public boolean isConviveAnimales() {
		return conviveAnimales;
	}
	public void setConviveAnimales(boolean conviveAnimales) {
		this.conviveAnimales = conviveAnimales;
	}
	public boolean isPedigri() {
		return pedigri;
	}
	public void setPedigri(boolean pedigri) {
		this.pedigri = pedigri;
	}
}