/*Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
A continuación, el programa deberá dar la posición tanto del máximo como
del mínimo.*/
public class ej5 {
	public static void main(String[] args) {
	int[][] num = new int[6][10];
	int i;
	int j;
	int max = 0;
	int min = 1000;
	int max_i = 0;
	int max_j = 0;
	int min_i = 0;
	int min_j = 0;
	
	for (i=0; i<6; i++) {
		for (j=0; j<10; j++) {
			num[i][j] = (int)(Math.random()*1001);
			System.out.printf("%d	", num[i][j]);
			if (num[i][j] > max) {
				max = num[i][j];
				max_i = i;
				max_j = j;
			} else if (num[i][j] < min) {
				min = num[i][j];
				min_i = i;
				min_j = j;
			}
		}
		System.out.println();
	}

	System.out.printf("El mínimo (%d) se encuentra en %d %d\n", min, min_i, min_j);
	System.out.printf("El máximo (%d) se encuentra en %d %d", max, max_i, max_j);
	System.out.printf("\nFIN\n");
   
	}
}