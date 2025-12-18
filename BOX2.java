import java.util.Scanner;

// Base class
class Plate {
    protected double length, width;

    Plate(Scanner sc) {
        System.out.println("Plate Constructor Called");
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }
}

// Derived class from Plate
class Box extends Plate {
    protected double height;

    Box(Scanner sc) {
        super(sc); // Calls Plate constructor
        System.out.println("Box Constructor Called");
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }
}

// Derived class from Box
class WoodBox extends Box {
    private double thick;

    WoodBox(Scanner sc) {
        super(sc); // Calls Box constructor
        System.out.println("WoodBox Constructor Called");
        System.out.print("Enter thickness: ");
        thick = sc.nextDouble();
    }

    void display() {
        System.out.println("\n--- WoodBox Dimensions ---");
        System.out.println("Length: " + length);
        System.out.println("Width : " + width);
        System.out.println("Height: " + height);
        System.out.println("Thickness: " + thick);
    }
}

// Main class
public class BOX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating object of most derived class
        WoodBox wb = new WoodBox(sc);

        wb.display();
        sc.close();
    }
}
