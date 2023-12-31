# 1. Different ways of creating a string
str1 = "Hello, World!"  # Using double quotes
str2 = 'Jala Academy'  # Using single quotes
str3 = """This is a
inter-ship assignement"""  # Using triple double quotes for multi-line string

print("1. Different ways of creating a string:", str1, str2, str3)

# 2. Concatenating two strings using + operator
concatenated_str = str1 + " " + str2

print("2. Concatenating two strings using + operator:", concatenated_str)

# 3. Finding the length of the string
length_str1 = len(str1)

print("3. Finding the length of the string:", length_str1)

# 4. Extracting a string using Substring
substring = str1[7:12]

print("4. Extracting a string using Substring:", substring)

# 5. Searching in strings using index()
index_of_world = str1.index("World")

print("5. Searching in strings using index():", index_of_world)

# 6. Matching a String Against a Regular Expression With matches() (Python doesn't have matches() like Java)
import re
pattern = re.compile(r'\bHello\b')
match_result = bool(re.search(pattern, str1))

print("6. Matching a String Against a Regular Expression:", match_result)

# 7. Comparing strings
comparison_result = (str1 == str2)

print("7. Comparing strings:", comparison_result)

# 8. startsWith(), endsWith() and compareTo() (Python doesn't have compareTo() like Java)
starts_with_result = str1.startswith("Hello")
ends_with_result = str1.endswith("World")

print("8. startsWith(), endsWith():", starts_with_result, ends_with_result)

# 9. Trimming strings with strip()
trimmed_str = "   Spaces at both ends   ".strip()

print("9. Trimming strings with strip():", trimmed_str)

# 10. Replacing characters in strings with replace()
replaced_str = str1.replace("World", "Universe")

print("10. Replacing characters in strings with replace():", replaced_str)

# 11. Splitting strings with split()
split_result = str2.split()

print("11. Splitting strings with split():", split_result)

# 12. Converting integer objects to Strings
integer_to_str = str(123)

print("12. Converting integer objects to Strings:", integer_to_str)

# 13. Converting to uppercase and lowercase
uppercase_str = str1.upper()
lowercase_str = str2.lower()

print("13. Converting to uppercase and lowercase:", uppercase_str, lowercase_str)

'''
OUTPUT
1. Different ways of creating a string: Hello, World! Jala Academy This is a
inter-ship assignement
2. Concatenating two strings using + operator: Hello, World! Jala Academy
3. Finding the length of the string: 13
4. Extracting a string using Substring: World
5. Searching in strings using index(): 7
6. Matching a String Against a Regular Expression: True
7. Comparing strings: False
8. startsWith(), endsWith(): True False
9. Trimming strings with strip(): Spaces at both ends
10. Replacing characters in strings with replace(): Hello, Universe!
11. Splitting strings with split(): ['Jala', 'Academy']
12. Converting integer objects to Strings: 123
13. Converting to uppercase and lowercase: HELLO, WORLD! jala academy
'''
