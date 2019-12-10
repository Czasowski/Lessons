class MyRunnable implements Runnable {

    public void run() {
        go();
    }
    public void go() {
        try {
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        doMore();
    }
    public void doMore() {
        System.out.println("top o’ the stack");
    }
}
class ThreadTestDrive {
    public static void main (String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();

        System.out.println("back in main");
    }
}

class RunThreads implements Runnable {
    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("Alpha thread");
        beta.setName("Beta thread");
        alpha.start();
        beta.start();
    }
    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running");
        }
    }
}

class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

class RAndM implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main (String [] args) {
        RAndM theJob = new RAndM();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
    public void run() {
        for (int x = 0; x < 10; x++) {
            makeWithdrawl(10);
            if (account.getBalance() < 0) {
                System.out.println("Overdrawn!");
            }
         }
    }
    private synchronized void makeWithdrawl(int amount) {

        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");
        try {
            System.out.println(Thread.currentThread().getName() + " is going to sleep");
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
            System.out.println(Thread.currentThread().getName() + " woke up");
        account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawl");
        }
        else {
            System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
        }
    }
}