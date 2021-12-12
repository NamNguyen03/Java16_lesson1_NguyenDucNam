package Java16_lesson1_NguyenDucNam.Exercise16;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class YearExercise16 {
	private int year ;

	//kiểm tra năm nhuận
	//trả về true nếu là năm nhuận và ngược lại
	public boolean isLeapYear() {
		if(year % 400 ==0 || (year % 100 != 0 && year % 4 ==0)) {
			return true;
		}
		return false;
	}
}
