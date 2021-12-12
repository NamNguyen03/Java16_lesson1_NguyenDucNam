package Java16_lesson1_NguyenDucNam.Exercise20;

import java.util.Arrays;

public class ApplicationExercise20 {

	public static void main(String[] args) {
		MyArrayExercise20  myArray = new MyArrayExercise20 (Arrays.asList( 9 , 10 , 5 , 8 , 4 , 11, 21, 63, 54 , 47 , 48 ));

		System.out.println("Lấy phần tử chẵn");
		myArray.getEvenNumber().stream().forEach(System.out::println);

		System.out.println("Lấy phần tử lẻ");
		myArray.getOddNumber().stream().forEach(System.out::println);

	}

}
