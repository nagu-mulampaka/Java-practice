// Program to demonstrate Multithreading in Java

// Step 1: Create a subclass of Thread class
class MyThread extends Thread {
    String tname;

    MyThread(String s) {
        tname = s;
    }

    // Step 2: Override the run() method
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(tname + " : " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
class ThreadsExample {
    public static void main(String[] args) {

        System.out.println("Main thread started...");

        // Get the current thread (main thread)
        Thread t = Thread.currentThread();
        System.out.println(t);

        // Create a ThreadGroup
        ThreadGroup tg = new ThreadGroup("Java");

        // Step 3: Create an object of MyThread
        MyThread th = new MyThread("first Thread");

        // Step 4: Create a Thread object and link it with the above object
        Thread tr = new Thread(tg, th);
        tr.setName("first");
        tr.setPriority(7);

        // Set a user thread as daemon
        tr.setDaemon(true);

        System.out.println(tr);

        // Step 5: Start the thread
        tr.start();

        // Wait until the first thread finishes
        try {
            tr.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        // Create the second child thread
        MyThread th1 = new MyThread("second thread");
        Thread tr1 = new Thread(tg, th1);
        tr1.setName("second");
        tr1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(tr1);

        tr1.start();

        // Wait until the second thread finishes
        try {
            tr1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        // Check daemon status
        System.out.println("Is Main thread daemon: " + t.isDaemon());
        System.out.println("Is First thread daemon: " + tr.isDaemon());
        System.out.println("Is Second thread daemon: " + tr1.isDaemon());

        System.out.println("Main thread ends");
    }
}

/*
---------------------------------------------
Program Output:

Main thread started...
Thread[#1,main,5,main]
Thread[#30,first,7,Java]
first Thread : 1
first Thread : 2
first Thread : 3
first Thread : 4
first Thread : 5
first Thread : 6
first Thread : 7
first Thread : 8
first Thread : 9
first Thread : 10
Thread[#32,second,1,Java]
second thread : 1
second thread : 2
second thread : 3
second thread : 4
second thread : 5
second thread : 6
second thread : 7
second thread : 8
second thread : 9
second thread : 10

Is Main thread daemon: false
Is First thread daemon: true
Is Second thread daemon: false

Main thread ends
---------------------------------------------
*/