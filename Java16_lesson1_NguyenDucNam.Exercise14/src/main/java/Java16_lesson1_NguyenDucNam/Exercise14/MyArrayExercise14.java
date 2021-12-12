package Java16_lesson1_NguyenDucNam.Exercise14;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyArrayExercise14<T> {
	@Getter
	private List<T> arr;
	
	public MyArrayExercise14(List<T> arr) {
		this.setArr(arr);
	}
	
	public void setArr(List<T> arr) {
		this.arr = new ArrayList<T>();
		for(T item : arr) {
			if(!existByElement(item , this.arr)) {
				this.arr.add(item);
			}
		}
	}
	
	//tìm phần tử trùng lặp
	private boolean existByElement(T object, List<T>  arr) {
		if(arr.size() == 0) {
			return false;
		}
		for(T item : arr ) {
			if(item.equals(object)) {
				return true;
			}
		}
		return false;
	}

}
