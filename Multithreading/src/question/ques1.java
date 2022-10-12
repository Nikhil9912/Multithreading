package question;

public class ques1 {
	public static void main(String[] args) {
        ThreadRunnable threadRunnable= new ThreadRunnable();
        ThreadThread threadThread= new ThreadThread();
        threadThread.start();
        try {
            threadThread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            threadThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Thread(threadRunnable).start();
    }


}
//-----------------------------------OUTPUT-----------------------
//Thread made using Runnable Interface
//Thread made using Thread Class