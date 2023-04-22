package org.example;

import org.junit.Assert;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class MapToProductTest {

    @org.junit.Test
    public void mapToProductDto() throws NoSuchFieldException, IllegalAccessException {
        int i = 0;
        MapToProduct mapToProduct = new MapToProduct();
        Pet cat = new Pet("Барсик", Status.AVAILABLE,
                List.of(new Photo("Барсик с цветочком","https://placekitten.com/200/300"),
                        new Photo("Барсик на ручках", "https://placekitten.com/500/605")));
        Animal animal = mapToProduct.mapToProductDto(cat);
        Class clasz = cat.getClass();
        Field TitleField = clasz.getDeclaredField("name");
        TitleField.setAccessible(true);
        String name = (String)TitleField.get(cat);
        Class clazz = animal.getClass();
        TitleField = clazz.getDeclaredField("title");
        TitleField.setAccessible(true);
        String title = (String)TitleField.get(animal);
        Assert.assertEquals(name, title);
        Field StatusField = clasz.getDeclaredField("status");
        StatusField.setAccessible(true);
        Status s = (Status) StatusField.get(cat);
        StatusField = clazz.getDeclaredField("isAvailable");
        StatusField.setAccessible(true);
        boolean status1 = (boolean) StatusField.get(animal);
        StatusField = clazz.getDeclaredField("isSold");
        StatusField.setAccessible(true);
        boolean status2 = (boolean) StatusField.get(animal);
        if (s == Status.AVAILABLE) {
            Assert.assertEquals(true, status1);
            Assert.assertEquals(false, status2);
        }else {
            Assert.assertEquals(false, status1);
            Assert.assertEquals(true, status2);
        }
        clasz = cat.getClass();
        Field photoListField = clasz.getDeclaredField("photosList");
        photoListField.setAccessible(true);
        List<Photo> photos = (List<Photo>) photoListField.get(cat);
        Field photoMapField = clazz.getDeclaredField("photosMap");
        photoMapField = clazz.getDeclaredField("photosMap");
        photoMapField.setAccessible(true);
        HashMap<String, String> photosMap = (HashMap<String, String>) photoMapField.get(animal);
        for (String key: photosMap.keySet()){
            Photo photo = photos.get(i);
            Assert.assertEquals(key, photo.getName());
            Assert.assertEquals(photosMap.get(key), photo.getURL());
            i++;
        }
    }

}