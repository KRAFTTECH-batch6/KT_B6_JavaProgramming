package day35_Week07_Review;

import java.util.Arrays;

public class C05_Numbers1to100 {
    public static void main(String[] args) {
        int []numbers=new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i+1;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
