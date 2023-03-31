package dao;

public class Encuentro {
	private String fecha;
	private Perro perro1;
	private Perro perro2;
	private String hora;

	public Encuentro(String fecha, Perro perro1, Perro perro2,String hora) {
		super();
		this.fecha = fecha;
		this.perro1 = perro1;
		this.perro2 = perro2;
		this.hora = hora;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Perro getPerro1() {
		return perro1;
	}

	public void setAnimal1(Perro perro1) {
		this.perro1 = perro1;
	}

	public Perro getPerro2() {
		return perro2;
	}

	public void setPerro2(Perro perro2) {
		this.perro2 = perro2;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
}
