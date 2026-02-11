import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumber {

    public static void generateFile(String fileName, int size) throws IOException {
        Random random = new Random();
        FileWriter writer = new FileWriter(fileName);

        for (int i = 0; i < size; i++) {
            int number = random.nextInt(10000);
            writer.write(number + "\n");
        }

        writer.close();
    }
}
