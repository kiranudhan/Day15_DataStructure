package datastructure.com;

public class MyNode<T> implements INode<T> {
    private T key;
    private INode<T> next;
    
    public MyNode(T key) {
    	this.key=key;
    	this.next=null;
    }
	public T getKey() {
		return key;
	}

	public void setkey(T key) {
	this.key=key;
	}

	public INode getNext() {
		return next;
	}

	public void setNext(INode next) {
	this.next=next;
	}

}
