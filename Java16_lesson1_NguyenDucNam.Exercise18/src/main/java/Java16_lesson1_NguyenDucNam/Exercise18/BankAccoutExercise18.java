package Java16_lesson1_NguyenDucNam.Exercise18;

import Java16_lesson1_NguyenDucNam.Share.ExceptionNotFound;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BankAccoutExercise18 {
	private int cash;
	private int targetCash;
	
	public int getYear() throws ExceptionNotFound {
		if(targetCash < cash) {
			return 0;
		}
		
		BankExercise18 bank = BankExercise18.initialization();
		if(bank.getInterestRate() == 0) {
			throw new ExceptionNotFound("lãi xuất chưa được định nghĩa");
		}
		
		int i = 0;
		while (targetCash > cash) {
			i++;
			cash = (int) (cash *(1 + bank.getInterestRate()));
			
		}
		return i;
	}
}
