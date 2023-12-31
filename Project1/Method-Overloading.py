# 1. Two Methods with the Same Name, Different Number of Parameters, Same Type
class ExampleClass1:
    def method_with_parameters(self, param1, param2=None):
        if param2 is None:
            print(f"Method with one parameter: {param1}")
        else:
            print(f"Method with two parameters: {param1}, {param2}")


# Instantiate the class and call the methods
obj1 = ExampleClass1()
obj1.method_with_parameters(10)               # Calls the method with one parameter
obj1.method_with_parameters(20, 30)           # Calls the method with two parameters


# 2. Two Methods with the Same Name, Different Number of Parameters, Different Data Type
class ExampleClass2:
    def method_with_parameters(self, param1):
        print(f"Method with one parameter: {param1}")

    def method_with_parameters(self, param1, param2):
        print(f"Method with two parameters: {param1}, {param2}")


# Instantiate the class and call the methods
obj2 = ExampleClass2()
obj2.method_with_parameters("Hello")          # Calls the method with one parameter (string)
obj2.method_with_parameters(20, "World")      # Calls the method with two parameters (int and string)


# 3. Two Methods with the Same Name, Same Number of Parameters, Same Type
class ExampleClass3:
    def method_with_parameters(self, param1):
        print(f"Method with one parameter: {param1}")

    def method_with_parameters(self, param1):
        print(f"Method with one parameter: {param1}")


# Instantiate the class and call the methods
obj3 = ExampleClass3()
obj3.method_with_parameters(10)               # Calls the second method with one parameter
