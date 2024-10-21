#include <iostream>
#include <vector>
#include <climits>

int coinChange(std::vector<int>& coins, int amount) {
    std::vector<int> dp(amount + 1, INT_MAX);
    dp[0] = 0;

    for (int i = 1; i <= amount; ++i) {
        for (int coin : coins) {
            if (i >= coin && dp[i - coin] != INT_MAX) {
                dp[i] = std::min(dp[i], dp[i - coin] + 1);
            }
        }
    }
    return dp[amount] == INT_MAX ? -1 : dp[amount];
}

int main() {
    std::vector<int> coins = {1, 2, 5};
    int amount = 11;
    int minCoins = coinChange(coins, amount);
    std::cout << "Minimum Coins: " << minCoins << std::endl;
    return 0;
}
