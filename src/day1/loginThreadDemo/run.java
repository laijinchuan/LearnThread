package day1.loginThreadDemo;
/**
 * 
 * @author ����
 * @data 2019��2��16��
 * Description �õ�¼�������̲߳���ȫ�ĳ����ͼ���synchronized��֮��ĳ���
 */
public class run {
	public static void main(String[] args) {
		loginA loginA = new loginA();
		loginB loginB = new loginB();
		loginA.start();
		loginB.start();
	}
}
