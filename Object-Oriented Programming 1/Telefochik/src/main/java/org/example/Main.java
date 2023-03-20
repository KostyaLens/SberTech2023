package org.example;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("+79646623957","iPhone", 350);
        System.out.println(phone.toString());
        phone.receiveCall("Мама");
        phone.sendMessage();
    }
}