
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(8);
		for(int i=1;i<9;i++)
			q.enq(i);
//		q.traverse();
//		Queue q2=interleave(q);
//		q2.traverse();
		interleave(q);
		q.traverse();
	}
	public static void interleave(Queue q){
		int half=q.size/2;
		Queue q0=new Queue(half);
		Queue q1=new Queue(half);
		for(int i=0;i<half;i++)
			q0.enq(q.deq());
		for(int i=0;i<half;i++)
			q1.enq(q.deq());
		for(int i=0;i<half;i++){
			q.enq(q0.deq());
			q.enq(q1.deq());
		}
//		return q;
	}
}
