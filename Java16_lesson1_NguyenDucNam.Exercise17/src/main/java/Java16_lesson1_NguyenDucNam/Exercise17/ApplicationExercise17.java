package Java16_lesson1_NguyenDucNam.Exercise17;

import java.util.Scanner;

public class ApplicationExercise17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Chương trình cho phép máy tính phát sinh ngẫu nhiên một số từ 1 đến 1000. Người dùng sẽ đoán và nhập, nếu đúng với kết quả của máy, game sẽ dừng. Ngược lại máy sẽ báo bạn đang nhập một số lớn hơn hoặc nhỏ hơn số bí mật");
		
		MyNumberExercise17 myNumber = new MyNumberExercise17();
		
		boolean isCheck = false;
		int i =0;
		do {
			System.out.print("Nhập số: ");
			Scanner scanner = new Scanner(System.in);
			i = Integer.parseInt(scanner.nextLine());
			
			isCheck  = myNumber.checkNumber(i); 
		}while(!isCheck);
	}

}
