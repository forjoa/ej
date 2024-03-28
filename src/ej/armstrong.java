package ej;

public class armstrong {

	public static void main(String[] args) {

		String num = "407";
		String[] numSplitted = num.split("");
		int sum = 0;

		for (int i = 0; i < numSplitted.length; i++) {
			sum += Math.pow(Integer.parseInt(numSplitted[i]), numSplitted.length);
		}

		System.out.println(num.equals(sum + "") ? "es un número armstrong" : "no es un número armstrong");

	}

}
