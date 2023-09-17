package heroVired;

class SharedResource {
    private int buffer;
    private boolean isEmpty = true;

    public synchronized void produce(int value) {
        while (!isEmpty) {
            try {
                // Wait if the buffer is not empty
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        buffer = value;
        isEmpty = false;
        System.out.println("Produced: " + value);

        // Notify the waiting consumer that there is data available
        notify();
    }

    public synchronized int consume() {
        while (isEmpty) {
            try {
                // Wait if the buffer is empty
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        int value = buffer;
        isEmpty = true;
        System.out.println("Consumed: " + value);

        // Notify the waiting producer that space is available in the buffer
        notify();

        return value;
    }
}

class Producer implements Runnable {
    private final SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private final SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int value = resource.consume();
        }
    }
}

public class ProducerConsumerEx {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}




