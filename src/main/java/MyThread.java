class MyThread extends Thread {

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("Я поток %s. Всем привет!", getName());
            }
        } catch (InterruptedException ignored) {

        } finally{
            System.out.printf("Поток %s завершен\n", getName());
        }
    }
}
