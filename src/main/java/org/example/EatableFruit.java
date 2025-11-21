package org.example;

public class EatableFruit {

    Fruit1 fruit1;

    public void setFruit(Fruit1 fruit1) {
        this.fruit1 = fruit1;
    }

    void eatableFruit(){

        boolean isFruitEatable=fruit1.isEatable();

        if(isFruitEatable){
            System.out.println("This fruit is eatable");
        }else{
            System.out.println("This is not eatable");
        }
    }
}
