//Augustine Valdez

import static org.junit.Assert.*;

import org.junit.Test;


public class TestMaxHeap {

	@Test
    public void testAdd() {
        MaxHeap<Integer> maxHeap = new MaxHeap<Integer>();
        int[] element = new int[10];
        for(int i = 1; i < 11; i++) {
            element[i - 1] = i;
        }
        
        for(int i = 0; i < 10; i++) {
        	maxHeap.add(element[i]);
        }
        
        for(int i = 1; i < maxHeap.getSize(); i++) {
            System.out.println(maxHeap.getIndexedValue(element[i]));
        }
        
        
        assertEquals(10, (int)maxHeap.getIndexedValue(1));
        assertEquals(9, (int)maxHeap.getIndexedValue(2));
        assertEquals(6, (int)maxHeap.getIndexedValue(3));
        assertEquals(7, (int)maxHeap.getIndexedValue(4));
        assertEquals(8, (int)maxHeap.getIndexedValue(5));
        assertEquals(2, (int)maxHeap.getIndexedValue(6));
        assertEquals(5, (int)maxHeap.getIndexedValue(7));
        assertEquals(1, (int)maxHeap.getIndexedValue(8));
        assertEquals(4, (int)maxHeap.getIndexedValue(9));
        assertEquals(3, (int)maxHeap.getIndexedValue(10));
    }

    @Test
    public void testRemove() {
        MaxHeap min = new MaxHeap();
        int[] element = new int[10];
        for(int i = 1; i < 11; i++) {
            element[i - 1] = i;
        }
        for(int i = 0; i < 10; i++) {
            min.add(element[i]);
        }
        min.remove();
        min.remove();
        assertEquals(8, min.getSize());
    }

    @Test
    public void isEmpty() {
    	MaxHeap max = new MaxHeap();
    	assertTrue(max.isEmpty());
    }
}
