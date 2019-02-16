package day1.loginThreadDemo;

public class loginServlet {
		private static String usernameRef;
		private static String passwordRef;
		synchronized public static void dopost(String username,String password) {
				usernameRef=username;
				if(username.equals("a")) {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				passwordRef=password;
				System.out.println("username:"+usernameRef+"£¬password£º"+passwordRef);
		
	}
}
