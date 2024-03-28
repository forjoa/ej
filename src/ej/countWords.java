package ej;

import java.util.Arrays;

public class countWords {

	public static void main(String[] args) {

		String frase = "vamos a contar palabras";
		String [] fraseDividida = frase.split(" ");
		String [] palabras = new String [fraseDividida.length];
		
		for (int i = 0; i < fraseDividida.length; i++) {
			for (int j = 0; j < palabras.length; j++) {
				if (palabras[j] != fraseDividida[i] || palabras[j] == null) {
					palabras[j] = fraseDividida[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(palabras));

	}

}
