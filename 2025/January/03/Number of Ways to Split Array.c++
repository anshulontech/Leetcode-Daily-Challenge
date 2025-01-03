class Solution {
public:
    int waysToSplitArray(vector<int>& nums) {
        long long totalSum = accumulate(nums.begin(),nums.end(),0L);
        int res = 0;

        int n=nums.size();
        long long leftSum=0,rightSum=totalSum;

        for(int i=0;i<n-1;i++) {
            leftSum+=nums[i];
            rightSum-=nums[i];

            if(leftSum>=rightSum) {
                res++;
            }
        }

        return res;
    }
};
