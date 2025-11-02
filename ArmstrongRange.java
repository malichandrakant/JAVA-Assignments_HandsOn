

public class ArmstrongRange{
	public static void main(String args[]){

		int start=1,end=1000;

		System.out.println("Armstrong numbers from"+start+" to "+end);

		for(int num=start;num<=end;num++){

			int originalNum=num;

			int sum=0;

			while(originalNum>0){

				int digit=originalNum%10;

				sum=sum+(digit*digit*digit);

				originalNum=originalNum/10;

			}
			if(sum==num){
			System.out.println(num);
		}


		}


	}
}