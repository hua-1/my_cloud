/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Two
 * Author:   Administrator
 * Date:     2019/6/4 0004 17:42
 * Description: ceshi
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hua.test.thread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈ceshi〉
 *
 * @author Administrator
 * @create 2019/6/4 0004
 * @since 1.0.0
 */
public class Main {
    Object object=new Object();
    public synchronized void print(String str) {
        notify();
        System.out.println(str);
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class A implements Runnable {

        @Override
        public void run() {
            synchronized(object){
                while (true) {
                    object.notify();
                    System.out.println("A" + 1);
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    class B implements Runnable {

        @Override
        public void run() {
            synchronized (object) {
                object.notify();
                System.out.println("b" + 1);
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

//    public static void main(String[] args) {
//        Main p = new Main();
//        A a = p.new A();
//        B b = p.new B();
//        new Thread(a).start();
//        new Thread(b).start();
//
//    }
    private static boolean isFirst = true;

    static class First implements Runnable {
        private Object lock;

        public First(Object lock) {
            this.lock = lock;
        }
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (isFirst) {
                        System.out.println("1");
                        isFirst = false;
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class Second implements Runnable {
        Object lock;

        public Second(Object lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                        if (!isFirst){
                            System.out.println("2");
                            isFirst = true;
                            lock.notify();
                        }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        new Thread(new First(lock)).start();
        new Thread(new Second(lock)).start();
    }

}