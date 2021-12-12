package Java16_lesson1_NguyenDucNam.Exercise21;

import java.util.Scanner;

public class ApplicationExercise21 {

	public static void main(String[] args) {
		System.out.println("2 con kangaroo");
		KangarooExercise21  kangaroo1 = new KangarooExercise21 (); 
		KangarooExercise21  kangaroo2 = new KangarooExercise21 (); 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhập x1: ");
		int a = Integer.parseInt(scanner.nextLine());
		kangaroo1.setX(a);
		
		System.out.println("nhập v1: ");
		a = Integer.parseInt(scanner.nextLine());
		kangaroo1.setV(a);
		
		System.out.println("nhập x2: ");
		a = Integer.parseInt(scanner.nextLine());
		kangaroo2.setX(a);
		
		System.out.println("nhập v2: ");
		a = Integer.parseInt(scanner.nextLine());
		kangaroo2.setV(a);
		
		if(((kangaroo2.getX() - kangaroo1.getX())*(kangaroo1.getV() - kangaroo2.getV())) <0 ) {
			System.out.println("2 con kangaroo không gặp nhau");
			return;
		}
		
		if(((kangaroo2.getX() - kangaroo1.getX())%(kangaroo1.getV() - kangaroo2.getV())) != 0 ) {
			System.out.println("2 con kangaroo không gặp nhau");
			return;
		}
		System.out.println("2 con kangaroo gặp nhau");

	}

}
