package multithread;

public class ThreadDemo {
    public static void show(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        for(int i = 0; i< 50; i++){
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
