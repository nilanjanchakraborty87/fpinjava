package com.fpinjava.functionalparallelism.exercise08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Deadlock {

  public static void main(String[] args) {
    Par<Integer> a = Par.lazyUnit(() -> 42 + 1);
    ExecutorService es = Executors.newFixedThreadPool(1);
    System.out.println(Par.equal(es, a, Par.fork(() -> a)));
    es.shutdown();
  }

}
