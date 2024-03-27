package ej;

public class Coche {
	
	public String modelo; 
	public int anio;
	
	public Coche(String modelo, int anio) {
		this.modelo = modelo;
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", anio=" + anio + "]";
	} 
	
	public void encender() {
		System.out.println("El coche esta encendido");
	}
	
	public static void apagar() {
		System.out.println("Todos los coches apagados");
	}
	
	public static void main(String[] args) {
		Coche coche1 = new Coche("terreneitor", 2007); 
		String info = coche1.toString(); 
		System.out.println(info);
		coche1.encender();
		Coche.apagar();
	}
	
	
	

}
