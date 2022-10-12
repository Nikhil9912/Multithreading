//Q1.
package question;

class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread made using Runnable Interface");
    }
}
class ThreadThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread made using Thread Class");
    }
}

