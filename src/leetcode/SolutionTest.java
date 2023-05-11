package leetcode;

import leetcode.model.ListNode;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.*;

public class SolutionTest {

    private static final Object LOCK1 = new Object();

    public static void main(String[] args) throws IOException {
        Solution s = new PossibleSolution();

        SolutionTest st = new SolutionTest();
        st.t1();
    }

    public void t1(){
        Runnable r1 = ()->{
            synchronized (LOCK1){
                try {
                    System.out.println("线程"+Thread.currentThread().getName()+"进入等待状态。。。");
                    LOCK1.notify();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable r2 = ()->{
            synchronized (LOCK1){
                try {
                    System.out.println("线程"+Thread.currentThread().getName()+"进入等待状态。。。");
                    LOCK1.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(r2).start();
        new Thread(r1).start();
    }

    static class IsAuth {

        private static final IsAuth isAuth = new IsAuth();

        private static String userAuth;

        private static Boolean decide = false;

        public static IsAuth init(String auth){
            userAuth = auth;
            return isAuth;
        }

        public IsAuth not(String auth){
            //只要条件中有一个是的话, 则抛出
            if (userAuth.contains(auth))
                decide = false;
            return isAuth;
        }

        public IsAuth or(String auth){
            //只要条件中有一个是的话, 则不抛出
            if (decide) return isAuth;
            if (userAuth.contains(auth))
                decide = true;
            return isAuth;
        }

        public void start(){
            //判断权限
            if (!decide) System.out.println("没有权限");
            else System.out.println("有权限");
        }
    }
}
