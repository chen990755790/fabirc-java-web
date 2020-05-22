package com.blockchain.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountdownLatchTest2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        final CountDownLatch cdOrder = new CountDownLatch(1);
        final CountDownLatch cdAnswer = new CountDownLatch(4);
        for (int i = 0; i < 4; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("ѡ��" + Thread.currentThread().getName() + "���ڵȴ����з�������");
                        cdOrder.await();
                        System.out.println("ѡ��" + Thread.currentThread().getName() + "�ѽ��ܲ��п���");
                        Thread.sleep((long) (Math.random() * 10000));
                        System.out.println("ѡ��" + Thread.currentThread().getName() + "�����յ�");

                        
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            service.execute(runnable);
        }
        try {
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println("����"+Thread.currentThread().getName()+"������������");
            cdOrder.countDown();
            System.out.println("����"+Thread.currentThread().getName()+"�ѷ��Ϳ�����ڵȴ�����ѡ�ֵ����յ�");
            cdAnswer.await();
            System.out.println("����ѡ�ֶ������յ�");
            System.out.println("����"+Thread.currentThread().getName()+"���ܳɼ�����");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}
