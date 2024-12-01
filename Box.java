public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public <U> void printBox(U value) {
        System.out.println("Box contains: " + value);
    }

    public static void main(String[] args) {
        // Instances of Box for different types
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println("Integer Box: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String Box: " + strBox.get());

        // Using generic printBox method
        intBox.printBox(intBox.get());
        strBox.printBox(strBox.get());
    }
}
