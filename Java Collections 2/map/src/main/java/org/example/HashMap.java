package org.example;

import static java.lang.Math.abs;

public class HashMap<K, D> {
    private int n = 101;
    private int Base = 17;
    private Node<K, D>[] HashTable = new Node[n];

    public HashMap() {
        for (int i = 0; i < n; i++) {
            this.HashTable[i] = null;
        }
    }

    private int hash(D data){
        int index = 0, s = 0;
        String key = " " + data;
        for (int i = 0; i < key.length(); i++){
            s = (int)key.charAt(i) * Base;
        }
        index = abs(s) % n;

        return index;
    }

    public void addHash(K key, D data){
        //раз ключи и данные поменяются местами, поэтому хэширую данные
        int index = hash(data);
        Node<K, D> addItem = new Node<>(key, data);
        Node<K, D> item = this.HashTable[index];
        if (item == null){
            this.HashTable[index] = addItem;
        }else{
            while (item.getNext() != null) {
                item = item.getNext();
            }
           item.setNext(addItem);
        }
    }

    public K Search(D key){
        int index = hash(key);
        Node<K, D> item = this.HashTable[index];
        K res = null;
        while (item != null && key != item.getKey()){
            item = item.getNext();
        }
        if (item != null){
             res = item.getData();
        }

        return res;
    }

}
class Node<K, D>{
//    Ключи и данные поменял местами
    private D key;
    private K value;
    private  Node next;
    public Node(K key, D value) {
        this.key = value;
        this.value = key;
        this.next = null;
    }

    public Node(K key, D value, Node next){
        this.key = value;
        this.value = key;
        this.next = next;
    }

    public D getKey(){
        return this.key;
    }

    public K getData(){
        return value;
    }

    public  Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}