package com.wdx.spider;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: myworklab
 * @description: 线程池测试
 * @author: wdx
 * @create: 2020-06-30 16:28
 **/
public class TestThread implements Runnable{
    public static void main(String args[]){
        TestThread t=new TestThread();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(t);
        System.out.println(Thread.currentThread().getName());

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
