package datastructure.com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestStack {
	@Test
	public void given3NosWhenAddedToStackShouldHaveLastAddedNode() {
	MyNode<Integer> myFirstNode=new MyNode<Integer>(70);
	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
	MyNode<Integer> myThirdNode=new MyNode<Integer>(56);
	MyStack myStack=new MyStack();
	myStack.push(myFirstNode);
	myStack.push(mySecondNode);
	myStack.push(myThirdNode);
	INode peak =myStack.peak();
	Assertions.assertEquals(myThirdNode, peak);
   }
	@Test
	public void given2NosInStackWhenPopedShouldMatchWithLasAddedNode() {
		MyNode<Integer> myFirstNode=new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode=new MyNode<Integer>(56);
		MyStack myStack=new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode pop=myStack.pop();
		myStack.printStack();
		Assertions.assertEquals(myThirdNode, pop);
	}
}
