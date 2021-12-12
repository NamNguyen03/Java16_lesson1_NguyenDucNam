package Java16_lesson1_NguyenDucNam.Exercise14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationExercise14 {

	public static void main(String[] args) {
		System.out.println(" Viết chương trình cho phép nhập vào số phần tử và từng phần tử của một mảng. Xóa đi các phần tử bị lặp lại");

		List<String> arr = new ArrayList<String>(Arrays.asList("meo", "cho", "voi",
				"ca", "chuot" , "bo" , "meo" , "trau" , "ca", "ca", "chuot", "heo" ,"voi" ));

		MyArrayExercise14<String> array = new MyArrayExercise14<String>(arr);

		for(String s : array.getArr()) {
			System.out.println(s);
		}


	}

}
