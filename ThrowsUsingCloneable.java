package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsUsingCloneable implements Cloneable {
    // Constructor
    ThrowsUsingCloneable() {
        // Constructor logic here if needed
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            // Creating an instance and cloning it
            ThrowsUsingCloneable t = new ThrowsUsingCloneable();
            ThrowsUsingCloneable clone = (ThrowsUsingCloneable) t.clone();
            System.out.println("Cloning successful");

            // Reading a file
            FileInputStream fis = new FileInputStream("src/ThrowsUsingCloneable.txt");
            System.out.println("File opened successfully");
            // Add code to read from the file if needed
            fis.close();
           // System.exit(1);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File operation error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
