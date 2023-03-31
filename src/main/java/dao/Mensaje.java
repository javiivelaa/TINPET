package dao;

public class Mensaje {
	private String mensaje;
	private Usuario us;
	private String fecha;
	private String hora;
	
	public Mensaje(String mensaje, Usuario us, String fecha, String hora) {
		super();
		this.mensaje = mensaje;
		this.us = us;
		this.fecha = fecha;
		this.hora = hora;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Usuario getUs() {
		return us;
	}

	public void setUs(Usuario us) {
		this.us = us;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}	
}