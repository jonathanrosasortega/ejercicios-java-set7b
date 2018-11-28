/*Realiza un programa que sea capaz de rotar todos los elementos de una
matriz cuadrada una posición en el sentido de las agujas del reloj. La matriz
debe tener 12 filas por 12 columnas y debe contener números generados al
azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz
resultado, ambas con los números convenientemente alineados.
1 1 1 1 1 1 1 1 1 1 1 1		144 (12x12) 100(10x10) 64(8x8) 36(6x6) 16(4x4) 4(2x2)
1 2 2 2 2 2 2 2 2 2 2 *1		11x4		9x4			7x4		5x4		3x4		1x4
1 2 3 3 3 3 3 3 3 3 2 1
1 2 3 4 4 4 4 4 4 3 2 1
1 2 3 4 5 5 5 5 4 3 2 1
1 2 3 4 5 6 6 5 4 3 2 1
1 2 3 4 5 6 6 5 4 3 2 1
1 2 3 4 5 5 5 5 4 3 2 1
1 2 3 4 4 4 4 4 4 3 2 1
1 2 3 3 3 3 3 3 3 3 2 1
*1 2 2 2 2 2 2 2 2 2 2 1
1 1 1 1 1 1 1 1 1 1 *1 1

*/
public class ej9 {
	public static void main(String[] args) {
	int[][] matriz = new int[12][12];
	int i;
	int j;
	int a;
	int limA = 0;
	int limB = 11;
	int[] esquina = new int[4];

	for (i=0; i<12; i++) {
		for (j=0; j<12; j++) {
			matriz[i][j] = (int)(Math.random()*11);
		}
	}

	for (i=0; i<12; i++) {
		for (j=0; j<12; j++) {
			System.out.printf("%3d ", matriz[i][j]);
		}
		System.out.println();
	}	

	//rotaciones
	for (a=0; a<=5; a++) {
		limA = 0;
		limB = 11;
		// Recogemos los nº de las esquinas para no perderlos
		esquina[0] = matriz[limA+a][limA+a]; //Esquina superior izquierda
		esquina[1] = matriz[limA+a][limB-a]; //Esquina superior derecha
		esquina[2] = matriz[limB-a][limB-a]; //Esquina inferior derecha
		esquina[3] = matriz[limB-a][limA+a]; //Esquina inferior izquierda

		for (i=(limB-a); i>(limA+a); i--) { // inicio for 1 (Cambia el orden de la fila de arriba)
			matriz[limA+a][i] = matriz[limA+a][i-1];
		} // fin for 1

		for (i=(limB-a); i>(limA+a); i--) { // inicio for 2 (Cambia el orden de la columna de la derecha)
			matriz[i][limB-a] = matriz[i-1][limB-a];
		} // fin for 2

		for (i=(limA+a); i<(limB-a); i++) { // inicio for 3 (Cambia el orden de la fila de abajo)
			matriz[limB-a][i] = matriz[limB-a][i+1];
		} // fin for 3

    for (i=(limA+a); i<(limB-a); i++) { // inicio for 4 (Cambia el orden de la columna de la derecha)
			matriz[i][limA+a] = matriz[i+1][limA+a];
		} // fin for 4
    
    matriz[limA+a][limA+a+1] = esquina[0];
    matriz[limA+a+1][limB-a] = esquina[1];
    matriz[limB-a][limB-a-1] = esquina[2];
    matriz[limB-a-1][limA+a] = esquina[3];
	} //fin for (a) [Rotaciones: 6]

	System.out.printf("Matriz cambiada:\n");
	for (i=0; i<12; i++) {
		for (j=0; j<12; j++) {
			System.out.printf("%3d ", matriz[i][j]);
		}
		System.out.println();
	}
	}
}
