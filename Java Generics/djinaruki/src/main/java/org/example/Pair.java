package org.example;

public class Pair<K, D> {
    public K Key;
    public D Data;
    public Pair(K Key, D Data){
        this.Key = Key;
        this.Data = Data;
    }
    public <K> K getKey(){
        return (K) this.Key;
    }

    public <D> D getData(){
        return (D) this.Data;
    }
    public void setKey(K o){
        this.Key = o;
    }

    public void setData(D o){
        this.Data = o;
    }
}
