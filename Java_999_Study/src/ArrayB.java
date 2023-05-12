
public class ArrayB {

	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;
	}

	public static void main(String[] args) {

		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;

		}
		for (int i = 0; i < nums.length; i++) {
			if (prime(nums[i]) > 0) {
				System.out.println(nums[i] + " 는 소수");
			} else {
				System.out.println(nums[i] + " 는 소수 아님");
			}
		}
	}

}
