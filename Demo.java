import java.util.Scanner;

class Box3 {
    double length, width, height;

    // Method to calculate volume
    double volume() {
        return length * width * height;
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box3 b = new Box3();

        System.out.print("Enter length: ");
        b.length = sc.nextDouble();

        System.out.print("Enter width: ");
        b.width = sc.nextDouble();

        System.out.print("Enter height: ");
        b.height = sc.nextDouble();

        System.out.println("Volume of the box = " + b.volume());
    }
}
