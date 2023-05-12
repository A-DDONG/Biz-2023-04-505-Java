
public class ArrayA {

	private static int prime(int num) {
		if (num >= 1 && num <= 100) {
			return num;
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}
		
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			j++;
			if (prime(nums[i]) > 0) {
			} else if (prime(nums[i]) < 0) {
				System.out.printf("테스트 횟수 : %d\n",j);
				System.err.printf("%s 번 테스트를 수행하려고 하였으나 %d번째에서 테스트에 실패함", nums.length,j);
				return;
			}
		}
		System.out.printf("테스트 횟수 : %d\n",j);
		System.out.printf("%d 번 테스트 수행 결과 1 ~ 100까지 범위의 랜덤수를 만들어 내고 있음",j);
	}
}
