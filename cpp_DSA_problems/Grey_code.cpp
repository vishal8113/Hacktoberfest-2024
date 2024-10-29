// this is a famous leetcode recursion basic question

// leetcode 89. Grey Code

// Solution

class Solution {
public:
    vector<int> vect;
    void helper(int &a,int n)
    {
        a^=1<<n;
        vect.push_back(a);
        for(int c=0;c<n;c++)
            helper(a,c);
    }
    vector<int> grayCode(int n) 
    {
        int a=0;
        vect.push_back(a);
        for(int c=0;c<n;c++)
            helper(a,c);
        return vect;
    }
};
