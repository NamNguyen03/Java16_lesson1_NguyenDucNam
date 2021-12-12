package Java16_lesson1_NguyenDucNam.Exercise17;

import java.util.Random;

import lombok.Data;

@Data
public class MyNumberExercise17 {
	private int number;

	public MyNumberExercise17() {
		super();
		Random rn = new Random();
		int i = rn.nextInt() % 500 + 500;
		
		this.number = i;
	}

	public boolean checkNumber(int number) {
		if(number == this.number) {
			return true;
		}
		if(number > this.number){
			System.out.println("Nhỏ hơn");
		}
		if(number < this.number){
			System.out.println("Lớn hơn");
		}
		return false;
	}
}
