import java.util.Scanner;

public class ScannerA {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;

		while (true) {
			System.out.println("정수를 입력하세요");
			System.out.println("정수 >> ");
			String strNum = scan.nextLine();
			try {
				num = Integer.valueOf(strNum);
				break;
			} catch (Exception e) {
				System.out.println("정수만 입력해주세요");
			}
		}
		int i = 0;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				break;
			}
		}
		if (i >= num) {
			System.out.println(num + " 는 소수");
		}
		if (i < num) {
			System.out.println(num + " 는 소수 아님");
		}

	}

}
