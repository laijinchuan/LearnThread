package day1.loginThreadDemo;

public class loginA  extends Thread{
	@Override
	public void run() {
		loginServlet.dopost("a","aa");
	}
	
}
