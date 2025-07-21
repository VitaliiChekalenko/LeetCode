import java.util.ArrayList;
class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < nums.length/2; i++,n++) {
            temp.add(nums[i]);
            temp.add(nums[n]);
        }
        int[] done = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            done[i] = temp.get(i);
        }
        System.gc();
        return done;
    }
}