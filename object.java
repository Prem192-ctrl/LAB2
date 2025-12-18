class ObjectCount {
    // static variable to count objects
    static int count = 0;

    // constructor
    ObjectCount() {
        count++;
    }

    // static method to display count
    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class object {
    public static void main(String[] args) {
        ObjectCount obj1 = new ObjectCount();
        ObjectCount obj2 = new ObjectCount();
        ObjectCount obj3 = new ObjectCount();

        ObjectCount.displayCount();
    }
}
