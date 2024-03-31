package ej;

public class MCD_mcm {
	
	public static int calcularMCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int calcularMCM(int a, int b) {
		return (a * b) / calcularMCD(a, b);
	}

	public static void main(String[] args) {

		int numero1 = 12;
		int numero2 = 18;

		int mcd = calcularMCD(numero1, numero2);
		System.out.println("El Máximo Común Divisor (mcd) de " + numero1 + " y " + numero2 + " es: " + mcd);

		int mcm = calcularMCM(numero1, numero2);
		System.out.println("El Mínimo Común Múltiplo (mcm) de " + numero1 + " y " + numero2 + " es: " + mcm);
	}

}
