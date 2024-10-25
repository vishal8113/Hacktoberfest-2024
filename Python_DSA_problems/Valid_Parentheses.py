"""
Problem: Valid Parentheses
Description: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
Example:
    Input: s = "()[]{}"
    Output: True
"""

def is_valid(s):
    stack = []
    # Mapping of closing brackets to their corresponding opening brackets
    bracket_map = {')': '(', '}': '{', ']': '['}
    
    for char in s:
        # If char is a closing bracket
        if char in bracket_map:
            # Pop from stack if non-empty, otherwise use a dummy value
            top_element = stack.pop() if stack else '#'
            # Check if the popped element matches the opening bracket
            if bracket_map[char] != top_element:
                return False
        else:
            # Push the opening bracket onto stack
            stack.append(char)
    
    # Valid if stack is empty at the end
    return not stack

# Example usage
if __name__ == "__main__":
    s = "()[]{}"
    print("Is valid:", is_valid(s))  # Output: True
