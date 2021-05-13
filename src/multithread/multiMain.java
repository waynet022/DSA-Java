package multithread;

public class multiMain {
    public static void main(String[] args){
//        showThreadInfo();
        ThreadDemo.show();
    }

    public static void showThreadInfo(){
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
