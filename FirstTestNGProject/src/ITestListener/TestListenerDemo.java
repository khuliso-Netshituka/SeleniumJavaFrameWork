package ITestListener;

import org.testng.annotations.Listeners;		
import org.testng.annotations.Test; 




public class TestListenerDemo {
	
	@Test
	public void test1() 
	{
		System.out.println("I'm inside test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("I'm inside test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("I'm inside test 3");
	}

}
