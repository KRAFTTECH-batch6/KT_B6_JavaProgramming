package day39_ConstructorOverloading;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age<0 || age>150){
            System.out.println("Invalid age ="+age);
            System.exit(-10);
        }
        this.age=age;
    }







    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
