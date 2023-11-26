/*
Problema: Verificacion de Numero Par o Impar

Escribe un programa en Java que solicite al usuario ingresar un numero entero e imprima en la consola si ese numero es par o impar.

Puedes utilizar una estructura if para verificar si el numero es divisible por 2 (es decir, si su residuo al dividirlo por 2 es 0). Si es divisible por 2, entonces es par; de lo contrario, es impar.

*/


// Odd -> impar
// Event -> par

// if -> si, si pasa A haz B, si pasa C haz D


import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
	  //
	  
	  System.out.println("Ingresa un numero entero");
	  
	  Scanner readNumber = new Scanner(System.in);
	  
	  int number = readNumber.nextInt();
	  
	  System.out.println( "Modulo: " + number % 2 );
	  
	  if (number%2 == 0) {
		System.out.println("Es numero par");	
	  } else {
	    System.out.println("Es numero impar");		  
	  }
	  
	  
  }

}

