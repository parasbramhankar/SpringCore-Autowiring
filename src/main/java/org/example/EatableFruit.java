package org.example;

public class EatableFruit {

    Fruit fruit;

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    void fruitName(){
        boolean isFruitEatable=fruit.isEatable();

        if(isFruitEatable){
            System.out.println("This fruit is eatable");
        }else{
            System.out.println("This is not eatable");
        }
    }
}
