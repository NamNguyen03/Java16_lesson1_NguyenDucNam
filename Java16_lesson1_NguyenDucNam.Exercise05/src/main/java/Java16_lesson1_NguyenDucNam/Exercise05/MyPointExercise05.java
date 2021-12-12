package Java16_lesson1_NguyenDucNam.Exercise05;

import java.util.Scanner;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyPointExercise05 {

	public float getDistance(int x1 , int y1 , int x2 , int y2) {
		return (float) Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
	}
	
	public void printDistance(int x1 , int y1 , int x2 , int y2) {	
		System.out.print("khoảng cách giữu hai điểm ( " + x1 + " ; " + y1 + " ) và ( " + x2 +" ; " + y2 +" ) : " + getDistance(x1, y1, x2, y2) );	
	}
	
	public void inputPoit() {
		Scanner scanner = new Scanner(System.in);
		int x1, y1 , x2, y2;
		
		System.out.println("Tính khoảng cách giữu 2 điểm trong tọa: ");
		
		System.out.println("Nhập tọa độ x1: ");
		x1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Nhập tọa độ y1: ");
		y1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Nhập tọa độ x2: ");
		x2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Nhập tọa độ y2: ");
		y2 = Integer.parseInt(scanner.nextLine());	
		
		printDistance(x1, y1, x2, y2);
	}
}
