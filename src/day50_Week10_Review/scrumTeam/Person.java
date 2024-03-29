package day50_Week10_Review.scrumTeam;

public class Person {
    public String name;
    public int age;
    public char gender;


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name+"is eating "+ food);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
