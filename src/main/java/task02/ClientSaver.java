package task02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClientSaver {
    public static void saveClient(Client client, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(client);
            System.out.println("Client saved: " + filename);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
