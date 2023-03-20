package org.example;

public class LinkedList {
    private Node root;


    public void add(Object item){
        Node newNode = new Node(item);
        Node lastNode = findLast();
        if (lastNode == null){
            root = newNode;
        }else {
            lastNode.setNext(newNode);
        }
    }
    private Node findLast(){
        Node last = null;
        if (root != null) {
            last = root;
            while (last.getNext() != null) {
                last = last.getNext();
            }
        }
        return last;
    }

    public Object get(int index){
        Node res = root;
        int i = 0;
        int size = size();
        if (size - 1 < index){
            System.out.print("Индекс находится за пределами списка ");
            return  null;
        }
        while (i < index){
            res = res.getNext();
            i++;
        }

        return res.getNode();
    }

    public int size(){
        int size = 0;
        Node Go;
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
class Node{
    private Object value;
    private  Node next;
    public Node(Object value) {
        this.value = value;
        this.next = null;
    }

    public Node(Object value, Node next){
        this.value = value;
        this.next = next;
    }

    public  Object getNode(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }

    public  Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }


}


