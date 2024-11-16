package practice_DSA;

public class RunningSumOf1dArray {

	public static void main(String[] args) {
		
//  Given an array nums. We define a running sum of an array as runningSum[i] =
//	sum(nums[0]…nums[i]). Means sum of nums[0] to nums[i]
//
//  Return the running sum of nums.
//
//  Example 1:
//
//  Input: nums = [1,2,3,4]
//  Output: [1,3,6,10]
//  Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		for (int i = 1; i < arr.length;i++) {
			
//			arr[i] = arr[i-1] + arr[i]; OR
			arr[i] += arr[i-1];
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}

}
