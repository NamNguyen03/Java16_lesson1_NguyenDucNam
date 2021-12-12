package Java16_lesson1_NguyenDucNam.Exercise13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Java16_lesson1_NguyenDucNam.Share.ExceptionNotFound;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyArrayExercise13 {
	private List<Integer> arr;
	
	// lấy giá trị trung bình
	public int getAvg() {
		int sum = 0;
		for(int i : arr ) {
			sum += i ;
		}
		return sum/arr.size();
	}

	// lấy giá trị lớn nhất
	public int getMax() {
		int max = arr.get(0);
		for(int i : arr ) {
			if(max < i ) {
				max = i;
			}
		}

		return max;
	}

	// lấy giá trị nhỏ nhất
	public int getMin() {
		int min = arr.get(0);
		for(int i : arr ) {
			if(min > i ) {
				min = i;
			}
		}

		return min;
	}

	// lấy giá trị âm lớn nhất
	public int getMaxNegative() throws ExceptionNotFound {
		int max = 0;

		for(int i : arr ) {
			if((max < i || max == 0) && i < 0) {
				max = i;
			}
		}

		if (max == 0) {
			throw new ExceptionNotFound("Không tìm thấy giá trị âm lớn nhất");
		}

		return max;
	}

	// lấy giá trị âm nhỏ nhất
	public int getMinNegative() throws ExceptionNotFound {
		int min = 0;

		for(int i : arr ) {
			if((min > i || min ==0) && i < 0) {
				min = i;
			}
		}

		if (min == 0) {
			throw new ExceptionNotFound("Không tìm thấy giá trị âm nhỏ nhất");
		}

		return min;
	}

	// lấy giá trị dương lớn nhất
	public int getMaxPositive() throws ExceptionNotFound {
		int max = 0;

		for(int i : arr ) {
			if((max < i || max ==0)  && i > 0) {
				max = i;
			}
		}

		if (max == 0) {
			throw new ExceptionNotFound("Không tìm thấy giá trị dương lớn nhất");
		}

		return max;
	}

	// lấy giá trị dương nhỏ nhất
	public int getMinPositive() throws ExceptionNotFound {
		int min = 0;

		for(int i : arr ) {
			if((min > i || min == 0)  && i > 0) {
				min = i;
			}
		}

		if (min == 0) {
			throw new ExceptionNotFound("Không tìm thấy giá trị dương nhỏ nhất");
		}

		return min;
	}

	//lấy phần tử chẵn
	//chạy tốt trên JavaSE 
	public List<Integer> getEvenNumber() {
		return  arr.stream().filter(num -> num % 2 == 0 ).collect(Collectors.toList());
	}

	//lấy phần tử lẻ
	public List<Integer> getOddNumber() {
		return  arr.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
	}

	//thêm 1 phần tử theo index
	public void addWithIndex(int index, int value) {
		List<Integer> rs = new ArrayList<Integer>();

		for(int i= 0 ; i < arr.size() ; i++) {
			if(i== index) {
				rs.add(value);
			}
			rs.add(arr.get(i));
		}
		arr = rs;
	}

	//xóa 1 phần tử theo index
	public void removeWithIndex(int index) {

		List<Integer> rs = new ArrayList<Integer>();

		for(int i= 0 ; i < arr.size() ; i++) {
			if(i != index) {
				rs.add(arr.get(i));
			}
		
		}
		arr = rs;
	}

	public static void main(String[] args) {
			System.out.println("");
	}
}
