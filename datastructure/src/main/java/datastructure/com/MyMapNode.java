package datastructure.com;

public class MyMapNode<K,V> implements INode<K> {
    K key;
    V value;
    MyMapNode<K,V> next;
    
    public MyMapNode(K key,V value) {
    	this.key=key;
    	this.value=value;
    	next=null;
    }
    
	public K getKey() {
		return key;
	}

	public void setkey(K key) {
		this.key=key;
	}

	public INode<K> getNext() {
		
		return next;
	}

	public void setNext(INode next) {
		this.next=(MyMapNode<K,V>) next;
	}
	
	public V getValue() {
		return this.value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "K=").append(key).append(" V=").append(value).append("}");
		if (next != null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}
	

}
