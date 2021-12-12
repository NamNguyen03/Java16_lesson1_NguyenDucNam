package Java16_lesson1_NguyenDucNam.Exercise09;

import java.util.Scanner;

import lombok.NoArgsConstructor;

@NoArgsConstructor	
public class MyNumberExercise09 {
	
	public boolean checkTowNumber(int a , int b) {
		int i1, i2, i3, i4;
		i1 = a%10;
		i2 = a/10;
		i3 = b%10;
		i4 = b/10;
		
		if( i1 == i3 || i1 == i4 || i2 == i3 || i2 == i4) {
			return true;
		}
		
		return false;
	}
	
	public void printCheckTowNumber(int a, int b) {
		System.out.println("2 số vừa nhập vào là: " + a + ", " + b );
		System.out.println("hai số trên có cùng 1 hoặc 2 chữ số: " + checkTowNumber(a, b));
	}
	
	public void inputCheckTowNumber() {
		System.out.println("Viết chương trình cho phép nhập vào 2 số nguyên dương (từ 10 đến 99), in TRUE nếu 2 số trên có cùng một hoặc 2 chữ số, ngược lại in ra FALSE (VD: (12, 81) => true, (23, 89) => false)");
		Scanner scanner = new Scanner(System.in);
		
		int a = 1 , b = 1 ;
		do {
			System.out.print("Nhập số thứ nhất: ");
			a = Integer.parseInt(scanner.nextLine());
		} while (a < 10 || a > 100);
		
		do {
			System.out.print("Nhập số thứ hai: ");
			b = Integer.parseInt(scanner.nextLine());
		} while (b < 10 || b > 100);
		
		
		
		printCheckTowNumber(a, b);
	}
}
