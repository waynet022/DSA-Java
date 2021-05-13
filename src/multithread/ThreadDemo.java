package multithread;

public class ThreadDemo {
    public static void show() {

//        showMultiThread();
//        joinThread();
        cancelThread();

        System.out.println("File is ready to be scanned");
    }

    public static void cancelThread(){
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }

    public static void joinThread(){
    /*
    waits for the thread to finish before continuing current thread
     */
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void showMultiThread(){
        for(int i = 0; i<10; i++){
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
