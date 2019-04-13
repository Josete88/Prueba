package veterinaria;

public class Mascota {
	private String nombre,especie,raza;
	private int codMascota,edad;
	
	public Mascota(int codMascota, String nombre, int edad, String especie, String raza) {
		this.codMascota=codMascota;
		this.nombre=nombre;
		this.edad=edad;
		this.especie=especie;
		this.raza=raza;
		
	}
	
	public Mascota(int codMascota, String nombre, int edad, String especie) {
		this.codMascota=codMascota;
		this.nombre=nombre;
		this.edad=edad;
		this.especie=especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getCodMascota() {
		return codMascota;
	}

	public void setCodMascota(int codMascota) {
		this.codMascota = codMascota;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
