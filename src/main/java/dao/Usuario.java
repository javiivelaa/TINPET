package dao;

public class Usuario {
	private String nombre;
	private String apellidos;
	private SexoPersona sexo;
	private int edad;
	private Ciudad ciudad;
	private Pais pais;
	private String email;
	private long telefono;
	private String contrasena;

	public Usuario(String nombre, String apellidos, SexoPersona sexo, int edad, Ciudad ciudad, Pais pais, String email,
			long telefono, String contrasena) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.edad = edad;
		this.ciudad = ciudad;
		this.pais = pais;
		this.email = email;
		this.telefono = telefono;
		this.contrasena = contrasena;
	}

	public SexoPersona getSexo() {
		return sexo;
	}

	public void setSexo(SexoPersona sexo) {
		this.sexo = sexo;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
}
