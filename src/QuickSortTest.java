import org.junit.*;
import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testUnorderedArray() {
        Integer[] array = {8, 2, 5, 1};
        QuickSort.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 5, 8}, array);
    }

    @Test
    public void testAlreadyOrderedArray() {
        Integer[] array = {1, 2, 3, 4};
        QuickSort.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4}, array);
    }
}

