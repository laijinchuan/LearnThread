package day1;
/**
 * 
 * @author ����
 * @data 2019��2��16��
 * Description ����ʵ��Runnable�ӿڵ��߳�ʹ��
 */
public class TestThreadImpRunable implements Runnable {

	@Override
	public void run() {
		System.out.println("�߳�������");
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		Runnable runable = new TestThreadImpRunable();
		Thread thread = new Thread(runable,"MyThread1");
		thread.start();
		System.out.println("���н���");
	}
	

}
 