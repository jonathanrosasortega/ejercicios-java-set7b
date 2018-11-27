/*Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8

Ejemplo:
Introduzca la posición del alfil: d5
El álfil puede moverse a las siguientes posiciones:
h1 a2 g2 b3 e3 c4 e4 c6 e6 b7 f7 a8 g8

"%c", nombrecadenacaracteres.charAt(0)
*/
public class ej8 {
	public static void main(String[] args) {
	String posicion;
	int fila;
	int columna;
	/*NO TERMINADO
	String[] posiciones = new String[15];*/
	int numPosiciones = 0;
	int x;
	int y;

	System.out.println("¿En qué posición se encuentra el alfil?: ([LetraNúmero o ColumnaFila] Ej.: f5)");
	posicion = System.console().readLine();
	columna = (int)(posicion.charAt(0)) - 97; //Letra (Se pasa a entero)
	fila = (int)(posicion.charAt(1)) - 49; // Número tipo Char (Se pasa a entero)

	System.out.println("El álfil puede moverse a las siguientes posiciones:");
	//Calculo de posiciones
	int a=columna;
	int b=fila;
	while ((a>=0) && (b>=0)){
		a--;
		b--;
		if ((a>=0) && (b>=0)) {
      		switch (a) {
        	case 0:
        		System.out.print("a");
        	break;
        	case 1:
      			System.out.print("b");
      		break;
      		case 2:
      			System.out.print("c");
	      	break;
	      	case 3:
	      		System.out.print("d");
	      	break;
	      	case 4:
	      		System.out.print("e");
	      	break;
	      	case 5:
	      		System.out.print("f");
	      	break;
	      	case 6:
	      		System.out.print("g");
	      	break;
	      	case 7:
	      		System.out.print("h");
	      	break;
	      	default:
        } // fin switch
    	System.out.printf("%d ", b+1);
    } // fin if
	} // Esquina superior izquierda (fin while)

	a=columna;
	b=fila;
	while ((a<=7) && (b>=0)){
		a++;
		b--;
		if ((a<=7) && (b>=0)) {
      		switch (a) {
        	case 0:
        		System.out.print("a");
        	break;
        	case 1:
      			System.out.print("b");
      		break;
      		case 2:
      			System.out.print("c");
	      	break;
	      	case 3:
	      		System.out.print("d");
	      	break;
	      	case 4:
	      		System.out.print("e");
	      	break;
	      	case 5:
	      		System.out.print("f");
	      	break;
	      	case 6:
	      		System.out.print("g");
	      	break;
	      	case 7:
	      		System.out.print("h");
	      	break;
	      	default:
        } // fin switch
        System.out.printf("%d ", b+1);
		} // fin if
    	
	} // Esquina superior derecha (fin while)

	a=columna;
	b=fila;
	while ((a>=0) && (b<=7)){
		a--;
		b++;
		if ((a>=0) && (b<=7)) {
      		switch (a) {
        	case 0:
        		System.out.print("a");
        	break;
        	case 1:
      			System.out.print("b");
      		break;
      		case 2:
      			System.out.print("c");
	      	break;
	      	case 3:
	      		System.out.print("d");
	      	break;
	      	case 4:
	      		System.out.print("e");
	      	break;
	      	case 5:
	      		System.out.print("f");
	      	break;
	      	case 6:
	      		System.out.print("g");
	      	break;
	      	case 7:
	      		System.out.print("h");
	      	break;
	      	default:
        } //fin switch
        System.out.printf("%d ", b+1);
		} // fin if
    	
	} // Esquina inferior izquierda (fin while)

	a=columna;
	b=fila;
	while ((a<=7) && (b<=7)){
		a++;
		b++;
		if ((a<=7) && (b<=7)) {
      		switch (a) {
        	case 0:
        		System.out.print("a");
        	break;
        	case 1:
      			System.out.print("b");
      		break;
      		case 2:
      			System.out.print("c");
	      	break;
	      	case 3:
	      		System.out.print("d");
	      	break;
	      	case 4:
	      		System.out.print("e");
	      	break;
	      	case 5:
	      		System.out.print("f");
	      	break;
	      	case 6:
	      		System.out.print("g");
	      	break;
	      	case 7:
	      		System.out.print("h");
	      	break;
	      	default:
        } // fin switch
        System.out.printf("%d ", b+1);
		} // fin if
    	
	} // Esquina inferior derecha (fin while)

	} // fin main
} //fin public class
