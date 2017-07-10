package com.happy.thread;

/**
 * 如果对n的操作是原子级别的，最后输出的结果应该为n=1000，而在执行上面积代码时，很多时侯输出的n都小于1000，
 * 这说明n=n+1不是原子级别的操作。原因是声明为volatile的简单变量如果当前值由该变量以前的值相关，
 * 那么volatile关键字不起作用，也就是说如下的表达式都不是原子操作：
 * n  =  n  +   1 ;
 * n ++ ;
 * <p>
 * Created by 刘亚飞 on 2017/6/23.
 */
public class JoinThread extends Thread {
    public static volatile int n = 0;
    public static int u = 0;

    /*synchronized*/
    //此处必须加static才能保证原子性，否则不对
    public static synchronized void unc() {
        u ++;
    }

/*volatale*/
//    public void run() {
//        for (int i = 0; i < 10; i++)
//            try {
//                n = n + 1;
//                sleep(3);
//            } catch (Exception e) {
//
//            }
//    }

    public void run() {
        for (int i = 0; i < 10; i++)
            try {
                unc();
                sleep(3);
            } catch (Exception e) {

            }
    }


    public static void main(String[] args) throws Exception {
        Thread threads[] = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new JoinThread();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        //System.out.println(" n= " + JoinThread.n);
        System.out.println(" u= " + JoinThread.u);

    }
}
