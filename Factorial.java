/*
 * 
 * Escribe un programa en Java que solicite al usuario ingresar un numero entero no negativo y luego calcule
 *  e imprima el factorial de ese numero. El factorial de un numero n se calcula como el producto de todos los enteros positivos desde 1 hasta 
n.

Puedes utilizar un bucle for para calcular el factorial y una estructura if para verificar si el numero ingresado es no negativo.
 * 
 * 
 * */

import java.util.Scanner;


public class Factorial {
  public static void main(String[] args) {
	  System.out.println("Escribe un numero entero no negativo");
	  
	  Scanner readNumber = new Scanner(System.in);
	  
	  int number = readNumber.nextInt();
	  
	  // Arreglar
	  if (number > 0) {
		  	  System.out.println("Error en el numero, debe ser un numero positivo");
	  }
	  

	  
	  int result = 1;
	  
	  for (int i = number; i > 0; i--) {
			result = result * i;
	  }
	  
	  
	  System.out.println("El factorial es: " + result);

	  
	}
}

