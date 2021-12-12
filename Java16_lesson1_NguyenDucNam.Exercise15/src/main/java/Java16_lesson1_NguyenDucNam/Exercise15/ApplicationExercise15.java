package Java16_lesson1_NguyenDucNam.Exercise15;

public class ApplicationExercise15 {
	
	public static void main(String[] args) {
		MyStringExercise15 myString = new MyStringExercise15("namabcdefssda");
		System.out.println("ký tự ở vị trí số 8: " + myString.getCharAt(8));
		System.out.println("Độ dài chuỗi: " + myString.getLenghth());
		System.out.println(myString.checkSubString());
	}
}
