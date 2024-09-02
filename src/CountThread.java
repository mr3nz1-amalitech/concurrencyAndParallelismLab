public class CountThread extends Thread {
    private int thread;
    public CountThread(int thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + thread + ": " + i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
