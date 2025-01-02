class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int[] dp = new int[n+1];
        dp[0]=0;

        for(int i=0;i<n;i++) {
            if(checkIsValidString(words[i])) {
                dp[i+1]=dp[i]+1;
            } else {
                dp[i+1]=dp[i];
            }
        }

        int m=queries.length;
        int[] res = new int[m];

        for(int i=0;i<m;i++) {
            res[i]=dp[queries[i][1]+1]-dp[queries[i][0]];
        }

        return res;
    }

    boolean checkIsValidString(String s) {
        return isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1));
    }

    boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
