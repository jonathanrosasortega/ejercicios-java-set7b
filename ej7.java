/*Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla
de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
Intentos = 6
Minas = 2*/
public class ej7 {
// se definen constantes para representar el
// contenido de las celdas
	static final int VACIO = 0;
	static final int MINA = 1;
	static final int TESORO = 2;
	static final int INTENTO = 3;
	static final int CUIDADO = 4;
	public static void main(String[] args) {
	int x;
	int y;
	int[][] cuadrante = new int[5][4];
	// inicializa el array
	for(x = 0; x < 4; x++) {
		for(y = 0; y < 3; y++) {
			cuadrante[x][y] = VACIO;
		}
	}
	// coloca la mina
	int minaX = (int)(Math.random()*4);
	int minaY = (int)(Math.random()*3);
	cuadrante[minaX][minaY] = MINA;
	// coloca el tesoro
	int tesoroX;
	int tesoroY;
	do {
		tesoroX = (int)(Math.random()*4);
		tesoroY = (int)(Math.random()*3);
	} while ((minaX == tesoroX) && (minaY == tesoroY));

	cuadrante[tesoroX][tesoroY] = TESORO;
	// juego
	System.out.println("¡BUSCA EL TESORO!");
	boolean salir = false;
	String c = "";
	do {
		// pinta el cuadrante
		for(y = 3; y >= 0; y--) {
			System.out.print(y + "|");
			for(x = 0; x < 5; x++) {
				if (cuadrante[x][y] == INTENTO) {
					System.out.print("X ");
				} else if (cuadrante[x][y] == CUIDADO) {
					System.out.print("! ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("  ----------\n  0 1 2 3 4\n");
		// pide las coordenadas
		System.out.print("Coordenada x (Máximo 4): ");
		x = Integer.parseInt(System.console().readLine());
		System.out.print("Coordenada y (Máximo 3): ");
		y = Integer.parseInt(System.console().readLine());
		// mira lo que hay en las coordenadas indicadas por el usuario
		switch(cuadrante[x][y]) {
			case VACIO:
				if (((x == minaX-1) && (y == minaY-1)) || ((x == minaX-1) && (y == minaY)) || ((x == minaX-1) && (y == minaY+1)) || ((x == minaX) && (y == minaY+1)) || ((x == minaX) && (y == minaY-1)) || ((x == minaX+1) && (y == minaY-1)) || ((x == minaX+1) && (y == minaY)) || ((x == minaX+1) && (y == minaY+1))) {
					cuadrante[x][y] = CUIDADO;
					System.out.println("¡Cuidado! ¡Hay una mina cerca!");
				} else {
					cuadrante[x][y] = INTENTO;
				}
			break;
			case MINA:
				System.out.println("¡BOOM! Lo siento, has perdido.");
				salir = true;
			break;
			case TESORO:System.out.println("$$$ ¡Enhorabuena, has encontrado el tesoro! $$$");
				salir = true;
			break;
			default:
		}
	} while (!salir);
	// pinta el cuadrante
	for(y = 3; y >= 0; y--) {
		System.out.print(y + "|");
		for(x = 0; x < 5; x++) {
			switch(cuadrante[x][y]) {
				case CUIDADO:
					c = "! ";
				break;
        case VACIO:
					c = "  ";
				break;
				case MINA:
					c = "* ";
				break;
				case TESORO:
					c = "€ ";
				break;
				case INTENTO:
					c = "X ";
				break;
				default:
			}
			System.out.print(c);
		}
		System.out.println();
	}
		System.out.println("  ----------\n  0 1 2 3 4\n");
	}
}
