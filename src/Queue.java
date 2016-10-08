
public class Queue {
	int size,capacity;
	int rear,front;
	int array[];
	public Queue(int cap){
		capacity=cap;
		array=new int[cap];
		size=front=rear=0;
	}
	
	public void enq(int val){
		if(size>capacity)
			throw new ArrayIndexOutOfBoundsException("Overflow");
		array[rear]=val;
		rear=(rear+1)%capacity;
		size++;
	}
	
	public int deq(){
		if(size==0)
			throw new ArrayIndexOutOfBoundsException("Underflow");
		int tmp=array[front];
		front=(front+1)%capacity;
		size--;
		return tmp;
	}
	
	public int peek(){
		if(size==0)
			throw new ArrayIndexOutOfBoundsException("Underflow");
		return array[front];
	}
	
	public void traverse(){
		for(int i=0;i<size;i++){
			System.out.println(this.peek());
			this.enq(this.deq());
		}
	}
}
