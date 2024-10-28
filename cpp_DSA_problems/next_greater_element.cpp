// Title: Next Greater Element
// Problem Statement: For each element in an array, find the next greater element (the next element that is larger). 
// If there is no such element, use -1 as the result for that position.


#include <iostream>
#include <vector>
#include <stack>

using namespace std;

vector<int> nextGreaterElement(const vector<int>& nums) {
    int n = nums.size();
    vector<int> result(n, -1);
    stack<int> s;

    for (int i = 0; i < n; ++i) {
        while (!s.empty() && nums[i] > nums[s.top()]) {
            result[s.top()] = nums[i];
            s.pop();
        }
        s.push(i);
    }
    return result;
}

int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements: ";
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    vector<int> result = nextGreaterElement(nums);

    cout << "Next Greater Elements: ";
    for (int num : result) {
        cout << num << " ";
    }

    return 0;
}

