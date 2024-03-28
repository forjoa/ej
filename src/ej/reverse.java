package ej;

public class reverse {

	public static void main(String[] args) {

		String frase = "hola mundo", fraseInvertida = "";

		for (int j = frase.length() - 1; j >= 0; j--) {
			fraseInvertida += frase.split("")[j];
		}

		System.out.println(fraseInvertida);

	}

}
