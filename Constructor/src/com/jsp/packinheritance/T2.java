//Multilevel Inheritance
package com.jsp.packinheritance;
class Phone
{
	void call()
	{
		System.out.println("call executed");
	}
}
class CameraPhone extends Phone
{
	void takePic()
	{
		System.out.println("Picture clicked");
	}
}
class SmartPhone extends CameraPhone
{
	void apps()
	{
		System.out.println("Apps Installed");
	}
}
public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.takePic();
		sp.apps();
	}
}
