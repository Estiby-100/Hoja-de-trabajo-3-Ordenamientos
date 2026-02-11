import org.junit.*;
import static org.junit.Assert.*;

public class GnomeSortTest {

    @Test
    public void testUnorderedArray() {
        Integer[] array = {9, 4, 7, 1};
        GnomeSort.sort(array);
        assertArrayEquals(new Integer[]{1, 4, 7, 9}, array);
    }

    @Test
    public void testAlreadyOrderedArray() {
        Integer[] array = {1, 2, 3, 4};
        GnomeSort.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4}, array);
    }
}

