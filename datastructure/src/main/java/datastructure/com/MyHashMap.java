package datastructure.com;

public class MyHashMap<K,V> {
     MyLinkedList<K> linkedList;
     
     public MyHashMap() {
 		this.linkedList = new MyLinkedList<K>();
 	}

 	public V get(K key) {
 		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.linkedList.search(key);
 		return (myMapNode == null) ? null : myMapNode.getValue();
 	}

 	public void add(K key, V value) {
 		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.linkedList.search(key);
 		if (myMapNode == null) {
 			myMapNode = new MyMapNode<K, V>(key, value);
 			this.linkedList.append(myMapNode);
 		} else {
 			myMapNode.setValue(value);
 		}
 	}

 	public String toString() {
 		return "LinkedListNodes{" + linkedList + '}';
 	}
}
