package ej;

public class calculateWinner {

	public static void main(String[] args) {

		String[][] tuplas = { { "R", "S" }, { "S", "R" }, { "P", "S" } };
		int player1 = 0, player2 = 0, tie = 0;

		for (int i = 0; i < tuplas.length; i++) {
			switch (tuplas[i][0]) {
			case "R":
				if (tuplas[i][1].equals("R"))
					tie++;
				if (tuplas[i][1].equals("S"))
					player1++;
				if (tuplas[i][1].equals("P"))
					player2++;
				break;
			case "S":
				if (tuplas[i][1].equals("S"))
					tie++;
				if (tuplas[i][1].equals("P"))
					player1++;
				if (tuplas[i][1].equals("R"))
					player2++;
				break;
			case "P":
				if (tuplas[i][1].equals("P"))
					tie++;
				if (tuplas[i][1].equals("R"))
					player1++;
				if (tuplas[i][1].equals("S"))
					player2++;
				break;
			}
		}

		if (player1 > player2 && player1 > tie) {
			System.out.println("Gana player1");
		} else if (player2 > player1 && player2 > tie) {
			System.out.println("Gana player2");
		} else {
			System.out.println("Empate");
		}

	}

}
