public class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("My thread while implementing Runnable");
    }


    //    synchronized method ensures that the method can only be accessed by one method at a time per instance
    public synchronized void synchronizedMethod() {
        System.out.println("Synchronized Method");
    }

    public void method() {
        synchronized (this) {
//            a synchronized block as this can be useful for us to no synchronize a whole method including unnecessary code blocks
            System.out.println("Part of a whole method that needs synchronization");
        }
    }
}
