package ru.itis;

/**
 * Created by asus on 14.03.2017.
 */
public class Queue {
    private final int MAX_QUEUE_SIZE = 50;
    private int queue[];
    private int count ;
    public Queue(){
        queue = new int [MAX_QUEUE_SIZE];
        count = 0;
        }
    public void put( char element) {

        for (int i = count; i > 0; i--) {
            queue[i] = queue[i-1];
        }
        queue[0] = element;
        count++;
        public int get() {
            int  result = queue[count - 1];
            count--;
            return result;
        }


    }
}
