package multithread;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {

//        showMultiThread();
//        joinThread();
//        cancelThread();
        showStatus();
        System.out.println("File is ready to be scanned");
    }

    public static void showStatus(){
        var status = new DownloadStatus();
        List<Thread> threads = new ArrayList<>();
        for(int i = 0; i<10; i++){
            Thread thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }
        for(var thread: threads){
            try{
                thread.join();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(status.getTotalBytes());
    }

    public static void cancelThread(){
        var status = new DownloadStatus();
        Thread thread = new Thread(new DownloadFileTask(status));
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
        var status = new DownloadStatus();
        Thread thread = new Thread(new DownloadFileTask(status));
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void showMultiThread(){
        var status = new DownloadStatus();
        for(int i = 0; i<10; i++){
            Thread thread = new Thread(new DownloadFileTask(status));
            thread.start();
        }
    }
}
