import org.junit.*;
import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void testUnorderedArray() {
        Integer[] array = {5, 3, 8, 1, 2};
        SelectionSort.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 5, 8}, array);
    }

    @Test
    public void testAlreadyOrderedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        SelectionSort.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }
}
