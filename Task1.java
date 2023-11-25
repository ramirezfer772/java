
/*
 * 
 * Escribe un programa en Java que solicite al 
 * usuario ingresar las calificaciones de cinco asignaturas 
 * (pueden ser numeros enteros o decimales) y 
 * luego calcule y muestre en pantalla el promedio de estas calificaciones. 
 * 
 * Ademas, el programa debe indicar si el estudiante aprobo o reprobo, considerando que la calificacion mnima aprobatoria es 60.
 * 
 * */
 
 
import java.util.Scanner;


public class Task1 {
  public static void main(String[] args) {
	  
	System.out.println("Dame la calificacion de 5 asignaturas");
	
	int finalScore = 0;
	
    for (int i = 1; i <= 5; i++) {
		Scanner readScore = new Scanner(System.in);
		System.out.println("Escribre calificacion de asignatura " + i);
		int score = readScore.nextInt();
        finalScore = finalScore + score;
	}
	
	System.out.println("La suma de todas las calificaciones es: " + finalScore);
	
	int average = finalScore / 5;
	
	System.out.println("El promedio es:" + average);
	
	if (average > 60 ) {
		System.out.println("Aprobo");
	} else {
		System.out.println("Reprobo");
	}
 }
  
}


// 5 ->  (100, 100, 90, 80 , 100) / 5
