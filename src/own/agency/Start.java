package own.agency;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author GLaDOS
 * @date 2023/5/8 22:08
 */
public class Start {

    private final CountDownLatch cdl = new CountDownLatch(4);

    public static void main(String[] args) {
        char[] chars = new char[16];
        try {
            FileReader fileReader = new FileReader("D:\\learn\\javaLearn\\src\\own\\agency\\test.txt");
            int read = fileReader.read(chars);
            System.out.println(read);
            System.out.println(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reverse(){
        Runnable r = ()->{
            try {
                cdl.countDown();
                System.out.println("正在做事....");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(r);
        thread.start();
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println("asd");
    }

    
}
