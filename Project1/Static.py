class MyClass:
    # 1. Define a static variable and access that through a class
    static_variable = "Static Variable"

    def __init__(self, instance_variable):
        # 2. Define a static variable and access that through an instance
        self.instance_variable = instance_variable

    def print_static_variable(self):
        # 3. Define a static variable and change within the instance
        MyClass.static_variable = "Changed within the instance"
        print(f"Accessing static variable within instance: {MyClass.static_variable}")

    @classmethod
    def change_static_variable(cls):
        # 4. Define a static variable and change within the class
        cls.static_variable = "Changed within the class"
        print(f"Accessing static variable within the class: {cls.static_variable}")


# Access static variable through the class
print(f"Accessing static variable through the class: {MyClass.static_variable}")

# Create an instance and access static variable through the instance
obj = MyClass("Instance Variable")
print(f"Accessing static variable through the instance: {obj.static_variable}")

# Access static variable through the instance and change within the instance
obj.print_static_variable()

# Access static variable through the class and change within the class
MyClass.change_static_variable()

'''
OUTPUT : 
Accessing static variable through the class: Static Variable
Accessing static variable through the instance: Static Variable
Accessing static variable within instance: Changed within the instance
Accessing static variable within the class: Changed within the class
'''
