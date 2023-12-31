# 1. Private Class
class PrivateClass:
    def __init__(self):
        self.__private_field = "Private Field"

    def __private_method(self):
        print("Private Method")

    def main_method(self):
        print("Accessing private field:", self.__private_field)
        self.__private_method()


# Subclass trying to access private fields and methods
class SubClass(PrivateClass):
    def try_access_private(self):
        # Attempting to access private field and method from the superclass
        print("Trying to access private field from subclass:", self.__private_field)  # This will result in an error
        self.__private_method()  # This will result in an error


# 2. Protected Class
class ProtectedClass:
    def __init__(self):
        self._protected_field = "Protected Field"

    def _protected_method(self):
        print("Protected Method")


# Subclass accessing protected fields and methods
class ChildClass(ProtectedClass):
    def access_protected(self):
        print("Accessing protected field from child class:", self._protected_field)
        self._protected_method()


# 3. Public Class
class PublicClass:
    def __init__(self):
        self.public_field = "Public Field"

    def public_method(self):
        print("Public Method")


# Creating objects and demonstrating access modifiers
def main():
    # 1. Private Class
    private_obj = PrivateClass()
    private_obj.main_method()

    # Trying to access private fields and methods from subclass
    sub_obj = SubClass()
    sub_obj.try_access_private()  # This will result in an error

    # 2. Protected Class
    protected_obj = ProtectedClass()
    print("\nAccessing protected field from another class in the same package:", protected_obj._protected_field)
    protected_obj._protected_method()

    # Accessing protected fields and methods from a child class in a different package
    child_obj = ChildClass()
    print("Accessing protected field from a child class in a different package:", child_obj._protected_field)
    child_obj._protected_method()

    # 3. Public Class
    public_obj = PublicClass()
    print("\nAccessing public field from another class:", public_obj.public_field)
    public_obj.public_method()


# Call the main method
main()
