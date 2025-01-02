class Solution {
public:
    int maxScore(string s) {
        int maxScore=0;
        int leftZeroesCount=0;

        int rightOnesCount=count(s.begin(),s.end(),'1');
        int len = s.size();

        for(int i=0;i<len-1;i++) {
            if(s[i]=='0') {
                leftZeroesCount++;
            } else {
                rightOnesCount--;
            }

            maxScore = max(maxScore, leftZeroesCount+rightOnesCount);
        }

        return maxScore;
    }
};
