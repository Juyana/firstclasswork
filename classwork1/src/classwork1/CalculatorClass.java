package classwork1;

import java.util.Scanner;

public class CalculatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Operation op = new Operation();
		double answer=0;
		double input1,input2;
		char operator;
		boolean flag=false;
		
		while(flag==false)
		{
		 System.out.print("Enter the Inputs: ");
		 input1= input.nextDouble();
		 operator= input.next().charAt(0);
		 input2= input.nextDouble();
		 
		 switch(operator)
		 {
		 case '+' : answer=op.add(input1,input2);
		 			break;
		 case '-' : answer=op.sub(input1,input2);
		 			break;
		 case '*' : answer=op.mul(input1,input2);
		 			break;
		 case '/' : answer=op.div(input1,input2);
		 			break;
		 case '^' : answer=op.pow(input1,input2);
		 			break;
		 case '%' : answer=op.mod(input1,input2);
		 			break;
		 
		 }
		 System.out.println(answer);
		}
		
			input.close();
	}

}
