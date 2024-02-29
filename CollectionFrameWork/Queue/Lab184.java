package CollectionFrameWork.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab184 {
    public static void main(String[] args) {
        Queue pq1 = new PriorityQueue();
        pq1.offer(02);
        pq1.offer(33);
        pq1.offer(25);
        pq1.offer(89);
        pq1.offer(75);
        pq1.offer(48);
        pq1.add(90);



        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.peek());


    }
}
