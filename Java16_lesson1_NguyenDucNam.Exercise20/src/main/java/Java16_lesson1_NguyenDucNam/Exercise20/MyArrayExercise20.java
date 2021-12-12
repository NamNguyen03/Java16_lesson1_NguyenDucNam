package Java16_lesson1_NguyenDucNam.Exercise20;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyArrayExercise20 {
	private List<Integer> arr;
	
	//lấy phần tử chẵn
	//chạy tốt trên JavaSE 
	public List<Integer> getEvenNumber() {
		return  arr.stream().filter(num -> num % 2 == 0 ).collect(Collectors.toList());
	}

	//lấy phần tử lẻ
	public List<Integer> getOddNumber() {
		return  arr.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
	}
}
