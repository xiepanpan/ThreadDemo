package com.xiepanpan.thread.safe;

/**
 * @author: xiepanpan
 * @Date: 2020/8/3
 * @Description: 销售窗口 同步代码块
 */
public class SaleWindow1 implements Runnable{

    private int id = 10;

    /**
     * 卖10张火车票
     */
    public void run() {

        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                if (id>0) {
                    System.out.println(Thread.currentThread().getName()+"卖了编号为"+id+"的火车票");

                    id--;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}
