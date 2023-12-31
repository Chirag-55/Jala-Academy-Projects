# 1. Read text file
file_path = "sample.txt"

try:
    with open(file_path, "r") as file:
        content = file.read()
        print("File Content:")
        print(content)
except FileNotFoundError:
    print(f"File '{file_path}' not found.")
except Exception as e:
    print(f"An error occurred: {e}")
