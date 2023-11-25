
import java.util.Scanner;


public class Output {
  public static void main(String[] args) {
	 Scanner readAge = new Scanner(System.in);
		 
	 System.out.println("Escribe tu edad");
	 int age = readAge.nextInt();
	 System.out.println("Tu edad es: " + age);
	

	 Scanner readName = new Scanner(System.in);
	 
	 System.out.println("Escribe tu nombre");
	 String name = readName.nextLine();
	 System.out.println("Tu nombre es: " + name);
	  
  }
  
}

