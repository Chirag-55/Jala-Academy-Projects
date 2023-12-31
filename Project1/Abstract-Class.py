from abc import ABC, abstractmethod

# 1. Abstract Class
class AbstractClass(ABC):
    @abstractmethod
    def abstract_method(self):
        pass

    def non_abstract_method(self):
        print("Non-abstract method in AbstractClass")


# 2. Subclass implementing AbstractClass
class SubClass(AbstractClass):
    def abstract_method(self):
        print("Implemented abstract method in SubClass")


# 3. Creating an instance for the child class and calling abstract methods
sub_obj = SubClass()
sub_obj.abstract_method()

# 4. Creating an instance for the child class and calling non-abstract methods
sub_obj.non_abstract_method()

'''
OUTPUT
Implemented abstract method in SubClass
Non-abstract method in AbstractClass
'''
