package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Right {

    private static final ArrayBlockingQueue<Runnable> abq = new ArrayBlockingQueue<>(6);

    private static final ThreadPoolExecutor tpe = new ThreadPoolExecutor(4, 6, 30, TimeUnit.SECONDS, abq);

}

class Pass implements Runnable{

    @Override
    public void run() {

    }
}
