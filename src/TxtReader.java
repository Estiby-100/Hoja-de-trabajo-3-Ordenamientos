import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtReader {

    public static Integer[] readFile(String fileName) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = reader.readLine()) != null) {
            numbers.add(Integer.valueOf(line));
        }

        reader.close();
        Integer[] array = new Integer[numbers.size()];
        numbers.toArray(array);
        return array;
}
}