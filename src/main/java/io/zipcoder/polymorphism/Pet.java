package io.zipcoder.polymorphism;

public abstract class Pet { //abstract class


    private String name;

    public Pet() {

    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }



    public Pet(String name){
        this.name = name;
    }

    public abstract String speak();

}
