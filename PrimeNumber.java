
public class PrimeNumber{

	public static void main(String args[]){

		int num=13,i;

		boolean isPrime=true;

		if(num<2){

			isPrime=false;

		}else{

			for(i=2;i<num;i++){

				if(num%2==0){

					isPrime=false;
					break;
				}

			}

		}

		String result=isPrime? "Prime Number":"Not Prime Number";

		System.out.println(result);

	}
}