class Temperature  
{  
   public static void main (String args[])  
    {    
          float Celsius= Float.parseFloat(args[0]);  
          float Fahrenheit =((Celsius*9)/5)+32;  
          System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
    }
}  