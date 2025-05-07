package task02;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClientLoader {
    public static Client loadClient(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Client client = (Client) ois.readObject();
            System.out.println("Client loaded from file.");
            return client;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}