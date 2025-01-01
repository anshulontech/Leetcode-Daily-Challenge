class Solution {
    public int maxScore(String s) {
        int maxScore = 0;
        int leftZeroesCount=0;
        int rightOnesCount = (int) s.chars().filter(ch -> ch=='1').count();
        int len = s.length();

        for(int i=0;i<len-1;i++) {
            if(s.charAt(i)=='0') {
                leftZeroesCount++;
            } else {
                rightOnesCount--;
            }

            maxScore = Math.max(maxScore,leftZeroesCount+rightOnesCount);
        }

        return maxScore;
    }
}
