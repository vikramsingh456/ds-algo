package unionfind;

public class QuickFindUF<T> {

	private T[] id;
	
	public QuickFindUF(int N){
		id = (T[]) new Object[N];
	}
	
	public boolean connected(T p, T q){
		return p.equals(q);
	}
	
	public void union(T p, T q){
		
	}
}
