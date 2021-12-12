package Java16_lesson1_NguyenDucNam.Exercise03;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JavaInformationExercise03 {

	public void print() {
		System.out.println("Viết chương trình in ra các thông tin về Java");
		String[] versionElements  = System.getProperty("java.runtime.version").split("\\-");
		
		System.out.print("Java Version: ");
		System.out.println(versionElements[0]);
		
		System.out.print("Java Runtime Version: ");
		System.out.println(System.getProperty("java.runtime.version"));
		
		System.out.print("Java Home: ");
		System.out.println(System.getProperty("java.home"));
		
		System.out.print("Java Vendor: ");
		System.out.println(System.getProperties().getProperty("java.vendor"));
		
		System.out.print("Java Vendor URL: ");
		System.out.println(System.getProperties().getProperty("java.vendor.url"));
		
		System.out.print("Java Class Path: ");
		System.out.println(System.getProperty("java.class.path"));
	}
}
