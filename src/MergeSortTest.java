import org.junit.*;
import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testUnorderedArray() {
        Integer[] array = {10, 3, 6, 2};
        MergeSort.sort(array);
        assertArrayEquals(new Integer[]{2, 3, 6, 10}, array);
    }

    @Test
    public void testAlreadyOrderedArray() {
        Integer[] array = {1, 2, 3, 4};
        MergeSort.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4}, array);
    }
}

