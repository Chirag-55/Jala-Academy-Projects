# 1. Function for Arithmetic Operators (+, -, *, /):
def funct(a, b):
    # Addition
    add_result = a + b
    print("Addition:", add_result)

    # Subtraction
    subtract_result = a - b
    print("Subtraction:", subtract_result)

    # Multiplication
    multiply_result = a * b
    print("Multiplication:", multiply_result)

    # Division
    divide_result = a / b
    print("Division:", divide_result)

# Example usage
funct(10, 5)

#  2. Method for Increment and Decrement Operators (++, --):
def inc_dec_op(number):
    # Increment
    number += 1
    print("After Increment:", number)

    # Decrement
    number -= 1
    print("After Decrement:", number)

# Example usage
inc_dec_op(7)

# 3. Program to Find if Two Numbers are Equal or Not:
def equality(num1, num2):
    if num1 == num2:
        print("The two numbers are equal.")
    else:
        print("The two numbers are not equal.")

# Example usage
equality(10, 10)

# 4. Program for Relational Operators (<, <=, >, >=):
def relational_operations(num1, num2):
    # Less than
    print(f"{num1} < {num2}:", num1 < num2)

    # Less than or equal to
    print(f"{num1} <= {num2}:", num1 <= num2)

    # Greater than
    print(f"{num1} > {num2}:", num1 > num2)

    # Greater than or equal to
    print(f"{num1} >= {num2}:", num1 >= num2)

# Example usage
relational_operations(5, 10)

def greater_smaller(num1, num2):
    if num1 == num2:
        print("Both numbers are equal.")
    elif num1 < num2:
        smaller = num1
        larger = num2
        print("Smaller Number:", smaller)
        print("Larger Number:", larger)
    else:
        smaller = num2
        larger = num1
        print("Smaller Number:", smaller)
        print("Larger Number:", larger)

# Example usage
greater_smaller(8, 10)

