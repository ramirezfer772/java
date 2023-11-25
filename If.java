
import java.util.Scanner;

public class If {
  public static void main(String[] args) {
	  Scanner readAge = new Scanner(System.in);
	  
	  System.out.println("Escribe tu edad");
	  
	  String name = "Fernando-2";
	  String motherName = "Martha-2";

	  int age = readAge.nextInt();
	  
	  if (age >= 18) {
		 System.out.println("Obtener credencial de elector");
	  } else {
			System.out.println("No tendras tu credencial");
	  }
	  
	  
	  if (age >= 0 && age <= 50) { // && (AND) con uno que no se cumpla, la condicion ya no se cumple
		  System.out.println("tienes entre 0 a 50 anios");
	  } // else if () {}
	  
	  if (age >= 0 && name == "Fernando") {
		  System.out.println("Eres Fernando y tienes mas de 0 anios");
	  }
	  
	  if (name == "Fernando" || motherName == "Kim") { // || (OR)
			System.out.println("el nombre es Fernando o el nombre de la mama es Martha");
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*
	  System.out.println("Escribe tu nombre");
	  
	  Scanner readName = new Scanner(System.in);
	  
	  String name = readName.next();
	  System.out.println(name)	;
	  
	  
	  if (name == "Emir") { // dos igual ==, es como preguntar
		  System.out.println("Eres emir");
	  } else if (name == "Fernando") {
		  System.out.println("Eres Fernando");
	  } else if (name == "Martha") {
		  System.out.println("Eres Martha");
	  } else {
		System.out.println("No es Emir ni Fernando, ni Martha");
	  }
	  */
	  
	}
}

