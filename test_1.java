// WAP to define a class ‘product’ with data members pcode, pname and price.
// Create 3 objects of the class and find the product having the lowest price.
// File name: Product.java

class Product {
    int pcode;
    String pname;
    double price;

    // Method to set product details
    void setData(int code, String name, double p) {
        pcode = code;
        pname = name;
        price = p;
    }

    // Method to display product details
    void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        // Create 3 objects
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        // Initialize objects
        p1.setData(101, "Pen", 10.50);
        p2.setData(102, "Notebook", 45.00);
        p3.setData(103, "Marker", 25.75);

        // Find product with lowest price
        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        // Display product with lowest price
        System.out.println("Product with Lowest Price:");
        lowest.display();
    }
}

// WAP to read 2 matrices from the console and perform matrix addition.
// File name: MatrixAdditionMain.java

import java.util.Scanner;

class MatrixAddition {
    int r, c;
    int[][] a;
    int[][] b;
    int[][] sum;

    // Method to read matrices
    void readMatrices() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        a = new int[r][c];
        b = new int[r][c];
        sum = new int[r][c];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    // Method to add matrices
    void addMatrices() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    // Method to display result
    void displaySum() {
        System.out.println("Sum of matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixAdditionMain {
    public static void main(String[] args) {
        MatrixAddition obj = new MatrixAddition();
        obj.readMatrices();
        obj.addMatrices();
        obj.displaySum();
    }
}

// WAP to add complex numbers.
// File name: ComplexMain.java

import java.util.Scanner;

class Complex {
    int real;
    int imag;

    // Method to read complex number
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        imag = sc.nextInt();
    }

    // Method to add two complex numbers
    void add(Complex c1, Complex c2) {
        real = c1.real + c2.real;
        imag = c1.imag + c2.imag;
    }

    // Method to display complex number
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexMain {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        System.out.println("Enter first complex number:");
        c1.read();

        System.out.println("Enter second complex number:");
        c2.read();

        c3.add(c1, c2);

        System.out.print("Sum of complex numbers: ");
        c3.display();
    }
}

// WAP to read a matrix and check whether it is symmetric or not.
// File name: SymmetricMatrixMain.java

import java.util.Scanner;

class SymmetricMatrix {
    int n;
    int[][] a;

    // Method to read matrix
    void readMatrix() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of matrix (n x n): ");
        n = sc.nextInt();

        a = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    // Method to check symmetric
    void checkSymmetric() {
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag)
            System.out.println("The matrix is Symmetric.");
        else
            System.out.println("The matrix is NOT Symmetric.");
    }
}

public class SymmetricMatrixMain {
    public static void main(String[] args) {
        SymmetricMatrix obj = new SymmetricMatrix();
        obj.readMatrix();
        obj.checkSymmetric();
    }
}

// WAP to create CPU with inner class Processor and static nested class RAM.
// File name: CPUDetailsMain.java

import java.util.Scanner;

class CPU {
    int price;

    // Inner class
    class Processor {
        int cores;
        String manufacturer;

        void display() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    // Static nested class
    static class RAM {
        int memory;
        String manufacturer;

        void display() {
            System.out.println("RAM Memory: " + memory + " GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }
}

public class CPUDetailsMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CPU object
        CPU cpu = new CPU();
        System.out.print("Enter CPU price: ");
        cpu.price = sc.nextInt();

        // Inner class object
        CPU.Processor processor = cpu.new Processor();
        System.out.print("Enter number of processor cores: ");
        processor.cores = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter processor manufacturer: ");
        processor.manufacturer = sc.nextLine();

        // Static nested class object
        CPU.RAM ram = new CPU.RAM();
        System.out.print("Enter RAM memory (GB): ");
        ram.memory = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter RAM manufacturer: ");
        ram.manufacturer = sc.nextLine();

        // Display details
        System.out.println("\n--- CPU DETAILS ---");
        System.out.println("CPU Price: " + cpu.price);
        processor.display();
        ram.display();
    }
}
