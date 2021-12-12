package Java16_lesson1_NguyenDucNam.Exercise12;

import java.util.Scanner;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TriangleExercise12 {

	public void printTriangle(int index) {
		for(int i= 1 ; i <= index ; i++ ) {
			for(int j = 0; j < i ; j++ ) {
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}

	public void inputTriangle() {
		System.out.println("Viết chương trình cho phép nhập vào số tự nhiên n (từ 1 đến 9) và in ra tam giác vuông có độ dài tương ứng.");
		System.out.print("Nhập chiều cao của tam giác: ");
		
		Scanner scanner = new Scanner(System.in);
		int i = Integer.parseInt(scanner.nextLine()); 
		
		printTriangle(i);
	}
	
}
