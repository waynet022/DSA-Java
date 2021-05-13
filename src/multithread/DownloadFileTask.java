package multithread;

public class DownloadFileTask implements Runnable{

    @Override
    public void run(){
        System.out.println("Downloading a file: "+ Thread.currentThread().getName());

//        makeSleep();
        displayDownloadingBytes();

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public void makeSleep(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void displayDownloadingBytes(){
        for(int i = 0; i<Integer.MAX_VALUE; i++){
            if(Thread.currentThread().isInterrupted()) return;
            System.out.println("Downloading byte: " + i);
        }
    }
}
