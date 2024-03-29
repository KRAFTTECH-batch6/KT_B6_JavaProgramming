package day55_Week11_Review;

import java.util.*;

public class C06_QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        queue.addAll(Arrays.asList(15,1,5,7,8,16,1));

        queue.add(11);
        queue.add(11);

        System.out.println("queue = " + queue);

        //1 yöntem
        Integer[] arr=queue.toArray(new Integer[0]);
        System.out.println("arr[1] = " + arr[1]);

        // 2. Yöntem
        List<Integer> list=new ArrayList<>(queue);
        System.out.println("list = " + list);
        System.out.println("list.get(2) = " + list.get(2));
    }
}
