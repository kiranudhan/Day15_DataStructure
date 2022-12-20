package datastructure.com;

public class MyLinkedList<K> {
         
	public INode head;
	public INode tail;
	
	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}
	
	public void add(INode myNode) {
		if(this.tail==null) {
			this.tail=myNode;
		}
		if(this.head==null) {
			this.head=myNode;
		}else {
			INode tempNode=this.head;
			this.head=myNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void printMyNodes() {
		StringBuffer myNodes=new StringBuffer("My Nodes :");
		INode tempNode=head;
		while(tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.getNext().equals(tail)) {
				myNodes.append(" ->  ");
			}
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
	public void append(INode myNode) {
		if(this.head==null)
		{
			this.head=myNode;
		}
		if(this.tail==null) {
			this.tail=myNode;
		}else {
			this.tail.setNext(myNode);
			this.tail=myNode;
		}
	}
	public void insert(INode myFirstNode,INode mySecondNode) {
		INode tempNode=myFirstNode.getNext();
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(tempNode);
	}
	public INode popFirst() {
		INode tempNode=this.head;
		this.head=head.getNext();
		return tempNode;
	}
	public INode popLast() {
		INode tempNode=head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode=tempNode.getNext();
		}
		this.tail=tempNode;
		tempNode.setNext(null);
		return tempNode;
	}
	
	public INode<K> search(K key) {
		INode<K> tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
}
