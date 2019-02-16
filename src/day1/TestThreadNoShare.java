package day1;
/**
 * 
 * @author 赖金川
 * @data 2019年2月16日
 * Description 测试线程变量不共享的情况
 */
public class TestThreadNoShare extends Thread{
	private int count=5;
	public TestThreadNoShare(String name) {
		super();
		this.setName(name);
		
	}
	@Override
	public void run() {
		super.run();
		while(count>0) {
			count--;
			System.out.println("由"+this.currentThread().getName()+"求的值是："+count);
			
		}
	}
	public static void main(String[] args) {
		TestThreadNoShare testThreadNoShare1 = new TestThreadNoShare("A");
		TestThreadNoShare testThreadNoShare2 = new TestThreadNoShare("B");
		TestThreadNoShare testThreadNoShare3= new TestThreadNoShare("C");
		testThreadNoShare1.start();
		testThreadNoShare2.start();
        testThreadNoShare3.start();	
		
	}
	
}
