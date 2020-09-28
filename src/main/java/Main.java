public class Main {

    public static void main(String[] args) throws InterruptedException {

        ThreadGroup mainGroup = new ThreadGroup("mainGroup");
        final MyThread th1 = new MyThread(mainGroup, "1");
        final MyThread th2 = new MyThread(mainGroup, "2");
        final MyThread th3 = new MyThread(mainGroup, "3");
        final MyThread th4 = new MyThread(mainGroup, "4");

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        Thread.sleep(15000);
        mainGroup.interrupt();
        System.out.println("Завершаю все потоки.");

    }
}