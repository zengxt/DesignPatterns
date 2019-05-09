package com.zxt.producerconsumer;

import java.util.PriorityQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @Description: Condition实现生产者消费者模式
 *
 * @author： zxt
 *
 * @time: 2018年8月17日 上午9:08:49
 *
 */
public class ProducerConsumerPattern2 {
	private PriorityQueue<String> queue = new PriorityQueue<String>(3);
	private Lock lock = new ReentrantLock();
	private Condition notFull = lock.newCondition();
	private Condition notEmpty = lock.newCondition();
	
	public static void main(String[] args) {
		ProducerConsumerPattern2 test = new ProducerConsumerPattern2();
		Producer producer = test.new Producer();
		Consumer consumer = test.new Consumer();
		
		for(int i = 0; i < 5; i++) {
			new Thread(producer, "Producer" + (i + 1)).start();
			new Thread(consumer, "Consumer" + (i + 1)).start();
		}
	}
	
	class Producer implements Runnable {
		@Override
		public void run() {
			lock.lock();
			try {
				while(queue.size() == 3) {
					try {
						notFull.await();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				// 每次插入一个元素
				String prod = "" + Thread.currentThread().getName();
				queue.offer(prod);
				System.out.println("我是生产线程，生产了一个产品：" + prod);
				// 通知队列不空
				notEmpty.signal();
				
			} finally {
				lock.unlock();
			}
		}
	}

	class Consumer implements Runnable {
		@Override
		public void run() {
			lock.lock();
			try {
				while(queue.size() == 0) {
					try {
						notEmpty.await();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				String prod = queue.poll();
				System.out.println("我是消费者，消费产品: " + prod);
				// 通知队列未满
				notFull.signal();
				
			} finally {
				lock.unlock();
			}
		}
	}
}

