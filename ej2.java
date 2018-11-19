/*Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.*/
public class ej2 {
	public static void main(String[] args) {
	int[][] num = new int[4][5];

	//System.out.println("Introducción:");
	int i;
	int j;
	int sumatorio = 0;
	int sumatorioTotal = 0;
	
	System.out.println("num	colum0	colum1	colum2	colum3	colum4	Sumas\n");
	for (i=0; i<4; i++) {
		System.out.printf("Fila %d	", i);
		sumatorio = 0;
		for (j=0; j<5; j++) {
			num[i][j] = (int)(Math.random()*11);
			System.out.printf("%d	", num[i][j]);
			sumatorio += num[i][j];
		}
		System.out.printf("%d\n", sumatorio);
		sumatorioTotal += sumatorio;
	}

	//última linea
	System.out.printf("Sumas:	");	
	for (j=0; j<5; j++) {
		sumatorio = 0;
		for (i=0; i<4; i++) {
			sumatorio += num[i][j];
		}
		System.out.printf("%d	", sumatorio);
	}

	System.out.printf("%d", sumatorioTotal);
	System.out.printf("\nFIN\n");
   
	}
}
