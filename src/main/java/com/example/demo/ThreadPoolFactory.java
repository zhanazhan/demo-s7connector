package com.example.demo;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Factory for creating {@link Executor} that will be used in the Scenario
 * Engine.
 *
 * @author Zhandos Ospanov
 */
public class ThreadPoolFactory {

    public static final int DEFAULT_NUMBER_OF_THREADS = ForkJoinPool.getCommonPoolParallelism();

    private static final String DEFAULT_THREAD_NAME_PREFIX = "pool_t";

    protected final AtomicInteger threadCounter = new AtomicInteger(0);

    protected final int threadPoolSize;

    protected final String threadNamePrefix;

    public ThreadPoolFactory() {
        this(DEFAULT_NUMBER_OF_THREADS, DEFAULT_THREAD_NAME_PREFIX);
    }

    public ThreadPoolFactory(int threadPoolSize, String threadNamePrefix) {
        Objects.requireNonNull(threadNamePrefix);
        this.threadPoolSize = (threadPoolSize <= 0) ? DEFAULT_NUMBER_OF_THREADS : threadPoolSize;
        this.threadNamePrefix = threadNamePrefix.trim();
    }

    public ExecutorService createExecutor() {
        final ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        return Executors.newFixedThreadPool(threadPoolSize, (Runnable r) -> {
            Thread t = new Thread(threadGroup, r);
            t.setName(threadNamePrefix + threadCounter.getAndIncrement());
            t.setPriority(Thread.MAX_PRIORITY);
            t.setDaemon(true);
            return t;
        });
    }
}
