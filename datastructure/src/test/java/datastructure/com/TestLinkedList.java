package datastructure.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestLinkedList {
	@Test
	public void testAddNodesToLinkedList() {
		MyNode<Integer> myFirstNode=new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode=new MyNode<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result=myLinkedList.head.equals(myThirdNode) &&
				                       myLinkedList.head.getNext().equals(mySecondNode) &&
				                       myLinkedList.tail.equals(myFirstNode);
		Assertions.assertTrue(result);
	}
	@Test
	 public void testAppendNodesToLinkedList() {
			MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
			MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
			MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
			MyLinkedList myLinkedListDemo = new MyLinkedList();
			myLinkedListDemo.add(myFirstNode);
			myLinkedListDemo.append(mySecondNode);
			myLinkedListDemo.append(myThirdNode);
			myLinkedListDemo.printMyNodes();
			boolean result=myLinkedListDemo.head.equals(myFirstNode) &&
					                       myLinkedListDemo.head.getNext().equals(mySecondNode) &&
					                       myLinkedListDemo.tail.equals(myThirdNode);
			Assertions.assertTrue(result);
	 }
	@Test
	public void testPopFirstNodeToLinkedList() {
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
		MyLinkedList myLinkedListDemo = new MyLinkedList();
		myLinkedListDemo.add(myFirstNode);
		myLinkedListDemo.append(mySecondNode);
		myLinkedListDemo.append(myThirdNode);
		myLinkedListDemo.popFirst();
		myLinkedListDemo.printMyNodes();
		boolean result=myLinkedListDemo.head.equals(mySecondNode) &&
				                       myLinkedListDemo.head.getNext().equals(myThirdNode) &&
				                       myLinkedListDemo.tail.equals(myThirdNode);
		Assertions.assertTrue(result);
	}
	
	@Test
	public void testPopLastNodeToLinkedList() {
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
		MyLinkedList myLinkedListDemo = new MyLinkedList();
		myLinkedListDemo.add(myFirstNode);
		myLinkedListDemo.append(mySecondNode);
		myLinkedListDemo.append(myThirdNode);
		myLinkedListDemo.popLast();
		myLinkedListDemo.printMyNodes();
		boolean result=myLinkedListDemo.head.equals(myFirstNode) &&
				                       myLinkedListDemo.head.getNext().equals(mySecondNode) &&
				                       myLinkedListDemo.tail.equals(mySecondNode);
		Assertions.assertTrue(result);
	}
}
