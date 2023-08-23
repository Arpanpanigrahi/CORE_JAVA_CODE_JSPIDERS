package com.jsp.code;
 class T11 extends Thread
 {
	 public void run()
	 {
		 for(int i=1; i<=10; i++)
		 {
			 if(i==5)
				 System.out.println(10/0);
			 try {
				 Thread.sleep(500);
			 }catch(InterruptedException e)
			 {
				 e.printStackTrace();
			 }
		 }
	 }
 }
 
public class M2 {
	public static void main(String[] args) throws InterruptedException
		{
			T11 t1 = new T11();
			t1.start();
			for(int i=65; i<=75; i++)
			{
				System.out.println((char) i +" main Thread");
		}
	}
}
