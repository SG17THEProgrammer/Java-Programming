//*
//**
//***
//****
//*****
//****
//***
//**
//*

class p12
{
public static void main(String[] args)
{
	int rows=5;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
}
}