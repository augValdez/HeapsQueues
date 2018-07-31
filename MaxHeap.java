/**
 * MaxHeap.java
 * 
 * Implementation of the HeapInterface as a maximum heap (max heap)
 * 
 * @author [Augustine Valdez]
 *
 * @param <T>
 */

public class MaxHeap <T extends Comparable<? super T>> implements HeapInterface<T> {
	
	private T[] elements;
	private static final int DEFAULT_CAPACITY = 20;
    private  int numberOfElements = 0;

	public MaxHeap() {
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public MaxHeap(int capacity) {
		elements = (T[]) new Comparable[capacity + 1];
	}

    public void add(T item) {
        ensureCapacity();
        numberOfElements++;
	    elements[numberOfElements] = item;
        int index = numberOfElements;
        T temp;
        while(index > 1) {
            if(item.compareTo(elements[index / 2]) > 0) {
                temp = elements[index / 2];
                elements[index] = temp;
                elements[index / 2] = item;
                index = index / 2;
            } else {
                return;
            }
        }
    }

	public T remove() {
	    if(isEmpty()) {
            return null;
        }
	    
        T temp = elements[1];
	    elements[1] = elements[numberOfElements];
	    elements[numberOfElements] = null;
        removeHelper(1, elements[1]);
        numberOfElements--;
	    return temp;
	}

	public void removeHelper(int index, T item) {
        T left = getLeftChild(index);
        T right = getRightChild(index);
        if(right == null && left == null) {
            return;
        } else if(right == null) {
            if(item.compareTo(elements[index * 2]) < 0) {
                elements[index] = elements[index * 2];
                elements[index * 2] = item;
                removeHelper(index * 2, item);
            } else {
                return;
            }
        } else if(left == null) {
            if(item.compareTo(elements[index * 2 + 1]) < 0) {
                elements[index] = elements[index * 2 + 1];
                elements[index * 2 + 1] = item;
                removeHelper(index * 2 + 1, item);
            } else {
                return;
            }
        } else {
            if(left.compareTo(right) > 0) {
                if(item.compareTo(elements[index * 2]) < 0)  {
                    elements[index] = elements[index * 2];
                    elements[index * 2] = item;
                    removeHelper(index * 2, item);
                }
            } else {
                if(item.compareTo(elements[index * 2 + 1]) < 0) {
                    elements[index] = elements[index * 2 + 1];
                    elements[index * 2 + 1] = item;
                    removeHelper(index * 2 + 1, item);
                }
            }
        }
    }

    public T getLeftChild(int index) {
        if(index * 2 > numberOfElements)
            return null;
        return elements[index * 2];
    }

    public T getRightChild(int index) {
        if(index * 2 + 1 > numberOfElements)
            return null;
        return elements[index * 2 + 1];
    }

	public T front() {
		return elements[1];
	}

	public boolean isEmpty() {
		for(int i = 0; i < elements.length; i++) {
            if(elements[i] != null) {
                return false;
            }
        }
        return true;
	}

	public int getSize() {
		return numberOfElements;
	}

	public T getIndexedValue(int index) {
        return elements[index];
    }

	private void ensureCapacity() {
		if(2 + numberOfElements > elements.length) {
           T[] temp = (T[]) new Comparable[2 + numberOfElements];
            for(int i = 1; i < elements.length; i++) {
                temp[i] = elements[i];
            }
            elements = temp;
        }
	}
}

	

