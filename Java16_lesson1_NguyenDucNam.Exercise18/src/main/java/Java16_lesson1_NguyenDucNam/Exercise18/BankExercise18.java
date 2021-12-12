package Java16_lesson1_NguyenDucNam.Exercise18;

import lombok.Getter;
import lombok.Setter;

public class BankExercise18 {
	@Getter @Setter
	private double InterestRate = 0;
	private static BankExercise18 instance = null;
	
	private BankExercise18() {
		
	}
	
	public static BankExercise18 initialization() {
		if(instance == null) {
			instance = new BankExercise18();
		}
		return instance;
	}
}
