package Java16_lesson1_NguyenDucNam.Exercise13;

import java.util.Arrays;

public class ApplicationExercise13 {
	public static void main(String[] args) {
		MyArrayExercise13  myArray = new MyArrayExercise13 (Arrays.asList( 9 , 10 , 5 , 8 , 4 , 22 , 29, -111 , -2 , -36 ));
	
		System.out.println("Giá trị trung bình: " + myArray.getAvg());
		System.out.println("Giá trị lớn nhất: " + myArray.getMax());
		System.out.println("Giá trị nhỏ nhất: " + myArray.getMin());
		
		System.out.print("Giá trị âm lớn nhất: ");
		try {
			System.out.println(myArray.getMaxNegative());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.print("Giá trị âm nhỏ nhất: ");
		try {
			System.out.println(myArray.getMinNegative());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.print("Giá trị dương lớn nhất: ");
		try {
			System.out.println(myArray.getMaxPositive());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.print("Giá trị dương nhỏ nhất: ");
		try {
			System.out.println(myArray.getMinPositive());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		System.out.println("Các phần tử chẵn: ");
		myArray.getEvenNumber().stream().forEach(System.out::println);
		
		System.out.println("Các phần tử lẻ: ");
		myArray.getOddNumber().stream().forEach(System.out::println);
		
		for(int i : myArray.getArr()) {
			System.out.print( i + "; ");
		}
		
		System.out.println("");
		System.out.println("thêm phần tử 998 và vị trí số 2");
		myArray.addWithIndex(2, 998);
	
		for(int i : myArray.getArr()) {
			System.out.print( i + "; ");
		}
	
		System.out.println("");
		System.out.println("xóa phần ở trí số 4");
		myArray.removeWithIndex(4);
		
		for(int i : myArray.getArr()) {
			System.out.print( i + "; ");
		}
		
	}
}
