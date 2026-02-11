import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        // Generate files (run this once)
        generateFiles();

        // File to test
        String fileName = "numbers_1000.txt";

        Integer[] originalData = TxtReader.readFile(fileName);

        runSelectionSort(originalData);
        runGnomeSort(originalData);
        runMergeSort(originalData);
        runQuickSort(originalData);
        runRadixSort(originalData);
    }

    private static void generateFiles() throws IOException {
        RandomNumber.generateFile("numbers_10.txt", 10);
        RandomNumber.generateFile("numbers_50.txt", 50);
        RandomNumber.generateFile("numbers_100.txt", 100);
        RandomNumber.generateFile("numbers_500.txt", 500);
        RandomNumber.generateFile("numbers_1000.txt", 1000);
        RandomNumber.generateFile("numbers_2000.txt", 2000);
        RandomNumber.generateFile("numbers_3000.txt", 3000);
    }

    private static void runSelectionSort(Integer[] data) {
        Integer[] array = Arrays.copyOf(data, data.length);

        long startTime = System.nanoTime();
        SelectionSort.sort(array);
        long endTime = System.nanoTime();

        System.out.println("Selection Sort time: " + (endTime - startTime));
    }

    private static void runGnomeSort(Integer[] data) {
        Integer[] array = Arrays.copyOf(data, data.length);

        long startTime = System.nanoTime();
        GnomeSort.sort(array);
        long endTime = System.nanoTime();

        System.out.println("Gnome Sort time: " + (endTime - startTime));
    }

    private static void runMergeSort(Integer[] data) {
        Integer[] array = Arrays.copyOf(data, data.length);

        long startTime = System.nanoTime();
        MergeSort.sort(array);
        long endTime = System.nanoTime();

        System.out.println("Merge Sort time: " + (endTime - startTime));
    }

    private static void runQuickSort(Integer[] data) {
        Integer[] array = Arrays.copyOf(data, data.length);

        long startTime = System.nanoTime();
        QuickSort.sort(array);
        long endTime = System.nanoTime();

        System.out.println("Quick Sort time: " + (endTime - startTime));
    }

    private static void runRadixSort(Integer[] data) {
        Integer[] array = Arrays.copyOf(data, data.length);

        long startTime = System.nanoTime();
        RadixSort.sort(array);
        long endTime = System.nanoTime();

        System.out.println("Radix Sort time: " + (endTime - startTime));
    }
}
