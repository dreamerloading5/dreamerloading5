import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <filename>");
            System.exit(1);
        }

        String filename = args[0];
        String text = "Hello Distributed Systems World!";

        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(text);
            writer.close();
            System.out.println("File '" + filename + "' has been successfully written.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
