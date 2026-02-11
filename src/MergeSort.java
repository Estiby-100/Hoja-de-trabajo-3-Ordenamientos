public class MergeSort {

    public static <T extends Comparable<T>> void sort(T[] array) {
        if (array.length < 2) {
            return;
        }
        mergeSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void mergeSort(T[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] array, int left, int middle, int right) {
        int sizeLeft = middle - left + 1;
        int sizeRight = right - middle;

        Object[] leftArray = new Object[sizeLeft];
        Object[] rightArray = new Object[sizeRight];

        for (int i = 0; i < sizeLeft; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < sizeRight; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < sizeLeft && j < sizeRight) {
            if (((T) leftArray[i]).compareTo((T) rightArray[j]) <= 0) {
                array[k] = (T) leftArray[i];
                i++;
            } else {
                array[k] = (T) rightArray[j];
                j++;
            }
            k++;
        }

        while (i < sizeLeft) {
            array[k] = (T) leftArray[i];
            i++;
            k++;
        }

        while (j < sizeRight) {
            array[k] = (T) rightArray[j];
            j++;
            k++;
        }
    }
}