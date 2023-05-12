import java.util.ArrayList;
import java.util.List;

public class ListA {

	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return -1;
			}
		}
		return num;
	}
	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<>();
		int rndNum = (int) (Math.random() * 50) + 51;

		for (int i = 0; i < 30; i++) {
			numList.add((int) (Math.random() * 50) + 51);
		}
		int k = 0;
		int sum = 0;
		for (int i = 0; i < 30; i++) {
			if (prime(numList.get(i)) > 0) {
				k++;
				sum += numList.get(i);
			}
		}
		System.out.printf("소수 개수 : %d\n", k);
		System.out.printf("소수의 합 : %d", sum);
	}
}
