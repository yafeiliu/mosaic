package com.enjoy.demo;

/**
 * Created by 刘亚飞 on 2017/7/4.
 */
public class TestMq {
    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.init();
        TestMq mainT1 = new TestMq();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Thread1
        new Thread(mainT1.new ProductorMq(producer)).start();
        //Thread2
        new Thread(mainT1.new ProductorMq(producer)).start();
        //Thread3
        new Thread(mainT1.new ProductorMq(producer)).start();
        //Thread4
        new Thread(mainT1.new ProductorMq(producer)).start();
        //Thread5
        new Thread(mainT1.new ProductorMq(producer)).start();
        //Thread6
        new Thread(mainT1.new ProductorMq(producer)).start();

    }

    private class ProductorMq implements Runnable {
        Producer producter;

        public ProductorMq(Producer producter) {
            this.producter = producter;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    producter.sendMessage("Jaycekon-MQ");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
