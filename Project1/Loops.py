# 1. Print "Bright IT Career" ten times using for loop
for i in range(10):
    print("Bright IT Career")

# 2. Print 1 to 20 numbers using the while loop
number = 1
while number <= 20:
    print(number)
    number += 1

# 3. Equal and not equal operators
a = 5
b = 10
if a == b:
    print("a is equal to b")
else:
    print("a is not equal to b")

# 4. Print odd and even numbers
for i in range(1, 11):
    if i % 2 == 0:
        print(f"{i} is even")
    else:
        print(f"{i} is odd")

# 5. Print largest number among three numbers
n1, n2, n3 = 15, 25, 10
largest = n1 if (n1 > n2) and (n1 > n3) else (n2 if n2 > n3 else n3)
print("Largest number among three numbers:", largest)

# 6. Print even numbers between 10 and 20 using while loop
s = 10
while s <= 20:
    if s % 2 == 0:
        print(s)
    s += 1

# 7. Print 1 to 10 using the do-while loop statement
count = 1
while count <= 10:
    print(count)
    count += 1

# 8. Check Armstrong number or not
num = 153
original_num = num
result = 0
while original_num != 0:
    remainder = original_num % 10
    result += remainder ** 3
    original_num //= 10
if result == num:
    print(num, "is an Armstrong number.")
else:
    print(num, "is not an Armstrong number.")

# 9. Check prime number or not
prime_num = 17
is_prime = True
for i in range(2, prime_num // 2 + 1):
    if prime_num % i == 0:
        is_prime = False
        break
if is_prime:
    print(prime_num, "is a prime number.")
else:
    print(prime_num, "is not a prime number.")

# 10. Check palindrome or not
palindrome_num = 121
temp = palindrome_num
reverse = 0
while temp != 0:
    digit = temp % 10
    reverse = reverse * 10 + digit
    temp //= 10
if palindrome_num == reverse:
    print(palindrome_num, "is a palindrome number.")
else:
    print(palindrome_num, "is not a palindrome number.")

# 11. Check whether a number is EVEN or ODD using switch
switch_num = 8
if switch_num % 2 == 0:
    print(switch_num, "is an even number.")
else:
    print(switch_num, "is an odd number.")

# 12. Print gender (Male/Female) program according to given M/F using switch
gender = 'M'
if gender == 'M':
    print("Gender is Male")
elif gender == 'F':
    print("Gender is Female")
else:
    print("Invalid gender")
