/**
 * Augustine Valdez
 */


public abstract class Algorithm<T extends Comparable< ? super T > > {

	public abstract void apply(T[] array);
	
	  public long  time(T[] array) {
	        long start, end;
	          start = System.currentTimeMillis();
	          // invoke the apply method
	          this.apply(array);
	          end = System.currentTimeMillis();

	          // returns elapsed time
	          return  (end - start);
	    }
	  
	 //Create an array containing n random Integers.
	 
	 public static Integer[] createRandomArray(int n) {
		 Integer[] randomArray = new Integer[n];
		 
		 for(int i = 0; i < n; i++) {
			 randomArray[i] = (int)(10*Math.random());
		 }
		 return randomArray;
	 }

}
