package day50_Week10_Review.scrumTeam;

public class Developer extends Employee implements DevTeam{
    public String programmingLanguage;

    @Override
    public void coding() {
        System.out.println(jobTitle+" "+name+" is programming "+programmingLanguage);
    }

    public void fixingBugs(){
        System.out.println(jobTitle+" "+name+" is fixing bugs");
    }


    public Developer(String name, int age, char gender,  double salary, int id, String deparmentName, String programmingLanguage) {
        super(name, age, gender, "Developer", salary, id, deparmentName);
        this.programmingLanguage = programmingLanguage;
    }
}
