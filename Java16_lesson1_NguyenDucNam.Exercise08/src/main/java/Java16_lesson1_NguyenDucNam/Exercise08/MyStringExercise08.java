package Java16_lesson1_NguyenDucNam.Exercise08;

import java.util.Scanner;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyStringExercise08 {

	public String toUpperCaseFirstString(String s) {
		String rs = "" + s.charAt(0);
		rs = rs.toUpperCase();
		
		for(int i=1; i< s.length() ; i++) {
			rs += s.charAt(i);
		}
		
		return rs;
	}
	
	public void prinnteToUpperCaseFirstString(String s) {
		System.out.println("chuỗi vừa nhập vào: " + s);
		System.out.println("Chuỗi được in hoa chữ đầu: " + toUpperCaseFirstString(s));
	}
	
	public void inputToUpperCaseFirstString() {
		System.out.println("Viết chương trình cho phép nhập vào một chuỗi viết thường, in ra chuỗi trên với các ký tự đầu tiên được viết in hoa: ");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String s = scanner.nextLine();
		prinnteToUpperCaseFirstString(s);
	}
}
