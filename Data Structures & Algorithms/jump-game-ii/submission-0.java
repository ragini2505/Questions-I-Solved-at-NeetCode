class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        java.util.Arrays.fill(dp,-1);
        return solve(0, nums, dp);
    }

    private int solve(int ind, int[] nums, int[] dp){
        if(ind >= nums.length-1) return 0;
        if (dp[ind] != -1) return dp[ind];
        int mini = 10001;

        for (int i = 1; i <= nums[ind]; i++) {
            mini = Math.min(mini, 1 + solve(ind + i, nums, dp));
        }
        return dp[ind] = mini;
    }
}
