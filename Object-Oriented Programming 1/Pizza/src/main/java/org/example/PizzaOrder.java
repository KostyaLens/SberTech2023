package org.example;

public class PizzaOrder {
    public enum Size{
        SMALL,
        MEDDIUM,
        BIG
    }
    public Size size;
    private String addres;
    private boolean sous, accept;


    public PizzaOrder(Size size, String addres, boolean sous){
        this.addres = addres;
        this.sous = sous;
        this.size = size;
    }
    public Size getSize(){
        return this.size;
    }
    public String getAddres(){
        return this.addres;
    }
    public boolean getSous(){
        return this.sous;
    }

    public void setSize(Size size){
        this.size = size;
    }
    public void setAddres(String addres){
        this.addres = addres;
    }
    public void setSous(boolean sous){
        this.sous = sous;
    }
    public void order(){
        if (!this.accept){
            System.out.print("Заказ принят. ");
            if (this.size == Size.SMALL){
                System.out.print("Маленькая пицца «Аль-Капчоне»");
            }else if (this.size == Size.MEDDIUM){
                System.out.print("Средняя пицца «Аль-Капчоне»");
            }else if (this.size == Size.BIG){
                System.out.print("Большая пицца «Аль-Капчоне»");
            }
            if (this.sous) {
                System.out.print("c cоусом ");
            }
            else{
                System.out.print("без cоуса ");
            }
            System.out.println("на адрес " + this.addres);
            this.accept = true;
        }else{
            System.out.println("Заказ уже принят");
        }
    }
    public void cancel(){
        if (this.accept){
            System.out.println("Заказ отменён");
            this.accept = false;
        }
        else{
            System.out.println("Заказ не был принят");
        }
    }


    public String toString(){
        String S = this.addres;
        if (!this.sous) {
            S += " Соуса нет";
        }else{
            S += " Соус есть";
        }
        return S;
    }

}
