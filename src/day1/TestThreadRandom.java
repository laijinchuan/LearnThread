package day1;
/**
 * 
 * @author ����
 * @data 2019��2��16��
 * Description �����̵߳������
 */
public class TestThreadRandom  extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				int a=(int ) (Math.random()*1000);
				try {
					Thread.sleep(a);
					System.out.println("Run Thread is :" +Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		public static void main(String[] args) {
			TestThreadRandom testThreadRandom = new TestThreadRandom();
			testThreadRandom.setName("myThread");
			testThreadRandom.start();
			for (int i = 0; i < 10; i++) {
				int b=(int)(Math.random()*1000);
				try {
					Thread.sleep(b);
					System.out.println("main Thread is :" +Thread.currentThread().getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	
}
		}
}
