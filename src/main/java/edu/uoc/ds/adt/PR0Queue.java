package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PR0Queue {

    public final int CAPACITY = 10;

    private Queue<LocalDate> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }


    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd");
        while (!queue.isEmpty()) {
            sb.append(queue.poll().format(formatter)).append(", ");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 2) : "";  // Removing the last ", "
    }

    public Queue<LocalDate> getQueue() {
        return this.queue;
    }

    public void add(LocalDate date) {
        this.queue.add(date);
    }
}