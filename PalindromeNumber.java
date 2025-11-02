
public class PalindromeNumber{

	public static void main(String args[]){

		int num=121;
		int originalNum=num;
		int reverse=0;

		while(num>0){

			int digit=num%10;
			reverse=(reverse*10)+digit;
			num=num/10;
		}
		if(originalNum==reverse){

			System.out.println("Palindrome Number");


		}else{
						System.out.println("Not Palindrome Number");


		}

	}

}