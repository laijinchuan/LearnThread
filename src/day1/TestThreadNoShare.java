package day1;
/**
 * 
 * @author ����
 * @data 2019��2��16��
 * Description �����̱߳�������������
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
			System.out.println("��"+this.currentThread().getName()+"���ֵ�ǣ�"+count);
			
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
