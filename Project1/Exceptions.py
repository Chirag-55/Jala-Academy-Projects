# 1. Generate Arithmetic Exception without exception handling
result = 10 / 0  # This will raise an ArithmeticError

# 2. Handle the Arithmetic exception using try-catch block
try:
    result = 10 / 0
except ZeroDivisionError as e:
    print(f"Caught an exception: {e}")

# 3. Method throwing an exception, call without try block
def method_with_exception():
    raise ValueError("This is a custom exception")

# Call the method without try block
method_with_exception()

# 4. Program with multiple catch blocks
try:
    x = 10 / 0
except ZeroDivisionError as e:
    print(f"Caught ZeroDivisionError: {e}")
except ArithmeticError as e:
    print(f"Caught ArithmeticError: {e}")

# 5. Throw exception with your own message
try:
    raise ValueError("This is a custom exception message")
except ValueError as e:
    print(f"Caught ValueError: {e}")

# 6. Program to create your own exception
class CustomException(Exception):
    pass

try:
    raise CustomException("This is a custom exception")
except CustomException as e:
    print(f"Caught CustomException: {e}")

# 7. Program with finally block
try:
    result = 10 / 0
except ZeroDivisionError as e:
    print(f"Caught an exception: {e}")
finally:
    print("This block will execute regardless of an exception")

# 8. Program to generate Arithmetic Exception
result = 10 / 0  # This will raise an ArithmeticError

# 9. Program to generate FileNotFoundError
try:
    with open("nonexistent_file.txt", "r") as file:
        content = file.read()
except FileNotFoundError as e:
    print(f"Caught FileNotFoundError: {e}")

# 10. Program to generate ClassNotFoundException (Note: Python doesn't have ClassNotFoundException)
try:
    import nonexistent_module
except ModuleNotFoundError as e:
    print(f"Caught ModuleNotFoundError: {e}")

# 11. Program to generate IOException (Note: Python doesn't have IOException directly)
try:
    with open("/dev/full", "w") as file:
        file.write("This will cause an IOError")
except IOError as e:
    print(f"Caught IOError: {e}")

# 12. Program to generate NoSuchFieldException (Note: Python doesn't have NoSuchFieldException)
class MyClass:
    pass

try:
    obj = MyClass()
    value = obj.nonexistent_field
except AttributeError as e:
    print(f"Caught AttributeError: {e}")
