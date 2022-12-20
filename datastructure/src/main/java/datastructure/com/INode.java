package datastructure.com;

public interface INode<K> {
     K getKey();
     void setkey(K key);
     INode getNext();
     void setNext(INode next);
}
