
public class ArrayA {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random() * 50 ) + 51 ;
		}
		for(int i = 0 ; i< nums.length ; i++) {
			
			System.out.printf("%s\t",nums[i]);
		}
		for(int out = 0 ; out < nums.length ; out ++) {
			for(int in = out + 1 ; in < nums.length ; in ++) {
				if(nums[out] > nums[in]) {
					int temp = nums[in];
					nums[in] = nums[out];
					nums[out] = temp;
				}
			}
		}
		for(int i = 0; i < nums.length ; i++ ) {
			System.out.println(nums[i]);
		}
		
	}

}
