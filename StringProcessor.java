// Implement the Processor interface for the String type
public class StringProcessor implements Processor<String> {

    // Override the process method to reverse the input string
    @Override
    public String process(String input) {
        if (input == null) {
            return ""; // Handle null input gracefully
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        // Create an instance of StringProcessor
        StringProcessor processor = new StringProcessor();

        // Test the process method with a sample string
        String result = processor.process("Generics");
        System.out.println("Reversed String: " + result); // Expected: scinereG

        // Additional test cases
        System.out.println("Reversed Empty String: \"" + processor.process("") + "\""); // Expected: ""
        System.out.println("Reversed Null String: \"" + processor.process(null) + "\""); // Expected: ""
    }
}
