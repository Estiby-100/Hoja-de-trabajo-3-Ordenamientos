import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        String fileName = "numbers_100.txt";

        Integer[] originalData = TxtReader.readFile(fileName);

        runSelectionSort(originalData);
        runGnomeSort(originalData);
        runMergeSort(originalData);
        runQuickSort(originalData);
        runRadixSort(originalData);
    }

    private static void runSelectionSort(Integer[] data) {
        Integer[] array = Arrays.copyOf(data, data.length);

        long startTime = System.nanoTime();
        SelectionSort.sort(array);
        long endTime = System.nanoTime();

        System.out.println("Selection Sort (unordered): " + (endTime - startTime));

        startTime = System.nanoTime();
        SelectionSort.sort(array);
        endTime = System.nanoTime();

        System.out.println("Selection Sort (ordered): " + (endTime - startTime));
        
    }

    private static void runGnomeSort(Integer[] data) {
        Integer[] array = Arrays.copyOf(data, data.length);

       long startTime = System.nanoTime();
        GnomeSort.sort(array);
        long endTime = System.nanoTime();

        System.out.println("Gnome Sort (unordered): " + (endTime - startTime));

        startTime = System.nanoTime();
        GnomeSort.sort(array);
        endTime = System.nanoTime();

        System.out.println("Gnome Sort (ordered): " + (endTime - startTime));
    }

    private static void runMergeSort(Integer[] data) {
        Integer[] array = Arrays.copyOf(data, data.length);

       long startTime = System.nanoTime();
        MergeSort.sort(array);
        long endTime = System.nanoTime();

        System.out.println("Merge Sort (unordered): " + (endTime - startTime));

        startTime = System.nanoTime();
        MergeSort.sort(array);
        endTime = System.nanoTime();

        System.out.println("Merge Sort (ordered): " + (endTime - startTime));
        

    }

    private static void runQuickSort(Integer[] data) {
        Integer[] array = Arrays.copyOf(data, data.length);

        long startTime = System.nanoTime();
        QuickSort.sort(array);
        long endTime = System.nanoTime();

        System.out.println("Quick Sort (unordered): " + (endTime - startTime));

        startTime = System.nanoTime();
        QuickSort.sort(array);
        endTime = System.nanoTime();

        System.out.println("Quick Sort (ordered): " + (endTime - startTime));
        
    }

    private static void runRadixSort(Integer[] data) {
        Integer[] array = Arrays.copyOf(data, data.length);

        long startTime = System.nanoTime();
        RadixSort.sort(array);
        long endTime = System.nanoTime();

        System.out.println("Radix Sort (unordered): " + (endTime - startTime));

        startTime = System.nanoTime();
        RadixSort.sort(array);
        endTime = System.nanoTime();

        System.out.println("Radix Sort (ordered): " + (endTime - startTime));
        
    }
}
