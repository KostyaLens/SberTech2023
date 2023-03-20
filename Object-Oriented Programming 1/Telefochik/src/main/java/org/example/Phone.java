package org.example;

public class Phone {
     private String number, model;
     private int weight;

    public Phone(){
    }
    public Phone(String number, String model){
        this.model = model;
        this.number = number;
    }
    public Phone(String number, String model, int weight){
        this.model = model;
        this.number = number;
        this.weight = weight;;
    }

    public String receiveCall(String name){
        System.out.println("Звонит " + name);
        return null;
    }
    public String getNumber(){
        return number;
    }

    public String receiveCall(String name, String number){
        System.out.println("Звонит " + name);
        return null;
    }

    public String[] sendMessage(){
        String[] sendMessager = new String[3];
        sendMessager[0] = "+791192331";
        sendMessager[1] = "+798189321";
        sendMessager[2] = "+791291341";
        for (int i = 0; i < sendMessager.length; i ++){
            System.out.println(sendMessager[i]);
        }
        return sendMessager;
    }
   public String toString(){
        String S = this.model + " " + this.number + " " + this.weight;
       return S;
   }

}
