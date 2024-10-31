class Stack:
    def __init__(self):
        # Initialize an empty list to store stack items
        self.items = []

    def is_empty(self):
        # Check if the stack is empty
        return len(self.items) == 0

    def push(self, item):
        # Add an item to the top of the stack
        self.items.append(item)
        print(f"Pushed {item} to stack.")

    def pop(self):
        # Remove and return the top item of the stack
        if self.is_empty():
            return "Stack is empty. Cannot pop."
        return self.items.pop()  # Removes the last item from the list

    def peek(self):
        # Return the top item without removing it
        if self.is_empty():
            return "Stack is empty."
        return self.items[-1]  # Returns the last item in the list

    def size(self):
        # Return the number of items in the stack
        return len(self.items)

    def display(self):
        # Print the current items in the stack
        print("Stack items:", self.items)

# Example usage
if __name__ == "__main__":
    stack = Stack()  # Create a new stack instance
    stack.push(10)   # Push 10 onto the stack
    stack.push(20)   # Push 20 onto the stack
    stack.push(30)   # Push 30 onto the stack
    stack.display()   # Display the current stack items
    print("Top item:", stack.peek())  # Show the top item without popping it
    print("Popped item:", stack.pop())  # Pop the top item
    stack.display()   # Display the stack after popping
    print("Stack size:", stack.size())  # Print the current size of the stack
