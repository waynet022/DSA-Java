package multithreadWLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
//    private Lock lock = new ReentrantLock();
    private int totalBytes;
    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();


    private int totalFiles;


    public int getTotalBytes() {
        return totalBytes;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public void incrementTotalFiles(){
        synchronized (totalFilesLock){
            totalFiles++;
        }
    }

//    Using synchronization
     public void incrementTotalBytes(){
        synchronized(totalBytesLock){
            totalBytes++;
        }
    }

//    Using lock
//    public void incrementTotalBytes(){
//        lock.lock();
//        try{
//            totalBytes++;
//        }
//        finally{
//            lock.unlock();
//        }
//    }
}

