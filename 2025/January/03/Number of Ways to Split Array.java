class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum = Arrays.stream(nums).asLongStream().sum();
        long leftSum=0, rightSum=totalSum;

        int n=nums.length;
        int res = 0;

        for(int i=0;i<n-1;i++) {
            leftSum+=nums[i];
            rightSum-=nums[i];

            if(leftSum>=rightSum) {
                res++;
            }
        }

        return res;
    }
}
