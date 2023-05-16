package org.example;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Print(new Massages());
    }

    public static void Print(Massages clazz){
        Class claz = clazz.getClass();
        Method[] methods = clazz.getClass().getDeclaredMethods();
        for (Method method: methods){
            method.setAccessible(true);
            if (method.isAnnotationPresent(Paint.class)){
                String style = method.getAnnotation(Paint.class).style();
                try {
                    System.out.println(method.getAnnotation(Paint.class).color() + method.getAnnotation(Paint.class).style() +
                            method.invoke(clazz) + Color.RESET);

                }catch (Exception e){
                    System.out.println("Поизошла ошибка" + e);
                }
            }else if(clazz.getClass().isAnnotationPresent(Paint.class)){
                try {
                    System.out.println(clazz.getClass().getAnnotation(Paint.class).style() + clazz.getClass().getAnnotation(Paint.class).style() +
                            method.invoke(clazz) + Color.RESET);
                }catch (Exception e){
                    System.out.println("Поизошла ошибка" + e);
                }
            }
        }

    }
}