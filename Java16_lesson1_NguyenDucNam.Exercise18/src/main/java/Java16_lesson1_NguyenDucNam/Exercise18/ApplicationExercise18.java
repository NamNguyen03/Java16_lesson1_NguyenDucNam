package Java16_lesson1_NguyenDucNam.Exercise18;

import java.util.Scanner;

public class ApplicationExercise18 {

	public static void main(String[] args) {
		BankExercise18 bank = BankExercise18.initialization();
		bank.setInterestRate(0.07);
		
		System.out.println("Tính lãi xuất");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập số tiền cần gửi: ");
		int cash = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Nhập số tiền để mua ô tô: ");
		int targetCash = Integer.parseInt(scanner.nextLine());
		
		BankAccoutExercise18 bankAccout = new BankAccoutExercise18(cash , targetCash);
		
		try {
			System.out.print("Số năm cần gửi là: " + bankAccout.getYear() + " năm");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
