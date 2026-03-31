import os

FILENAME = "records.txt"

def load_records():
    records = []

    if os.path.exists(FILENAME):
        file = open(FILENAME, "r")
        lines = file.readlines()
        file.close()

        for line in lines:
            line = line.strip()
            if line != "":
                parts = line.split(",")
                records.append(parts)
    else:
        file = open(FILENAME, "w")
        file.close()

    return records

def save_records(records):
    file = open(FILENAME, "w")

    for record in records:
        line = record[0] + "," + record[1] + "\n"
        file.write(line)

    file.close()

def display_records(records):
    print("\n--- RECORDS ---")

    if len(records) == 0:
        print("No records found.")
    else:
        for i in range(len(records)):
            print(f"{i} - Name: {records[i][0]}, Age: {records[i][1]}")

def add_record(records):
    name = input("Enter name: ")
    age = input("Enter age: ")

    records.append([name, age])
    save_records(records)

    print("Record added!")

def update_record(records):
    display_records(records)

    try:
        index = int(input("Enter index to update: "))

        if index >= 0 and index < len(records):
            name = input("Enter new name: ")
            age = input("Enter new age: ")

            records[index] = [name, age]
            save_records(records)

            print("Record updated!")
        else:
            print("Invalid index.")

    except:
        print("Invalid input.")

def delete_record(records):
    display_records(records)

    try:
        index = int(input("Enter index to delete: "))

        if index >= 0 and index < len(records):
            records.pop(index)
            save_records(records)

            print("Record deleted!")
        else:
            print("Invalid index.")

    except:
        print("Invalid input.")

def main():
    records = load_records()

    while True:
        print("\n--- MENU ---")
        print("1. View Records")
        print("2. Add Record")
        print("3. Update Record")
        print("4. Delete Record")
        print("5. Exit")

        choice = input("Enter choice: ")

        if choice == "1":
            display_records(records)
        elif choice == "2":
            add_record(records)
        elif choice == "3":
            update_record(records)
        elif choice == "4":
            delete_record(records)
        elif choice == "5":
            print("Goodbye!")
            break
        else:
            print("Invalid choice.")

main()