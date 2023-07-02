/*The variables which are declared inside the class and outside the method without using static keyword those variables are called as non-static variables
*/

class F1
{
	int a=10; //non-static var.
	public static void main(String[] args)
	{
		F1 f1; //local var.
		f1=new F1();
		System.out.println(f1.a);
	}
}