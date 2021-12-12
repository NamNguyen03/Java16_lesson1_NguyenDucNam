package Java16_lesson1_NguyenDucNam.Exercise06;

import java.util.Scanner;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyStringExercise06 {

	public String reverseString(String s) {
		char[] arr = s.toCharArray();
		String rs = "";

		for(char c : arr) {
			rs = c + rs;
		}

		return rs;
	}

	public void printReserveString(String s) {
		System.out.println("chuỗi vừa nhập vào: " + s);
		System.out.println("Chuỗi đảo ngược: " + reverseString(s));
	}

	public void inputReserveString() {
		System.out.println("Đảo chuỗi: ");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chuỗi cần đảo: ");
		String s = scanner.nextLine();
		printReserveString(s);
	}
}
