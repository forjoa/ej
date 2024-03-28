package ej;

public class firstCharToUpper {

	public static void main(String[] args) {

		String frase = "esta es mi frase";
		String[] fraseSplitted = frase.split(" ");
		String fraseFinal = "";

		for (int i = 0; i < fraseSplitted.length; i++) {
			String palabra = "";
			String[] palabraSplitted = fraseSplitted[i].split("");
			for (int j = 0; j < fraseSplitted[i].length(); j++) {
				if (j == 0) {
					palabra += palabraSplitted[j].toUpperCase();
				} else {
					palabra += palabraSplitted[j].toLowerCase();
				}
			}
			fraseFinal += palabra + " ";
		}

		System.out.println(fraseFinal);

	}

}
