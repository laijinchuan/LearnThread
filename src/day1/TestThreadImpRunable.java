package day1;
/**
 * 
 * @author 赖金川
 * @data 2019年2月16日
 * Description 测试实现Runnable接口的线程使用
 */
public class TestThreadImpRunable implements Runnable {

	@Override
	public void run() {
		System.out.println("线程运行中");
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		Runnable runable = new TestThreadImpRunable();
		Thread thread = new Thread(runable,"MyThread1");
		thread.start();
		System.out.println("运行结束");
	}
	

}
 