package pictures.spring.modelo.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import pictures.spring.utils.regex.RegularExpressions;

public class Persona {
	
	@NotEmpty
	@Size(min=3, max=30)
	private String nombre;
	
	@Min((long)18)
	private int edad;
	
	@NotEmpty
	@Pattern(regexp = RegularExpressions.regExpDni)
	private String dni;
	
	@Size(min = 3, max = 250)
	private String descripcion;
	
	private String nacionalidad;
	
	@NotNull
	private MultipartFile foto;
	
	private String photoOriginalName;

	public Persona() {
	}

	public String getNombre() {
		return nombre;
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
	}


	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public MultipartFile getFoto() {
		return foto;
	}

	public void setFoto(MultipartFile foto) {
		this.foto = foto;
	}

	public String getPhotoOriginalName() {
		return photoOriginalName;
	}

	public void setPhotoOriginalName(String photoOriginalName) {
		this.photoOriginalName = photoOriginalName;
	}

	

}
