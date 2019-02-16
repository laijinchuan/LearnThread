package day1;
/**
 * 
 * @author 赖金川
 * @data 2019年2月16日
 * Description 测试线程变量共享的情况
 */
public class TestThreadShared extends Thread{
	private int count=5;
	
	@Override
	synchronized public void run() {
		super.run();
		count--;
			System.out.println("由"+this.currentThread().getName()+"求的值是："+count);
	}
	public static void main(String[] args) {
		TestThreadShared testThreadShared = new TestThreadShared();
		Thread thread = new Thread(testThreadShared,"A");
		Thread thread1 = new Thread(testThreadShared,"B");
		Thread thread2 = new Thread(testThreadShared,"C");
		Thread thread3 = new Thread(testThreadShared,"D");
		Thread thread4 = new Thread(testThreadShared,"E");
		thread.start();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}
	/**
	 * 	由C求的值是：2
		由E求的值是：0
		由D求的值是：1
		由B求的值是：2
		由A求的值是：2
		根据运行结果可以看出虽然变量共享了 ，但是出现了线程不安全，因为
		count--的过程JVm执行的步骤有三步
		1):取得原count的值
		2）：计算count-1的值
		3）：对count进行赋值
		在这三个步骤中 如果有多个线程同时访问，就会出现线程安全的问题
	 */
	//解决方法就是在可能产生线程安全的地方加上关键字：syhchronized 也就是加上锁
	/**
	 * 由A求的值是：4
由E求的值是：3
由C求的值是：2
由D求的值是：1
由B求的值是：0
i 
	 */
}
