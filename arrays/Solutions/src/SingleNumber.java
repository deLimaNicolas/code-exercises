package Solutions.src;

public class SingleNumber {
	public static int getNonDuplicata(int[] nums) {
		int response = 0;

		for (int i = 0; i < nums.length; i++) {
			response ^= nums[i];
		}

		return response;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 3, 4, 2, 4 };
		int response = SingleNumber.getNonDuplicata(nums);
		System.out.println(response);
	}
}
