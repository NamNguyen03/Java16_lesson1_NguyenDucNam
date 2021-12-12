package Java16_lesson1_NguyenDucNam.Exercise10;

import java.util.Scanner;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyNumberExercise10 {
	public int getSumNumber(int number) {
		if(number < 0) {
			
			return 0;
		}
		
		if(number%2 ==0) {
			return (number+1)*number/2;
		}
	
		number--;
		return (number+1)*number/2 + number +1;
	}
	
	public void printSumNumber(int number) {
		System.out.println("Tổng các số từ 1 đến " + number + " là: " + getSumNumber(number));
	}
	
	public void inputSumNumber() {
		System.out.println("Tính tổng các số từ 1 đến n.");
		System.out.print("Nhập số: ");
		Scanner scanner = new Scanner(System.in);
		int i = Integer.parseInt(scanner.nextLine());
		printSumNumber(i);
	}
}
