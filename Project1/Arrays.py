# 1. Function to add integer values of an array
def sum_array(arr):
    total = 0
    for num in arr:
        total += num
    return total

# 2. Function to calculate the average value of an array of integers
def average_array(arr):
    if not arr:
        return 0
    return sum_array(arr) / len(arr)

# 3. Function to find the index of an array element
def find_index(arr, value):
    for i in range(len(arr)):
        if arr[i] == value:
            return i
    return -1

# 4. Function to test if array contains a specific value
def contains_value(arr, value):
    return value in arr

# 5. Function to remove a specific element from an array
def remove_element(arr, value):
    if value in arr:
        arr.remove(value)

# 6. Function to copy an array to another array
def copy_array(arr):
    return arr.copy()

# 7. Function to insert an element at a specific position in the array
def insert_element(arr, index, value):
    arr.insert(index, value)

# 8. Function to find the minimum and maximum value of an array
def find_min_max(arr):
    if not arr:
        return None, None
    return min(arr), max(arr)

# 9. Function to reverse an array of integer values
def reverse_array(arr):
    return arr[::-1]

# 10. Function to find the duplicate values of an array
def find_duplicates(arr):
    seen = set()
    duplicates = set(x for x in arr if x in seen or seen.add(x))
    return list(duplicates)

# 11. Function to find the common values between two arrays
def find_common_elements(arr1, arr2):
    return list(set(arr1) & set(arr2))

# 12. Function to remove duplicate elements from an array
def remove_duplicates(arr):
    return list(set(arr))

# 13. Function to find the second largest number in an array
def second_largest(arr):
    unique_numbers = remove_duplicates(arr)
    unique_numbers.sort()
    if len(unique_numbers) < 2:
        return None
    return unique_numbers[-2]

# 14. Function to find the number of even and odd numbers in an array
def count_even_odd(arr):
    even_count = sum(1 for num in arr if num % 2 == 0)
    odd_count = len(arr) - even_count
    return even_count, odd_count

# 15. Function to get the difference of the largest and smallest value
def difference_largest_smallest(arr):
    if not arr:
        return None
    return max(arr) - min(arr)

# 16. Function to verify if the array contains two specified elements (12, 23)
def contains_specified_elements(arr):
    return all(x in arr for x in (12, 23))

# 17. Function to verify if the array contains two specified elements (12, 23)
def contains_specified_elements(arr):
    return all(x in arr for x in (12, 23))

# 18. Function to remove duplicate elements and return the new array
def remove_duplicates_return_new(arr):
    unique_set = set()
    result_array = []
    for num in arr:
        if num not in unique_set:
            unique_set.add(num)
            result_array.append(num)
    return result_array

# Example usage
array_example = [4, 8, 12, 15, 8, 20, 12, 23]
print("Original Array:", array_example)

print("Sum of Array:", sum_array(array_example))
print("Average of Array:", average_array(array_example))
print("Index of 15:", find_index(array_example, 15))
print("Contains 20:", contains_value(array_example, 20))

remove_element(array_example, 8)
print("After removing 8:", array_example)

copied_array = copy_array(array_example)
print("Copied Array:", copied_array)

insert_element(array_example, 3, 25)
print("After inserting 25 at index 3:", array_example)

min_value, max_value = find_min_max(array_example)
print("Min Value:", min_value)
print("Max Value:", max_value)

reversed_array = reverse_array(array_example)
print("Reversed Array:", reversed_array)

duplicates = find_duplicates(array_example)
print("Duplicates:", duplicates)

array_example_2 = [12, 23, 30, 40, 15]
common_elements = find_common_elements(array_example, array_example_2)
print("Common Elements:", common_elements)

array_without_duplicates = remove_duplicates(array_example)
print("Array without Duplicates:", array_without_duplicates)

second_largest_num = second_largest(array_example)
print("Second Largest Number:", second_largest_num)

even_count, odd_count = count_even_odd(array_example)
print("Even Count:", even_count)
print("Odd Count:", odd_count)

difference = difference_largest_smallest(array_example)
print("Difference between largest and smallest value:", difference)

contains_specified = contains_specified_elements(array_example)
print("Contains specified elements (12, 23):", contains_specified)

print("Original Array:", array_example)

contains_specified = contains_specified_elements(array_example)
print("Contains specified elements (12, 23):", contains_specified)

new_array_without_duplicates = remove_duplicates_return_new(array_example)
print("New Array without Duplicates:", new_array_without_duplicates)
