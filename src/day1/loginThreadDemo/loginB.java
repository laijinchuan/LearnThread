package day1.loginThreadDemo;

public class loginB  extends Thread{
	@Override
	public void run() {
		loginServlet.dopost("b","bb");
	}
	
}
