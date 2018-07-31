//Augustine Valdez 

public class Task implements Comparable<Task> {
	private int priority;
	private String name;
	
	public Task(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}

	/**
	 * This method allows for comparing the priority between
	 * 'this' task and 'other' task.
	 */
	public int compareTo(Task other) {		
		if (this.priority < other.priority)
			return -1;
		else if (this.priority > other.priority)
			return +1;
		else
			return 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPriority() {
		return priority;
	}
	

}
