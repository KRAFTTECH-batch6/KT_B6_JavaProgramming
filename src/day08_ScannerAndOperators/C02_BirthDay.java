package day08_ScannerAndOperators;

public class C02_BirthDay {
    public static void main(String[] args) {
        String name="Yusuf";
        int birthDay=30;
        String monthOfBirth="August";
        int birthYear= 1985;

        // Yusuf was born on "August\30\1985".

        System.out.println(name+" was born on \"      "    +monthOfBirth+"\\"+birthDay+"\\"+birthYear+"\"");


    }
}
/*
        escape chars
        \n
        \t
        \"
        \\
        * */