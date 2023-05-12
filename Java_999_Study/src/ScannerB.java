import java.util.Scanner;

public class ScannerB {
	
	private static int getNum() {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			System.out.println("양의 정수를 입력하세요");
			System.out.println("정수(QUIT : 종료) >> ");
			String strNum = scan.nextLine();
			if(strNum.equals("QUIT")) {
				return -1;
			}
			try {
				num = Integer.valueOf(strNum);
				if(num >=3 ) {
					break;
				}
			} catch (Exception e) {
				System.out.println("정수만 입력하세요");
			}
		}
		return num;
		}
		public static int prime(int num) {
			int index = 0;
			for(index = 2; index < num ; index++) {
				if(num % index == 0) {
					return -1;
				}
			}
			return num;
		}
		public static void main(String[] args) {
			while(true) {
				int num = getNum();
				if( num < 0) {
					System.out.println("GAME OVER");
					return;
				}
				int result = prime(num);
				if(result > 0) {
					System.out.println(num + " 는 소수");
				} else {
					System.out.println(num + " 는 소수아님");
				}
			}
		}

}
