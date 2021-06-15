package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner (System.in);
        int n=scn.nextInt();

        ThreadPool threadPool = new ThreadPool(n);

        for(int i=1; i<=20; i++) {
            int taskNo = i;
            threadPool.execute( () -> System.out.println("Print -> " + taskNo ));
        }
        threadPool.waitUntilAllTasksFinished();
        threadPool.Shutdown();
    }
}