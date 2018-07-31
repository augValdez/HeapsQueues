import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A JUnit test case class for the insertion, selection, and merge sorts.
 * 
 * @author Greg Gagne
 */
public class SortingTest {

	
	@Test
	public void testHeapSort() {
		SortingAlgorithm<Integer> sorter = new HeapSort<Integer>();
		// all combinations of 1, 2, 3
		Integer[] array = {25000, 50000, 75000};
		sorter.sort(array);
		assertTrue(SortingAlgorithm.isSorted(array));
		array = new Integer[] {1,3,2};
		sorter.sort(array);
		assertTrue(SortingAlgorithm.isSorted(array));
		array = new Integer[] {2,1,3};
		sorter.sort(array);
		assertTrue(SortingAlgorithm.isSorted(array));
		array = new Integer[] {2,3,1};
		sorter.sort(array);
		assertTrue(SortingAlgorithm.isSorted(array));
		array = new Integer[] {3,1,2};
		sorter.sort(array);
		assertTrue(SortingAlgorithm.isSorted(array));
		array = new Integer[] {3,2,1};
		sorter.sort(array);
		// double-check negative numbers
		assertTrue(SortingAlgorithm.isSorted(array));
		array = new Integer[] {0,-1,-3};
		sorter.sort(array);
		// duplicate 0's
		assertTrue(SortingAlgorithm.isSorted(array));
		array = new Integer[] {1,0,0};
		sorter.sort(array);
		// duplicate positive numbers
		assertTrue(SortingAlgorithm.isSorted(array));
		array = new Integer[] {3,1,1};
		sorter.sort(array);
		assertTrue(SortingAlgorithm.isSorted(array));

		// stress test insertion sort
		Integer[] values = new Integer[10000];

		values = Algorithm.createRandomArray(10000);

		assertFalse(SortingAlgorithm.isSorted(values));

		
		sorter.sort(values);

		assertTrue(SortingAlgorithm.isSorted(values));
	}


}
