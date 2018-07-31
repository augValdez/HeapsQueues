/*
 * Augustine Valdez
 * HeapSort
 */
public class HeapSort  <T extends Comparable<? super T>> extends SortingAlgorithm <T> {
    
    public void sort(T[] array) {
        heapSort(array, array.length);
    }

    @SuppressWarnings("unchecked")
	public static <T> void heapSort(T[] a, int b) {
        PriorityQueue queue = new PriorityQueue();
        for(int i = 0; i < b; i++) {
            queue.add((Comparable)a[i]);
        }
        for(int i = b - 1; i >= 0; i--) {
            a[i] = (T)queue.remove();
        }
    }
}
