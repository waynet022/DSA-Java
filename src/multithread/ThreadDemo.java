package multithread;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {

//        showMultiThread();
//        joinThread();
//        cancelThread();
//        showStatus();
        confinementExample();

        System.out.println("File is ready to be scanned");
    }

    public static void confinementExample(){
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for(int i = 0; i<10; i++){
            var task = new DownloadFileTask();
            tasks.add(task);
            var thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }

        for(var thread: threads){
            try {
                thread.join();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        var totalBytes = tasks.stream().map(t -> t.getStatus().getTotalBytes()).reduce( Integer::sum);
        System.out.println(totalBytes);

    }

    public static void showStatus(){
        List<Thread> threads = new ArrayList<>();
        for(int i = 0; i<10; i++){
            Thread thread = new Thread(new DownloadFileTask());
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

    }

    public static void cancelThread(){
        var status = new DownloadStatus();
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
        var status = new DownloadStatus();
        Thread thread = new Thread(new DownloadFileTask());
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
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
