package day44_AbstractClassAndInterface.animal;

public class Tiger extends Animal implements Wild {
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a rabbit");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting a deer");
    }
}
