//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

class Solution {
    public int[] runningSum(int[] nums) {

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 0; j <=i ; j++) {
                temp = temp+nums[j];
            }

            res[i] = temp;
        }
        System.gc();
        return res;

    }
}