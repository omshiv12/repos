import java.util.*
public class calc{
  public static void main(String args[]){
  	int num1;
  	int num2;
  	 Scanner input=new Scanner(System.in);
  	 System.out.println("enter the first number");
  	 num1=input.nextInt();
  	 System.out.println("enter the second number");
  	 num2=input.nextInt();
  	 
  	 int a=num1+num2;
  	 System.out.println("addtion of number is"+ a);
  	 int b=num1-num2;
  	 System.out.println("subtraction of numbers is"+ b);
     int c=num1*num2;
  	 System.out.println("multiplication of number is"+ c);
  	 int d=num1/num2;
  	 System.out.println("division of numbers is"+ d);
  }
}
