package ej;

public class palindromo {
	
	static boolean check (String word) {
		String [] wordSplitted = word.split("");
		for (int i = 0, j = wordSplitted.length - 1; j >= 0 ; i++, j--) {
			if (!wordSplitted[i].equals(wordSplitted[j])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(check("hola") ? "palindromo" : "no es un palindromo");
	}

}
