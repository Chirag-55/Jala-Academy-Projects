# 1. Class with Different Constructors
class MyClass:
    # Default Constructor with default parameter values
    def __init__(self, arg1=None, arg2=None):
        if arg1 is None and arg2 is None:
            print("Default Constructor called")
        elif arg2 is None:
            self.attribute1 = arg1
            print(f"One Argument Constructor called with arg1: {arg1}")
        else:
            self.attribute1 = arg1
            self.attribute2 = arg2
            print(f"Two Argument Constructor called with arg1: {arg1}, arg2: {arg2}")


# Instantiate the class to call all constructors
obj_default = MyClass()
obj_one_arg = MyClass("Value1")
obj_two_args = MyClass("Value1", "Value2")
# 2. Call Constructors of Superclass from a Child Class
class SuperClass:
    def __init__(self):
        print("Superclass Default Constructor")


class ChildClass(SuperClass):
    def __init__(self):
        super().__init__()  # Call the superclass default constructor
        print("Childclass Default Constructor")


# 3. Apply Access Modifiers to Constructors
class ExampleClass:
    def __init__(self):
        self.public_var = "Public Variable"
        self._protected_var = "Protected Variable"
        self.__private_var = "Private Variable"


# 4. Attributes of a Constructor
class ExampleConstructor:
    def __init__(self, arg1, arg2):
        self.attribute1 = arg1
        self.attribute2 = arg2


# Instantiate the class to call all constructors
obj_default = MyClass()
obj_one_arg = MyClass("Value1")
obj_two_args = MyClass("Value1", "Value2")

# Instantiate the child class to call both constructors
obj_child = ChildClass()

# Instantiate the ExampleClass to demonstrate access modifiers
obj_example = ExampleClass()
print(obj_example.public_var)
print(obj_example._protected_var)
print(obj_example._ExampleClass__private_var)

# Instantiate the ExampleConstructor to demonstrate constructor attributes
obj_example_constructor = ExampleConstructor("Value1", "Value2")
print(obj_example_constructor.attribute1)
print(obj_example_constructor.attribute2)


'''
OUTPUT
Default Constructor called
One Argument Constructor called with arg1: Value1
Two Argument Constructor called with arg1: Value1, arg2: Value2
Default Constructor called
One Argument Constructor called with arg1: Value1
Two Argument Constructor called with arg1: Value1, arg2: Value2
Superclass Default Constructor
Childclass Default Constructor
Public Variable
Protected Variable
Private Variable
Value1
Value2
'''
