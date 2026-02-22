// WAP to search an element in an array.
// File name: ArraySearchMain.java

import java.util.Scanner;

class ArraySearch {
    int[] arr;
    int n;

    void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void searchElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array");
        }
    }
}

public class ArraySearchMain {
    public static void main(String[] args) {
        ArraySearch obj = new ArraySearch();
        obj.inputArray();
        obj.searchElement();
    }
}

// WAP to perform string manipulations.
// File name: StringManipulationMain.java

import java.util.Scanner;

class StringManipulation {

    String str;

    void inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
    }

    void lengthOfString() {
        System.out.println("Length of string: " + str.length());
    }

    void changeCase() {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    void reverseString() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
    }

    void countVowels() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }

    void checkPalindrome() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }
    }
}

public class StringManipulationMain {
    public static void main(String[] args) {
        StringManipulation obj = new StringManipulation();

        obj.inputString();
        obj.lengthOfString();
        obj.changeCase();
        obj.reverseString();
        obj.countVowels();
        obj.checkPalindrome();
    }
}

// WAP to create Employee class and search using array of objects.
// File name: EmployeeSearchMain.java

import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    // Method to read employee details
    void readEmployee(Scanner sc) {
        System.out.print("Enter Employee Number: ");
        eNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        eName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        eSalary = sc.nextDouble();
    }

    // Method to display employee details
    void displayEmployee() {
        System.out.println("Employee Number : " + eNo);
        System.out.println("Employee Name   : " + eName);
        System.out.println("Employee Salary : " + eSalary);
    }
}

public class EmployeeSearchMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));
            emp[i] = new Employee();
            emp[i].readEmployee(sc);
        }

        System.out.print("\nEnter Employee Number to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == searchNo) {
                System.out.println("\nEmployee Found:");
                emp[i].displayEmployee();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee not found");
        }
    }
}

// WAP to sort strings in alphabetical order without built-in sort.
// File name: StringSortMain.java

import java.util.Scanner;

class StringSort {
    String[] s;
    int n;
    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter number of strings: ");
        n = Integer.parseInt(sc.nextLine());

        s = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
    }

    void sort() {
        String temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int k = 0;
                while (k < s[i].length() && k < s[j].length()
                        && s[i].charAt(k) == s[j].charAt(k)) {
                    k++;
                }

                if (k < s[i].length() && k < s[j].length()) {
                    if (s[i].charAt(k) > s[j].charAt(k)) {
                        temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                } else if (s[i].length() > s[j].length()) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println("Strings in alphabetical order:");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

public class StringSortMain {
    public static void main(String[] args) {
        StringSort obj = new StringSort();
        obj.read();
        obj.sort();
        obj.display();
    }
}

// WAP to implement a menu-driven Hospital OP Appointment System.
// File name: HospitalAppointmentMain.java

import java.util.Scanner;

class Appointment {
    int appId;
    String patientName;
    String phoneNo;
    String doctorName;
    String department;
    String appDate;
    boolean cancelled = false;

    void readAppointment(Scanner sc) {
        System.out.print("Enter Appointment ID: ");
        appId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        patientName = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phoneNo = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        doctorName = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Appointment Date (DD-MM-YYYY): ");
        appDate = sc.nextLine();
    }

    void displayAppointment() {
        if (!cancelled) {
            System.out.println("--------------------------------");
            System.out.println("Appointment ID : " + appId);
            System.out.println("Patient Name   : " + patientName);
            System.out.println("Phone Number   : " + phoneNo);
            System.out.println("Doctor Name    : " + doctorName);
            System.out.println("Department     : " + department);
            System.out.println("Date           : " + appDate);
        }
    }
}

public class HospitalAppointmentMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum number of appointments: ");
        int n = sc.nextInt();

        Appointment[] apps = new Appointment[n];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Hospital OP Appointment Menu =====");
            System.out.println("1. Make Appointment");
            System.out.println("2. Search Appointment");
            System.out.println("3. Cancel Appointment");
            System.out.println("4. Display All Appointments");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < n) {
                        apps[count] = new Appointment();
                        apps[count].readAppointment(sc);
                        count++;
                        System.out.println("Appointment added successfully.");
                    } else {
                        System.out.println("Appointment list is full.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Appointment ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (apps[i].appId == searchId && !apps[i].cancelled) {
                            System.out.println("Appointment Found:");
                            apps[i].displayAppointment();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Appointment not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Appointment ID to cancel: ");
                    int cancelId = sc.nextInt();
                    boolean cancelled = false;

                    for (int i = 0; i < count; i++) {
                        if (apps[i].appId == cancelId && !apps[i].cancelled) {
                            apps[i].cancelled = true;
                            System.out.println("Appointment cancelled successfully.");
                            cancelled = true;
                            break;
                        }
                    }
                    if (!cancelled) {
                        System.out.println("Appointment not found or already cancelled.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Appointment List ---");
                    boolean any = false;
                    for (int i = 0; i < count; i++) {
                        if (!apps[i].cancelled) {
                            apps[i].displayAppointment();
                            any = true;
                        }
                    }
                    if (!any) {
                        System.out.println("No active appointments.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);
    }
}