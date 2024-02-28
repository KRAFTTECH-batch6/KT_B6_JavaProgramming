package day44_AbstractClassAndInterface.animal;

import java.lang.reflect.AnnotatedArrayType;

public abstract class Animal {
    private String name;
    private final String breed;
    private  char gender;
    private int age;
    private String size;
    private final String color;




    public abstract void eat();

    public final void drinkWater(){
        System.out.println(name+ " is drinking water ");
    }



    public Animal(String name, String breed, char gender, int age, String size, String color) {
       // this.name = name;
        setName(name);
        this.breed = breed;
        if (!(gender=='M'||gender=='m'||gender=='F'||gender=='f')){
            System.err.println("Invalid gender "+ gender);
        }else {
            this.gender=gender;
        }
       // this.age = age;
        setAge(age);
        this.size = size;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
        }else {
            this.name = name;
        }

    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("Invalid age "+ age);
        }{
            this.age = age;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

/*Animal task:


       		Create an abstract class named Animal:
        			Variables:
        			name, breed(final), gender(final),  age, size, color(final)

        			Encapsulate all the fields

        			Add a constructor that can set all the fields

        			Methods:
        				eat(); ==> different animals eat different food
        				drink() ==> all the animals drink water
        				toString() ==> to display the full info of the Animal

    Create the following subclasses of Animal:
        Dog
        eat(): eats bones

        Cat
        eat(): eats liver

        Tiger
        eat(): eats deer

        Parrot
        eat(): eats sunflower seeds

        Eagle
        eat(): eats snake*/