/*Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.*/
public class ej12 {
	public static void main(String[] args) {
	int[][] matriz = new int[9][9];
	int maximo = 0;
	int minimo = 301;
	int sum = 0;
	int contador = 0;
  int i;
  int j;

	for (i=0; i<9; i++) {
		for (j=0; j<9; j++) {
			matriz[i][j] = (int)((Math.random()*101)+200);
			if (i + j == 8) {
				sum += matriz[i][j];
				contador++;
				if (matriz[i][j] > maximo) {
					maximo = matriz[i][j];
				} else if (matriz[i][j] < minimo) {
					minimo = matriz[i][j];
				}
			}
		}
		System.out.println();
	}

	for (i=0; i<9; i++) {
		for (j=0; j<9; j++) {
			if (i + j == 8) {
				System.out.printf("%3d", matriz[i][j]);
			} else {
				System.out.printf(" X ");
			}
		}
		System.out.println();
	}

	System.out.printf("Máximo: %d\n", maximo);
	System.out.printf("Minimo: %d\n", minimo);
	System.out.printf("Media: %d\n", sum/contador);

	System.out.printf("\nFIN\n");
   
	}
}
