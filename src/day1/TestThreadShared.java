package day1;
/**
 * 
 * @author ����
 * @data 2019��2��16��
 * Description �����̱߳�����������
 */
public class TestThreadShared extends Thread{
	private int count=5;
	
	@Override
	synchronized public void run() {
		super.run();
		count--;
			System.out.println("��"+this.currentThread().getName()+"���ֵ�ǣ�"+count);
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
	 * 	��C���ֵ�ǣ�2
		��E���ֵ�ǣ�0
		��D���ֵ�ǣ�1
		��B���ֵ�ǣ�2
		��A���ֵ�ǣ�2
		�������н�����Կ�����Ȼ���������� �����ǳ������̲߳���ȫ����Ϊ
		count--�Ĺ���JVmִ�еĲ���������
		1):ȡ��ԭcount��ֵ
		2��������count-1��ֵ
		3������count���и�ֵ
		�������������� ����ж���߳�ͬʱ���ʣ��ͻ�����̰߳�ȫ������
	 */
	//������������ڿ��ܲ����̰߳�ȫ�ĵط����Ϲؼ��֣�syhchronized Ҳ���Ǽ�����
	/**
	 * ��A���ֵ�ǣ�4
��E���ֵ�ǣ�3
��C���ֵ�ǣ�2
��D���ֵ�ǣ�1
��B���ֵ�ǣ�0
i 
	 */
}
