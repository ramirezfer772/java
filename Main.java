import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	
	  // scanner
	  Scanner read = new Scanner(System.in);

	  // Imprimir
	  System.out.println("Hello World");
    
      // Espera al usuario escriba un texto y lo guarda en la variable text
      String text = read.nextLine();
      // Espera al usuario escriba un numero y lo guarda en la variable number
      int number = read.nextInt(); 
    
      System.out.println(text);
      
      System.out.println(number);
      
      
      // un for que va a iterar 10 veces e imprimir el valor de i
      for (int i = 0; i <= 10; i++) {
		System.out.println(i);
	  }
	  
	  System.out.println("------------");
	  
	  // un for que va a iterar 3 veces e imprimir el valor de j
      for (int j = 0; j <= 3; j++) {
		System.out.println(j);
	  }
	  
	  if () {}
	  
	  
	  int value = 3;
	  
	  switch(value) {
		  case 1:
			System.out.println("El valor es 1");
			// code block
			break;
		  case 2:
			System.out.println("El valor es 2");
			// code block
			break;
		  default:
			System.out.println("El valor no es ni 1 ni 2");
			// code block
		}
  }
}
