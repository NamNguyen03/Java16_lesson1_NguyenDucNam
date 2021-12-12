package Java16_lesson1_NguyenDucNam.Exercise04;

import java.util.Scanner;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyNumberExercise04 {

	public int sum(int number) {
		int rs = 0;
		while (number % 10 !=0) {
			rs += number % 10;
			number = number/10;
		}
		
		return rs;
	}
	
	public void printSum(int number) {
		System.out.println("số vừa nhập: " + number);
		System.out.println("Tổng các chữ số: " + sum(number));
	}
	
	public void inputNumber() {
		System.out.println(" Viết chương trình cho phép nhập vào một số tự nhiên và in ra tổng các chữ số của số tự nhiên đó.");
		
		System.out.println("Nhập số: ");
		Scanner scanner = new Scanner(System.in);
		int i = Integer.parseInt(scanner.nextLine());
		
		printSum(i);
	}
}
