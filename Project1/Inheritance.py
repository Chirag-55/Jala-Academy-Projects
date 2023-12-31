class A:
    def __init__(self):
        self.var_A1 = "Variable A1 in class A"
        self.var_A2 = "Variable A2 in class A"

    def method_A1(self):
        print("Method A1 in class A")

    def method_A2(self):
        print("Method A2 in class A")

    def overridden_method(self):
        print("Overridden method in class A")


class B(A):
    def __init__(self):
        super().__init__()
        self.var_B1 = "Variable B1 in class B"
        self.var_B2 = "Variable B2 in class B"

    def method_B1(self):
        print("Method B1 in class B")

    def method_B2(self):
        print("Method B2 in class B")

    def overridden_method(self):
        print("Overridden method in class B")


class C(B):
    def __init__(self):
        super().__init__()
        self.var_C1 = "Variable C1 in class C"
        self.var_C2 = "Variable C2 in class C"

    def method_C1(self):
        print("Method C1 in class C")

    def method_C2(self):
        print("Method C2 in class C")

    def overridden_method(self):
        print("Overridden method in class C")


class MainClass:
    def main_method(self):
        # Create objects for each class
        obj_A = A()
        obj_B = B()
        obj_C = C()

        # Access data members of class A
        print(obj_A.var_A1)
        print(obj_A.var_A2)

        # Call methods of class A
        obj_A.method_A1()
        obj_A.method_A2()
        obj_A.overridden_method()

        # Access data members of class B
        print(obj_B.var_B1)
        print(obj_B.var_B2)

        # Call methods of class B
        obj_B.method_B1()
        obj_B.method_B2()
        obj_B.overridden_method()

        # Access data members of class C
        print(obj_C.var_C1)
        print(obj_C.var_C2)

        # Call methods of class C
        obj_C.method_C1()
        obj_C.method_C2()
        obj_C.overridden_method()

        # Call overridden method with super class reference to B and C class’s objects
        super(B, obj_B).overridden_method()
        super(C, obj_C).overridden_method()


# Create an object of the MainClass and call the main method
main_obj = MainClass()
main_obj.main_method()

'''
OUTPUT
Variable A1 in class A
Variable A2 in class A
Method A1 in class A
Method A2 in class A
Overridden method in class A
Variable B1 in class B
Variable B2 in class B
Method B1 in class B
Method B2 in class B
Overridden method in class B
Variable C1 in class C
Variable C2 in class C
Method C1 in class C
Method C2 in class C
Overridden method in class C
Overridden method in class A
Overridden method in class BT
'''
