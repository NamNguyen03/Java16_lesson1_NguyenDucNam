package Java16_lesson1_NguyenDucNam.Exercise07;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyNumberExercise07 {
	
	public ArrayList<Integer> getDivisor(int number){
		ArrayList<Integer> rs = new ArrayList<Integer>();
		for(int i =1 ; i <= Math.sqrt(number) ; i++) {
			if(number%i ==0) {
				rs.add(i);
				if(i !=  Math.sqrt(number)) {
					 rs.add(number/i);
				}
			}
		}
		return rs;
	}
	
	public void prinDivisor(int number) {
		System.out.print("Các ước số tự nhiên của " + number + " là: ");
		ArrayList<Integer> arr = getDivisor(number);
		for(int i : arr) {
			System.out.print( i + ", ");
		}
	}
	
	public void inputNumber() {
		System.out.println("In ước số");
		System.out.print("Nhập số: ");
		Scanner scanner = new Scanner(System.in);
		int i = Integer.parseInt(scanner.nextLine());
		prinDivisor(i);
		
	}
}
