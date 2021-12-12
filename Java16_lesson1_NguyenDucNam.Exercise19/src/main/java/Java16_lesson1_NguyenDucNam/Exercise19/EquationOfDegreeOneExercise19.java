package Java16_lesson1_NguyenDucNam.Exercise19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EquationOfDegreeOneExercise19 implements MathEquationExercise19{
	private int a,b;
	
	public List<Float> solveTheQquation() {
		List<Float> rs = new ArrayList<Float>();
		rs.add((float) (-b*1.0/a));
		return rs;
	}

	public void inputValue() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Giải phương trình bậc 1 ( a*x + b = 0 ):");
		System.out.print("nhập a: ");
		a = Integer.parseInt(scanner.nextLine());
		System.out.print("nhập b: ");
		b = Integer.parseInt(scanner.nextLine());	
		
	}
}
