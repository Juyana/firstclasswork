package classwork1;

public class Operation extends inherit{
	double add(double x,double y)
	{
		return x+y;
	}
	double sub(double x,double y)
	{
		return x-y;
	}
	double mul(double x,double y)
	{
		return x*y;
	}
	double div(double x,double y)
	{
		return x/y;
	}
	double pow(double x,double y)
	{
		double ans =x;
		for(int i=2;i<=y;i++)
			ans*=x;
		return ans;
	}
	double mod(double x,double y)
	{
		return x%y;
	}
	
}
