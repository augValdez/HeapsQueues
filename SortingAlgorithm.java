//Augustine Valdez


public abstract class SortingAlgorithm <T extends Comparable < ? super T>>
extends Algorithm <T> {
	
	public abstract void sort (T[] array);
	
	public void apply(T[] array) {
		this.sort(array);
	}
	
	public static <T extends Comparable<? super T>> boolean isSorted(Comparable[] array) {
		boolean sorted = true;
		for(int i = 1; i < array.length; i++) {
			if(array[i].compareTo(array[i - 1]) < 0) {
				return false;
			} else if(array[i].compareTo(array[i -1]) == 0) {
				sorted = true;
			}
		}
		return sorted;
	}
	
	protected static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp; 
	} 
}
