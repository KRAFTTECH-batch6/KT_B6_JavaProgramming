package day15_Week3_review;

public class C03_FINRA {
    public static void main(String[] args) {
        // 1 2 FIN 4 RA FIN    FINRA

        for (int i = 1; i <= 100; i++) {

            if (i%3==0 && i%5==0){
                System.out.print("FINRA ");
            } else if (i%3==0) {
                System.out.print("FIN ");
            } else if (i%5==0) {
                System.out.print("RA ");
            }else {
                System.out.print(i+" ");
            }

        }
    }
}
