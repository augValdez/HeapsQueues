//Augustine Valdez 

public class PriorityQueue<T extends Comparable<? super T>> implements Queue<T> {

	MaxHeap heap;

	public PriorityQueue() {
		heap = new MaxHeap();
	}
	public PriorityQueue(int size ) {
		heap = new MaxHeap(size);
	}

	@Override
	public void add(T item) {
		heap.add(item);
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return (T) heap.remove();
	}

	@Override
	public boolean isEmpty() {
		return heap.isEmpty();
	}

	@Override
	public int size() {
		return heap.getSize();
	}

}
