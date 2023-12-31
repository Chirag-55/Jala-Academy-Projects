# 1   Program to print your name
print("Jala Academy")

#  2  Single-line comment
print("This is a single-line comment")

'''
Multi-line comment
This is a multi-line comment.
It can span multiple lines.
'''
print("This is after the multi-line comment")

# 3  Define variables for different data types
integer_variable = 10
boolean_variable = True
char_variable = 'A'
float_variable = 3.14
double_variable = 3.141592653589793

print("Integer Variable:", integer_variable)
print("Boolean Variable:", boolean_variable)
print("Char Variable:", char_variable)
print("Float Variable:", float_variable)
print("Double Variable:", double_variable)

# 4 Define Local and Global Variables with the Same Name and Print Both Variables to Understand the Scope:

# Global variable
variable = "I am global"

def funct():
    # Local variable with the same name as the global variable
    variable = "I am local"
    print("Inside the function - Local Variable:", variable)
funct()

# Print global variable outside the function
print("Outside the function - Global Variable:", variable)


#Output
'''
Jala Academy
This is a single-line comment
This is after the multi-line comment
Integer Variable: 10
Boolean Variable: True
Char Variable: A
Float Variable: 3.14
Double Variable: 3.141592653589793
Inside the function - Local Variable: I am local
Outside the function - Global Variable: I am global
'''

