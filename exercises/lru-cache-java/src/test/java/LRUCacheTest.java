import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class LRUCacheTest {

    @Test
    public void testAddOneElement() {
        LRUCache<Integer, Integer> cache = new LRUCache(2);
        assertNull(cache.get(1));
        cache.put(1, 1);
        assert cache.get(1) == 1;
    }

    @Test
    public void testAddOverCapacity() {
        LRUCache<Integer, Integer> cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assert cache.get(1) == 1;
        cache.put(3, 3);    // would remove key 2
        assertNull(cache.get(2));
    }

    @Test
    public void testAddSameNode() {
        LRUCache<Integer, Integer> cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(2, 2); //should keep 1
        cache.put(2, 2);
        assert cache.get(1) == 1;
    }

    @Test
    public void testKeepMostRecentlyUsed() {
        LRUCache<Integer, Integer> cache = new LRUCache(3);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        assert cache.get(1) == 1;
        assert cache.get(2) == 2;
        assert cache.get(3) == 3;
        cache.put(4, 4);    // would remove key 1
        assertNull(cache.get(1));

        assert cache.get(2) == 2;
        assert cache.get(3) == 3;
        assert cache.get(3) == 3;
        cache.put(5, 5);    // would remove key 4 (3 - 2 - 4 - 1)
        assertNotNull(cache.get(3));
        assertNull(cache.get(4));
    }

}
