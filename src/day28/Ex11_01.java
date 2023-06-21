package day28;

public class Ex11_01 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 4 == 0) {
				total += i;
			}
		}
		System.out.println(total);
	}
}
