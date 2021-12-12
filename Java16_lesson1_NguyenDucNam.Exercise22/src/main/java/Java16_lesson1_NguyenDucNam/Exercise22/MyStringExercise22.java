package Java16_lesson1_NguyenDucNam.Exercise22;

import lombok.Getter;
import lombok.Setter;


public class MyStringExercise22 {
	@Getter
	@Setter
	private String string;

	private PalindromicExercise22 palindromic;

	private String palindromicString;
	
	public MyStringExercise22(String string) {
		this.string = string;
		palindromic = new PalindromicExercise22(0, 0);
	}
	public MyStringExercise22() {
		palindromic = new PalindromicExercise22(0, 0);
	}
	

	public String getPalindromicString() {
		for(int i=0 ; i< string.length() ; i++) {
			getSubPalindromicString(i);
		}
		return palindromicString;
	}

	private void getSubPalindromicString(int positionMid) {
		int size = 2 , palindromicSize = palindromic.getSize();

		if(palindromicSize > 2) {
			size = palindromicSize % 2 == 0 ? palindromicSize + 2  : palindromicSize +1;  
		}

		for(;(positionMid - size/2 -1) >= 0 && (positionMid + size/2 -1) <= string.length() ; size += 2 ) {
			String s = string.substring(positionMid - 1 - size/2, positionMid +  -1 + size /2);
			if(checkPalindromicString(s) && palindromic.getSize() < size) {
				palindromic = new PalindromicExercise22(positionMid, size);
				palindromicString = s;
			}
		}

		size = 1; 
		if(palindromicSize > 2) {
			size = palindromicSize % 2 == 1 ? palindromicSize + 2  : palindromicSize +1;  
		}
		for(;(positionMid - size/2 ) >= 0 && (positionMid + size/2 +1) <= string.length() ; size += 2 ) {
			String s = string.substring(positionMid - size/2, positionMid + size /2 +1);
			if(checkPalindromicString(s) && palindromic.getSize() < size) {
				palindromic = new PalindromicExercise22(positionMid, size);
				palindromicString = s;
				
			}
		}

	}

	private boolean checkPalindromicString(String s) {
		for(int i= 0 ; i< s.length() ; i++) {
			if(s.charAt(i) != s.charAt(s.length() - 1 -i)) {
				return false;
			}
		}
		return true;
	}
}
