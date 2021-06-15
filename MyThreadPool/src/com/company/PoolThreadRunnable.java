package com.company;
import java.util.concurrent.BlockingQueue;

public class PoolThreadRunnable implements Runnable {

    private BlockingQueue taskQueue = null;
    private boolean isStopped = false;
    private Thread thread = null;

    public PoolThreadRunnable(BlockingQueue queue){
        taskQueue = queue;
    }

    public void run(){
        this.thread = Thread.currentThread();
        while(!isStopped()){
            try{
                Runnable runnable = (Runnable) taskQueue.take();
                runnable.run();
            } catch(Exception e){
            }
        }
    }

    public synchronized void executeShutdown(){
        isStopped = true;
        this.thread.interrupt();
    }

    public synchronized boolean isStopped(){
        return isStopped;
    }
}