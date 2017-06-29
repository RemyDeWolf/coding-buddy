import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinaryTreeTest {

    protected BinaryTree createInstance() {
        return new BinaryTree();
    }

    @Test
    public void testAddAndSearchOne() {
        BinaryTree bt = createInstance();
        assertFalse(bt.search(5));
        bt.add(5);
        assertTrue(bt.search(5));
        bt.add(5);
        assertTrue(bt.search(5));
    }

    @Test
    public void testAddAndSearchMany() {
        BinaryTree bt = createInstance();
        bt.add(5);
        bt.add(4);
        bt.add(3);
        bt.add(8);
        bt.add(7);
        assertTrue(bt.search(5));
        assertTrue(bt.search(4));
        assertTrue(bt.search(3));
        assertTrue(bt.search(8));
        assertTrue(bt.search(7));
    }

    @Test
    public void testAddAndRemoveOne() {
        BinaryTree bt = createInstance();
        bt.add(5);
        bt.remove(5);
        assertFalse(bt.search(5));
    }

    @Test
    public void testAddAndRemoveMany() {
        BinaryTree bt = createInstance();
        bt.add(5);
        bt.add(8);
        bt.add(1);
        bt.add(3);
        bt.add(2);
        bt.add(4);
        bt.add(9);
        bt.add(6);
        bt.add(7);
        bt.remove(6);
        bt.remove(7);
        assertFalse(bt.search(6));
        assertFalse(bt.search(7));
        bt.remove(5);
        assertFalse(bt.search(5));
        assertTrue(bt.search(8));
        assertTrue(bt.search(1));
        assertTrue(bt.search(3));
        assertTrue(bt.search(2));
        assertTrue(bt.search(2));
        assertTrue(bt.search(4));
        assertTrue(bt.search(9));
    }

    @Test
    public void testRandomNumberSearch() {
        BinaryTree bt = createInstance();
        int limit = 10000;
        int low = -1000000;
        int high = 1000000;
        int[] array = new Random().ints(limit, low, high).toArray();
        Arrays.stream(array).forEach(i -> bt.add(i));

        //test all present
        Arrays.stream(array).forEach(i -> {
            assertTrue(bt.search(i));
        });

        int[] arrayToRemove = new Random().ints(limit, low, high).toArray();
        Arrays.stream(arrayToRemove).forEach(i -> bt.remove(i));

        //test all removed
        Arrays.stream(arrayToRemove).forEach(i -> {
            assertFalse(bt.search(i));
        });

    }
}
