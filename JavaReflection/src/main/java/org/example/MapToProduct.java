package org.example;

import java.lang.reflect.Field;
import java.util.*;

public class MapToProduct {
    public Animal mapToProductDto(Pet pet){
        Class clazz = pet.getClass();
        Animal animal = new Animal();
        try {
            Field TitleField = clazz.getDeclaredField("name");
            TitleField.setAccessible(true);
            String title = (String) TitleField.get(pet);//взяли кличку из класса pet
            Field StatusField = clazz.getDeclaredField("status");
            StatusField.setAccessible(true);
            Status status = (Status) StatusField.get(pet);//взяли Статус из класса pet
            Field photoListField = clazz.getDeclaredField("photosList");
            photoListField.setAccessible(true);
            List<Photo> photos = (List<Photo>) photoListField.get(pet); //взяли Фото из класса pet
            clazz = animal.getClass();
            TitleField = clazz.getDeclaredField("title");
            TitleField.setAccessible(true);
            TitleField.set(animal, title);// установили кличку пета энималу
            StatusField = clazz.getDeclaredField("isAvailable");
            Field StatusField2 = clazz.getDeclaredField("isSold");
            StatusField2.setAccessible(true);
            StatusField.setAccessible(true);
            if (status == Status.AVAILABLE){// установили статус пета энималу
                StatusField.set(animal, true);
                StatusField2.set(animal, false);
            }else{
                StatusField.set(animal, false);
                StatusField2.set(animal, true);
            }
            HashMap<String, String> photosMap = new HashMap<>();
            photoListField = clazz.getDeclaredField("photosMap");
            photoListField.setAccessible(true);
            for (Photo photo : photos) {
                photosMap.put(photo.getName(), photo.getURL());
            }
            photoListField.set(animal, photosMap);// установили фото пета энималу
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Ошибка!!" + e);
        }


        return animal;
    }
}
