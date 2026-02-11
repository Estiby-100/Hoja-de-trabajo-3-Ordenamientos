import org.junit.*;
import static org.junit.Assert.*;

public class RadixSortTest {

    @Test
    public void testUnorderedArray() {
        Integer[] array = {170, 45, 75, 90, 802};
        RadixSort.sort(array);
        assertArrayEquals(new Integer[]{45, 75, 90, 170, 802}, array);
    }

    @Test
    public void testAlreadyOrderedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        RadixSort.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }
}

