class Solution {
public:
    vector<int> vowelStrings(vector<string>& words, vector<vector<int>>& queries) {
        int n=words.size();

        vector<int> dp(n+1,0);

        for(int i=0;i<n;i++) {
            if(checkIsValidString(words[i])) {
                dp[i+1]=dp[i]+1;
            } else {
                dp[i+1]=dp[i];
            }
        }

        vector<int> res;

        for(auto query: queries) {
            res.push_back(dp[query[1]+1]-dp[query[0]]);
        }

        return res;
    }

    bool checkIsValidString(string& s) {
        return isVowel(s[0]) && isVowel(s[s.size()-1]);
    }

    bool isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
};
