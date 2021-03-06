public class MyArrayList<T> {
	//instance variables
	private T[] arr;
	private T[] temp;
	private int SIZE;
	private int count;
	
	//constructors
	public MyArrayList() {
		SIZE = 1;
		count = 0;
		arr = (T[]) new Object[SIZE];
	}
	
	public MyArrayList(T[] arr, int SIZE) {
		this.arr = arr;
		this.SIZE = SIZE;
	}
	
	//accessors
	//get
	public T get(int n) {
		return arr[n];
	}
		
	//size
	public int size() {
		return SIZE;
	}
	
	//instance methods
	//add operation 
	public void add(T n) {
		if (SIZE == count) {
			temp = (T[]) new Object[SIZE + 1];
			for (int i = 0; i < SIZE; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
			SIZE++;
		}
		arr[count++] = n;
	}
	
	//remove operation
	public void remove(int n) {
		for (int i = n; i < SIZE - 1; i++) {
			arr[i] = arr[i+1];
		}
		temp = (T[]) new Object[SIZE - 1];
		for (int i = 0; i < SIZE-1; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		SIZE--;
	}
	
	//print
	public void printData() {
		for (int i = 0; i < SIZE; i++) {
		System.out.print(arr[i] + " ");
		}
	}
}
