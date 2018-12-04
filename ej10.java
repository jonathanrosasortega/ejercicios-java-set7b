/*Realiza el juego de las tres en raya.*/
public class ej10 {
	public static void main(String[] args) {
	System.out.println("¡El juego de las 3 en raya!");
	int movimientos = 9;
	String[][] posiciones = new String[3][3];
	boolean ganar = false;
	int jugador = 1;
	int x;
	int y;
	int i;
	int j;

	for (i=0; i<3; i++) {
		for (j=0; j<3; j++) {
			posiciones[i][j] = " ";
		}
	} // Valores iniciales de la tabla
  
	System.out.println("  1 2 3");
	System.out.println(" /------");
	for (i=1; i<=3; i++) {
		System.out.print(i);
	for (j=1; j<=3; j++) {
		System.out.printf("|%s", posiciones[i-1][j-1]);
	}
	System.out.println("|");
	System.out.println("--------");//Dibuja la tabla, según los valores iniciales
  }
/*
  1 2 3
 /------
1| | | |
--------
2| | | |
--------
3| | | |
--------(recuperacion.equals("apto"))
*/
	do {
		
		if (jugador == 1) {
			System.out.println("Turno del jugador 1:");
			System.out.print("Coordenada X (1 / 2 / 3):");
			x = (Integer.parseInt(System.console().readLine())-1);
			System.out.print("\nCoordenada Y (1 / 2 / 3):");
			y = (Integer.parseInt(System.console().readLine())-1);

			if (posiciones[x][y].equals(" ")) {
				posiciones[x][y] = "X";
				movimientos--;
				jugador = 2;

			} else {
				System.out.println("\nCasilla ocupada, inténtalo de nuevo");
			}

		} else if (jugador == 2) {
			System.out.println("Turno del jugador 2:");
			System.out.print("Coordenada X (1 / 2 / 3):");
			x = (Integer.parseInt(System.console().readLine())-1);
			System.out.print("\nCoordenada Y (1 / 2 / 3):");
			y = (Integer.parseInt(System.console().readLine())-1);

			if (posiciones[x][y].equals(" ")) {
				posiciones[x][y] = "O";
				movimientos--;
				jugador = 1;
			} else {
				System.out.println("\nCasilla ocupada, inténtalo de nuevo");
			}
		}
    
    System.out.println("  1 2 3");
		System.out.println(" /------");
		for (i=1; i<=3; i++) {
			System.out.print(i);
      for (j=1; j<=3; j++) {
        System.out.printf("|%s", posiciones[i-1][j-1]);
      }
      System.out.println("|");
      System.out.println("--------");//Dibuja la tabla, según los valores iniciales
    }
		if (((posiciones[0][0].equals("X")) && (posiciones[0][1].equals("X")) && (posiciones[0][2].equals("X"))) || ((posiciones[1][0].equals("X")) && (posiciones[1][1].equals("X")) && (posiciones[1][2].equals("X"))) || ((posiciones[2][0].equals("X")) && (posiciones[2][1].equals("X")) && (posiciones[2][2].equals("X"))) /*Posiciones verticales*/ || ((posiciones[0][0].equals("X")) && (posiciones[1][0].equals("X")) && (posiciones[2][0].equals("X"))) || ((posiciones[0][1].equals("X")) && (posiciones[1][1].equals("X")) && (posiciones[2][1].equals("X"))) || ((posiciones[0][2].equals("X")) && (posiciones[1][2].equals("X")) && (posiciones[2][2].equals("X"))) /*Posiciones horizontales*/ || ((posiciones[0][0].equals("X")) && (posiciones[1][1].equals("X")) && (posiciones[2][2].equals("X"))) || ((posiciones[0][2].equals("X")) && (posiciones[1][1].equals("X")) && (posiciones[2][0].equals("X"))) /*Posiciones diagonales*/ || ((posiciones[0][0].equals("O")) && (posiciones[0][1].equals("O")) && (posiciones[0][2].equals("O"))) || ((posiciones[1][0].equals("O")) && (posiciones[1][1].equals("O")) && (posiciones[1][2].equals("O"))) || ((posiciones[2][0].equals("O")) && (posiciones[2][1].equals("O")) && (posiciones[2][2].equals("O"))) /*Posiciones verticales*/ || ((posiciones[0][0].equals("O")) && (posiciones[1][0].equals("O")) && (posiciones[2][0].equals("O"))) || ((posiciones[0][1].equals("O")) && (posiciones[1][1].equals("O")) && (posiciones[2][1].equals("O"))) || ((posiciones[0][2].equals("O")) && (posiciones[1][2].equals("O")) && (posiciones[2][2].equals("O"))) /*Posiciones horizontales*/ || ((posiciones[0][0].equals("O")) && (posiciones[1][1].equals("O")) && (posiciones[2][2].equals("O"))) || ((posiciones[0][2].equals("O")) && (posiciones[1][1].equals("O")) && (posiciones[2][0].equals("O")))){
			ganar = true;
		}
	} while ((movimientos >= 1) && (!ganar));

	if (ganar) {
		if (jugador == 1) {
			System.out.println("Gana el jugador 2");
		} else if (jugador == 2) {
			System.out.println("Gana el jugador 1");
		}
	} else if ((!ganar) && (movimientos == 0)){
		System.out.println("Nadie ha ganado");
	}
	System.out.printf("\nFIN\n");
   
	}
}
