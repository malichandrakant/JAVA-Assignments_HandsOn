

public class ArmstrongNum{

	public static void main(String args[]){

		int num=153;

		int originalNum=num;
		int sum=0;

		while(num>0){

			int digit=num%10;

			sum=sum+(digit*digit*digit);

			num=num/10;

		}

		if(sum==originalNum){


			System.out.println("Armstrong number");

		}else{
				System.out.println("Armstrong number");
		}


	}

}