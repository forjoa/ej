package ej;

public class Persona {

	public String nombre;
	public int edad;	
	
	public Persona(String nombreParametro, int edad) {
		this.nombre = nombreParametro;
		this.edad = edad;
	}

	public void saludar () {
		System.out.println("Hola, mi nombre es: " + this.nombre + " y mi edad es: " + this.edad);
	}
	
	public static void saludarS() {
		System.out.println("hola mundo");
	}
	
	public void cambiarNombre (String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public static void main(String[] args) {
		Persona persona1 = new Persona("Joaquin", 20);
		persona1.saludar();
		
		persona1.cambiarNombre("Amatista");
		
		persona1.saludar();
		
		// Persona.saludarS();
	}

}
