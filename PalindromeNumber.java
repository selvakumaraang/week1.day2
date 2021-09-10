package week1.day2;

public class PalindromeNumber {
	public static void isPalindromeNumber(int num){
		System.out.println("given number is"+num);
		int r=0;
		int sum=0;
		int t;
		t=num;
		while(num>0){
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			}
		if(t==sum){
			System.out.println("palindromeNumber");
		}else{
			System.out.println("is not a PalindromeNumber");
		}
	}

	public static void main(String[] args) {
		isPalindromeNumber(151);
		isPalindromeNumber(78987);
		// TODO Auto-generated method stub

	}

}
