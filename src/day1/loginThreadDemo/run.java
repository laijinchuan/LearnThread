package day1.loginThreadDemo;
/**
 * 
 * @author 赖金川
 * @data 2019年2月16日
 * Description 用登录来测试线程不安全的场景和加上synchronized锁之后的场景
 */
public class run {
	public static void main(String[] args) {
		loginA loginA = new loginA();
		loginB loginB = new loginB();
		loginA.start();
		loginB.start();
	}
}
