package Solutions.src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
	private static int[] toArray(List<Integer> list) {
		int[] ret = new int[list.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = list.get(i).intValue();
		}
		return ret;
	}

	public static int[] getIntersection(int[] nums1, int[] nums2) {
		int indexNums1 = 0;
		int indexNums2 = 0;
		List<Integer> intersection = new ArrayList<>();
		while (indexNums1 < nums1.length && indexNums2 < nums2.length) {
			int nums1Val = nums1[indexNums1];
			int nums2Val = nums2[indexNums2];

			if (nums1Val == nums2Val) {
				intersection.add(nums1Val);

				indexNums1++;
				indexNums2++;
			} else if (nums1Val < nums2Val) {
				indexNums1++;
			} else {
				indexNums2++;
			}
		}

		return toArray(intersection);
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] response = IntersectionOfTwoArrays.getIntersection(nums1, nums2);
		System.out.println(response);
	}
}
