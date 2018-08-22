package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class SortQueue {

    public static void main(String args[]) {

        Queue<String> waitingQueue = new LinkedList<String>();

        waitingQueue.add("Dian Setiyadi");
        waitingQueue.add("Ilham");
        waitingQueue.add("Ari Anwar");
        waitingQueue.add("Dadang Supratman");
        waitingQueue.add("FaridMan");

        System.out.println("Menunggu Antrian "+waitingQueue);

        System.out.println("Apakah antrian kosong "+waitingQueue.isEmpty());

        System.out.println("Banyaknya Antrian " +waitingQueue.size());

        String nama = "Ilham";

        if(waitingQueue.contains(nama)) {
            System.out.println("waitingQueue Contains "+nama);
        } else {
            System.out.println("waiting queue doesnt contains" +nama);
        }
        String firstPersonInTheWaitingQueue =  waitingQueue.element();
        System.out.println("First Person in the Waiting Queue (element()) : " + firstPersonInTheWaitingQueue);

        firstPersonInTheWaitingQueue = waitingQueue.peek();
        System.out.println("First Person in the Waiting Queue : " + firstPersonInTheWaitingQueue);


    }

}
