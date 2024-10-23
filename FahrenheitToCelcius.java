class FahrenheitToCelcius
{
	public static void main (String args[])
	{ 
		float Fahrenheit = Float.parseFloat(args[0]);
		float Celsius = ((Fahrenheit-32)*5)/9;
		System.out.println("Temperature in celsius is: "+Celsius);
	}
}