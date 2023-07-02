class Car
{
	int cc = 1000;
	String fuelType = "Diesel";
}

class Bike
{
	int cc = 150;
	String fuelType = "Petrol";
}

class Mechanic
{
	public void service(Car c)
	{
		System.out.println("Car is a diesel type, service done");
	}
	
	public void service(Bike b)
	{
		System.out.println("Bike is a petrol type, service done");
	}
}

class Test
{
	public static void main(String[] args)
	{
		Bike bike = new Bike();
		Car c = new Car();
		Mechanic m = new Mechanic();
		m.service(bike);
		m.service(c);
		//m.service(new Bike());
		//m.service(new Car());
	}
}