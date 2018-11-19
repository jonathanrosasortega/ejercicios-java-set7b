/*Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.*/
public class ej4 {
	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(1000);
		System.out.printf("%d\n", sumatorio);
		sumatorioTotal += sumatorio;
		Thread.sleep(1000);
	}

	//última linea
	System.out.printf("Sumas:	");	
	for (j=0; j<5; j++) {
		sumatorio = 0;
		for (i=0; i<4; i++) {
			sumatorio += num[i][j];
		}
		Thread.sleep(1000);
		System.out.printf("%d	", sumatorio);
		Thread.sleep(1000);
	}

	System.out.printf("%d", sumatorioTotal);
	System.out.printf("\nFIN\n");
   
	}
}
