# Student Record Saver

while True:
    print("\nMenu")
    print("1 - Add Student Record")
    print("2 - View Saved Records")
    print("3 - Exit")

    choice = input("Enter your choice: ")

    if choice == "1":
        # Add student record
        name = input("Enter student name: ")
        grade = input("Enter student grade: ")

        file = open("students.txt", "a")
        file.write(name + "," + grade + "\n")
        file.close()

        print("Record saved!")

    elif choice == "2":
        # View saved records
        try:
            file = open("students.txt", "r")
            data = file.read()
            file.close()

            if data == "":
                print("No records found yet.")
            else:
                print("\nSaved Records:")
                print(data)

        except FileNotFoundError:
            print("No records found yet.")

    elif choice == "3":
        # Exit program
        print("Program ended.")
        break

    else:
        print("Invalid choice. Please try again.")