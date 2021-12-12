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
public class EquationOfDegreeTowExercise19 implements MathEquationExercise19{
	private int a,b,c;
	
	public List<Float> solveTheQquation() {
		List<Float> rs = new ArrayList<Float>();
		float delta = b*b - 4*a*c;
		rs.add((float) ((-b - Math.sqrt(delta))/(2*a))); 
		rs.add((float) ((-b + Math.sqrt(delta))/(2*a))); 
		
		return rs;
	}

	public void inputValue() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Giải phương trình bậc 2 ( a*x*x + b*x + c = 0 ):");
		System.out.print("nhập a: ");
		a = Integer.parseInt(scanner.nextLine());
		System.out.print("nhập b: ");
		b = Integer.parseInt(scanner.nextLine());
		System.out.print("nhập c: ");
		c = Integer.parseInt(scanner.nextLine());
		
	}
}
