package Java16_lesson1_NguyenDucNam.Exercise01;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FlagExecise01{

	public void run() {
		System.out.println("1. Viết chương trình in quốc kỳ Mỹ");

		for(int i=0 ; i<4 ;i++) {
			printAsterisk(6);
			System.out.print("  ");
			printEqualSign(30);
			System.out.print(" ");
			printAsterisk(5);
			System.out.print("   ");
			printEqualSign(30);
		}

		printAsterisk(6);
		System.out.print("  ");
		printEqualSign(30);

		for(int i=0 ; i<5 ;i++) {
			printEqualSign(44);
		}
	}

	//index is the number of printed elements
	private void printAsterisk(int index) {
		for(int i=0 ; i < index ; i++) {
			System.out.print("* ");
		}
	}

	//index is the number of printed elements
	private void printEqualSign(int index) {
		for(int i=0 ; i < index ; i++) {
			System.out.print("=");
		}
		System.out.println("");
	}
}
