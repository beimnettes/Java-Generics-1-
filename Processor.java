// Define a generic interface with a type parameter T
public interface Processor<T> {
    T process(T input); // Method to process input of type T and return output of type T
}
