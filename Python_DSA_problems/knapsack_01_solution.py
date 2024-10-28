#Dynamic Programming Solution for 0/1 Knapsack Problem

def knapsack(values, weights, capacity):
    # Number of items
    n = len(values)
    
    # DP table creation: (capacity+1) x (n+1)
    dp = [[0] * (capacity + 1) for _ in range(n + 1)]
    
    # Consider each item one by one
    for i in range(1, n + 1):
        for w in range(1, capacity + 1):
            # Weight/value of selected item
            current_weight = weights[i - 1]
            current_value = values[i - 1]
            
            # Check if the current item can be added to the knapsack
            if current_weight <= w:
                # 1) Case where the current item is added
                # 2) Case where the current item is not added
                # Update dp[i][w] with the maximum value between 1) and 2)
                dp[i][w] = max(dp[i - 1][w], dp[i - 1][w - current_weight] + current_value)
            else:
                # If the item can't be added to the knapsack
                dp[i][w] = dp[i - 1][w]

    # Return the maximum value obtainable with the given capacity
    return dp[n][capacity]

# User input
values = list(map(int, input("Enter the values of each item, separated by spaces: ").split()))
weights = list(map(int, input("Enter the weights of each item, separated by spaces: ").split()))
capacity = int(input("Enter the capacity of the knapsack: "))

# Print the result
print("The highest achievable value is:", knapsack(values, weights, capacity))
