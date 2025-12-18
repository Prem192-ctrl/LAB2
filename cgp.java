import java.util.Scanner;

class Student1 {
    int roll;
    String name;
    double cgpa;

    // Method to read student details
    void read(Scanner sc) {
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    // Method to display student details
    void display() {
        System.out.println(roll + "\t" + name + "\t" + cgpa);
    }
}

public class cgp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student1[] s = new Student1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            s[i] = new Student1();
            s[i].read(sc);
        }

        System.out.println("\nRoll\tName\tCGPA");
        double minCgpa = s[0].cgpa;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            s[i].display();
            if (s[i].cgpa < minCgpa) {
                minCgpa = s[i].cgpa;
                minIndex = i;
            }
        }

        System.out.println("\nStudent with lowest CGPA: " + s[minIndex].name);
    }
}
