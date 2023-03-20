package org.example;

public class LinkedListD<T> {
    private TNode root;

    public void add(T item){
        TNode<T> newNode = new TNode(item);
        TNode lasTNode = findLast();
        if (lasTNode == null){
            root = newNode;
        }else {
            lasTNode.setNext(newNode);
        }
    }
    private TNode findLast(){
        TNode last = null;
        if (root != null) {
            last = root;
            while (last.getNext() != null) {
                last = last.getNext();
            }
        }

        return last;
    }

    public T get(int index){
        TNode res = root;
        int i = 0;
        int size = size();
        if (size - 1 < index){
            System.out.print("Индекс находится за пределами списка ");
            return null;
        }
        while (i < index){
            res = res.getNext();
            i++;
        }

        return (T) res.getNode();
    }

    public int size(){
        int size = 0;
        TNode Go;

        Go = root;
        if (Go == null){
            return 0;
        }
        while (Go != null){
            Go = Go.getNext();
            size++;
        }
        return size;
    }
}
class TNode<K>{
    private K value;
    private  TNode next;
    public TNode(K value) {
        this.value = value;
        this.next = null;
    }

    public TNode(K value, TNode next){
        this.value = value;
        this.next = next;
    }

    public K getNode(){
        return value;
    }

    public void setValue(K value){
        this.value = value;
    }

    public  TNode getNext(){
        return next;
    }

    public void setNext(TNode next){
        this.next = next;
    }


}
