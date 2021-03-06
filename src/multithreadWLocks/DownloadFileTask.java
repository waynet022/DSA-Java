package multithreadWLocks;

public class DownloadFileTask implements Runnable{

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run(){
        System.out.println("Downloading a file: "+ Thread.currentThread().getName());

//        makeSleep();
        displayDownloadingBytes();

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }

    public void displayDownloadingBytes(){
        for(int i = 0; i<10_000; i++){
            if(Thread.currentThread().isInterrupted()) return;
//            System.out.println("Downloading byte: " + i);
            status.incrementTotalBytes();
        }
    }
}

