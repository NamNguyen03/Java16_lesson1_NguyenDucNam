package Java16_lesson1_NguyenDucNam.Exercise02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyNumberExercise02 {

	public String converBaseTenToBaseTow(int number) {
		List<Boolean> arr = new ArrayList<Boolean>();
		do {
			arr.add( number%2 == 1);
			number /= 2;
		}while(number!=0);
		String rs = "";
		for(boolean a : arr) {
			rs = (a ? "1" : "0" )+ rs;
		}
		
		return rs;
	}
	
	public void printBaseTow(int number) {
		System.out.println("Hệ cơ số 10 là: " + number);
		System.out.println("Hệ cơ số 2 là: " + converBaseTenToBaseTow(number));
	}
	
	public void inputValueBaseTen() {
		printBaseTow(Integer.parseInt(inputValue("Viết chương trình chuyển đổi số từ hệ cơ số 10 sang hệ cơ số nhị phân.")));
	}
	
	private String inputValue(String printOut) {
		System.out.println(printOut);
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập số: " );
		String rs = scanner.nextLine();
		return rs;
	}
	
	public int converBaseTowToBaseTen(String number) {
		int rs = 0, length = number.length();
	
		for(int i = length; i> 0 ; i--) {
			if(number.charAt(length - i) == '1' ) {
				rs += Math.pow(2,i-1);
			}
		}
		return rs;
	}

	public void printBaseTen(String number) {
		System.out.println("Hệ cơ số 2 là: " + number);
		System.out.println("Hệ cơ số 10 là: " + converBaseTowToBaseTen(number));
	}
	
	public void inputValueBaseTow() {
		printBaseTen(inputValue("Viết chương trình chuyển đổi số từ hệ cơ số nhị phân sang hệ cơ số 10."));
	}
}
