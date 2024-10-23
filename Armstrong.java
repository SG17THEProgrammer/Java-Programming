class Armstrong
{
	public static void main (String [] args)
	{
	System.out.println("Enter the number:");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextDouble();
	order = len(str(num))
sum = 0

temp = num
while temp > 0:
   digit = temp % 10
   sum += digit ** order
   temp //= 10

if num == sum:
   print(num,"is an Armstrong number")
else:
   print(num,"is not an Armstrong number")
