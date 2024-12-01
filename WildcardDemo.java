public class WildcardDemo {
    public static void printNumberBox(Box<? extends Number> box) {
        System.out.println("Wildcard NumberBox contains: " + box.get());
    }

    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.set(100);

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.set(99.99);

        printNumberBox(intBox);
        printNumberBox(doubleBox);
    }
}
