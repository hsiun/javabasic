package com.gaospot.multithread;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/1/10 4:30 PM
 * @description: 测试ReadWriteLock实现多线程对Hashmap的安全读写
 */

public class ReadWriteLockTest {
    public static void main(String[] args) {
        final Cache cache = new Cache();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    cache.set("key", new String(Thread.currentThread().getName() + " joke"));
                }
            }, "threadW-" + i).start();
            
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Cache.get(\"key\") = " + cache.get("key"));
                }
            }, "threadR-" + i).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    cache.clear();
                }
            }, "ThreadC-" + i).start();
        }
    }
}

class Cache {
    Map<String, Object> map = new HashMap<>();
    ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    Lock r = rwl.readLock();
    Lock w = rwl.writeLock();
    
    
    public Object get(String key) {
        r.lock();
        try {
            System.out.println("get " + Thread.currentThread().getName());
            return map.get(key);
        } finally {
            r.unlock();
        }
    }
    
    public Object set(String key, Object value) {
        w.lock();
        try {
            System.out.println("set " + Thread.currentThread().getName());
            return map.put(key, value);
        } finally {
            w.unlock();
        }
    }
    
    public void clear() {
        w.lock();
        try {
            System.out.println("clear " + Thread.currentThread().getName());
            map.clear();
        } finally {
            w.unlock();
        }
    }
}
