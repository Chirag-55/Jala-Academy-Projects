# 1. Create a Dictionary with at least 5 key-value pairs of Student ID and Name
student_dict = {
    101: "Alisha",
    102: "Binod",
    103: "Chirag",
    104: "Dhavan",
    105: "Riya"
}

# 1.1. Adding values to the dictionary
student_dict[106] = "Frank"
student_dict.update({107: "Grace", 108: "Henry"})

# 1.2. Updating values in the dictionary
student_dict[102] = "Updated Binod"
student_dict.update({104: "Updated Dhavan"})

# 1.3. Accessing values in the dictionary
print("Student with ID 103:", student_dict[103])

# 1.4. Create a nested loop dictionary
course_dict = {
    "Math": {"101": "A", "102": "B", "103": "C"},
    "Science": {"104": "A", "105": "B", "106": "C"}
}

# 1.5. Access values of nested loop dictionary
print("Math grades for Student ID 101:", course_dict["Math"]["101"])

# 1.6. Print keys present in a particular dictionary
print("Keys in the student_dict:", list(student_dict.keys()))

# 1.7. Delete a value from a dictionary
del student_dict[107]

# Display the modified dictionary
print("Modified Student Dictionary after deletion:", student_dict)

'''
OUTPUT
Student with ID 103: Chirag
Math grades for Student ID 101: A
Keys in the student_dict: [101, 102, 103, 104, 105, 106, 107, 108]
Modified Student Dictionary after deletion: {101: 'Alisha', 102: 'Updated Binod', 103: 'Chirag', 104: 'Updated Dhavan', 105: 'Riya', 106: 'Frank', 108: 'Henry'}
'''
