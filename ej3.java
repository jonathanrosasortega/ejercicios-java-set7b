/*Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999)*/
public class ej3 {
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
			num[i][j] = (int)(Math.random()*900)+100;
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
