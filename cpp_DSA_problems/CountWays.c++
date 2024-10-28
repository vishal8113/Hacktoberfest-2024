#include <bits/stdc++.h>
using namespace std;

int countWays(const vector<int>& coins, int n, int sum) {
    if (sum == 0) 
    return 1;
    if (sum < 0 || n == 0)
     return 0;
    return countWays(coins, n, sum - coins[n - 1]) + 
            countWays(coins, n - 1, sum);
}
int main() {
    vector<int> coins = {1, 2, 3};
    int sum = 5;
    cout << countWays(coins, coins.size(), sum);
    return 0;
}
