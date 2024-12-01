public class NumberBox<N extends Number> extends Box<N> {
    public static void main(String[] args) {
        NumberBox<Integer> intNumBox = new NumberBox<>();
        intNumBox.set(42);
        System.out.println("NumberBox (Integer): " + intNumBox.get());

        NumberBox<Double> doubleNumBox = new NumberBox<>();
        doubleNumBox.set(3.14);
        System.out.println("NumberBox (Double): " + doubleNumBox.get());

        // Uncommenting the following lines will result in a compile-time error
        // NumberBox<String> strNumBox = new NumberBox<>();
    }
}
