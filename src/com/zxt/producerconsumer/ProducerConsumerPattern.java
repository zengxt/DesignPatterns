package com.zxt.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 
 * @Description: 阻塞队列实现生产者消费者模式
 *
 * @author： zxt
 *
 * @time: 2018年8月17日 上午9:08:49
 *
 */
public class ProducerConsumerPattern {

	public static void main(String[] args) {
		BlockingQueue<String> sharedQueue = new ArrayBlockingQueue<String>(2);
		// ArrayBlockingQueue：需要设置队列大小，LinkedBlockingQueue不设置的话默认大小为Integer.MAX_VALUE
		// BlockingQueue<String> sharedQueue2 = new LinkedBlockingQueue<String>(2);
		
		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		
		for(int i = 0; i < 5; i++) {
			new Thread(producer, "Producer" + (i + 1)).start();
			new Thread(consumer, "Consumer" + (i + 1)).start();
		}
	}

}

// 生产者
class Producer implements Runnable {
	private BlockingQueue<String> sharedQueue;
	
	public Producer(BlockingQueue<String> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		try {
			String prod = "" + Thread.currentThread().getName();
			// 如果队列是满的话，会阻塞当前线程
			sharedQueue.put(prod);
			System.out.println("我是生产线程，生产了一个产品：" + Thread.currentThread().getName());
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

// 消费者
class Consumer implements Runnable {
	private BlockingQueue<String> sharedQueue;
	
	public Consumer(BlockingQueue<String> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		try {
			// 如果队列为空，会阻塞当前线程
			String prod = sharedQueue.take();
			System.out.println("我是消费者，消费产品: " + prod);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}