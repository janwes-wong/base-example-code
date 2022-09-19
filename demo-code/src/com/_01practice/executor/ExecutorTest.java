package com._01practice.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
    }
}
