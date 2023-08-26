package testcases;

public class testcase1 
{
 public static void main(String[] args)
 {
	int number1=5;
	int number2=6;
	int sum = addNum(number1,number2);
	System.out.println(sum);
 }
 
 public static int addNum(int num1, int num2)
 {
	 int sum1 = num1+num2;
	 return sum1;
 }
}
