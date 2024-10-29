def binary_search(arr, target):
    low = 0
    high = len(arr) - 1
    
    while low <= high:
        mid = (low + high) // 2
        # Check if target is at mid
        if arr[mid] == target:
            return mid
        # If target is smaller, ignore the right half
        elif arr[mid] > target:
            high = mid - 1
        # If target is larger, ignore the left half
        else:
            low = mid + 1
    # If element is not found
    return -1
