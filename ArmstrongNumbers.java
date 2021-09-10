package week1.day2;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		int num=153;
		System.out.println("the given no is"+num);
		int cube=0;
		int r;
		int t;
		t=num;
		while(num>0){
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube){
			System.out.println("this is an armstrongno");
		}
		else{
			System.out.println("this is not an arnstrongno");
		}
		}
		// TODO Auto-generated method stub

	}


