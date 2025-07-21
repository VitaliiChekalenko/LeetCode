class Solution {
    public int maximumWealth(int[][] accounts) {

        int res = 0;
        int temp = 0;

        for (int i = 0; i <accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            res = Math.max(temp, res);
            temp =0;
        }
        System.gc();
        return res;
    }
}