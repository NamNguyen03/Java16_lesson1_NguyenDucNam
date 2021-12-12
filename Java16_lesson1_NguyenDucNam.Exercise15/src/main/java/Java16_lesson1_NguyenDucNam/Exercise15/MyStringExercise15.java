package Java16_lesson1_NguyenDucNam.Exercise15;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyStringExercise15 {
	private String string;
	
	public int getLenghth() {
		return string.length();
	}
	
	public char getCharAt(int index) {
		return string.charAt(index);
	}
			
	public boolean checkSubString() {
		return string.contains("abcdef");
	}
	
}
