package modelo.dto;

public class Persona {

	private String nombre;
	private int edad;
	private String descripcion;

	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}

	
	public Persona(String nombre, int edad, String descripcion) {
		this.nombre = nombre;
		this.edad = edad;
		this.descripcion = descripcion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	};

	
	
	

}
