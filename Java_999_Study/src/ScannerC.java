import java.util.Scanner;

public class ScannerC {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		while(true) {
			System.out.println("두 개의 정수 입력");
			System.out.println("정수1 >> ");
			num1 = scan.nextInt();
			if(num1 < 0) {
				break;
			}
			System.out.println("정수2 >> ");
			num2 = scan.nextInt();
			if(num2 < 0) {
				break;
			}
			System.out.println(num1 + num2);
		}
		System.out.println("종료");
	}

}
