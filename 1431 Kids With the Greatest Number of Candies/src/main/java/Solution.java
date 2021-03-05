import java.util.ArrayList;
import java.util.List;

class Solution {
    public int largest(int[] arr)
    {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int larg = largest(candies);
        ArrayList<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies>= larg){
                res.add(true);
                continue;
            }
            res.add(false);
        }
        System.gc();
        return res;
    }
}