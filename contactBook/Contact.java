package contactBook;

import java.util.Arrays;

public class Contact {

	private String nombre;
	private String apellido;
	private String correosElectronicos[];
	private int fijo;
	private long Celular;
	private String direccion;
	
	

	public Contact(String nombre, String apellido, String[] correosElectronicos, int fijo, long l,
			String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correosElectronicos = correosElectronicos;
		this.fijo = fijo;
		Celular = l;
		this.direccion = direccion;
	}
	
	public Contact(){}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String[] getCorreosElectronicos() {
		return correosElectronicos;
	}

	public void setCorreosElectronicos(String[] correos) {
		this.correosElectronicos = correos;
	}

	public int getFijo() {
		return fijo;
	}

	public void setFijo(int fijo) {
		this.fijo = fijo;
	}

	public long getCelular() {
		return Celular;
	}

	public void setCelular(long celular) {
		Celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "   -Apellido: " + apellido +  "   -Telefono fijo: " + fijo + "   -Celular: " + Celular + "   -Direccion: "
				+ direccion + "\nCorreosElectronicos:"
						+ Arrays.toString(correosElectronicos)+"\n";
	}

}
