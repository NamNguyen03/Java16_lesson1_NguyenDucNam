package Java16_lesson1_NguyenDucNam.Exercise11;

import java.util.Scanner;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyNumberExercise11 {

	public Integer getNumber(int number) {
		return (int) (Math.log(number) / Math.log(2) -1);
	}
	
	public void printNumber(int number) {
		System.out.print("Số tự nhiên lớn nhất nhỏ hơn log2 (" + number + ") là: "  + getNumber(number));
	}
	
	public void inputNumber() {
		System.out.println("In các số tự nhiên lớn nhất nhỏ hơn log2(n).");
		System.out.print("Nhập số: ");
		Scanner scanner = new Scanner(System.in);
		int i = Integer.parseInt(scanner.nextLine());
		printNumber(i);
	}
}
