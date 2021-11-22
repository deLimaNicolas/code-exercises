package Solutions.src;

import java.util.HashSet;

public class ContainsDuplicate {
	public static boolean contains(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			}

			set.add(nums[i]);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 5 };
		boolean response = ContainsDuplicate.contains(nums);
		System.out.println(response);
	}
}
