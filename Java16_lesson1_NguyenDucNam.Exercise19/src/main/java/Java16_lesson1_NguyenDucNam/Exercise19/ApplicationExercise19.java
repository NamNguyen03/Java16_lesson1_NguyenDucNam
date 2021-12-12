package Java16_lesson1_NguyenDucNam.Exercise19;

import java.util.Scanner;

public class ApplicationExercise19 {
	
	public static void main(String[] args) {

		System.out.println("giải phương trình");

		MathEquationExercise19  mathEquation = new EquationOfDegreeOneExercise19 ();

		Scanner scanner = new Scanner(System.in);
		int action;
		do {
			action = 10;
			while(action != 0 && action != 1 && action != 2) {
				System.out.println("0. Thoát ");
				System.out.println("1. Giải phương trình bậc 1 ");
				System.out.println("2. Giải phương trình bậc 2 ");
				System.out.print("Chọn tác vụ: ");
				action = Integer.parseInt(scanner.nextLine());
			}

			switch (action) {
			case 1:
				mathEquation = new EquationOfDegreeOneExercise19 ();
				break;
			case 2:
				mathEquation = new EquationOfDegreeTowExercise19 ();
				break;

			default:
				break;
			}
			if(action != 0 ) {
				mathEquation.inputValue();
				System.out.println("Nghiệm của phương trình là");
				for(float x : mathEquation.solveTheQquation()) {
					System.out.println(x);
				}
			}
			
			
		}while(action != 0);
	}
	
}
