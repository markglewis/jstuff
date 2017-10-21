//mark lewis
//calculates interest
public class Callculate_Investment{
	public static void main(String[] args){
		double iAmount = Double.parseDouble(args[0]);
		double interest = Double.parseDouble(args[1]) * .01;
		int year =0;

		double cAmount = iAmount;

		while(cAmount <= 2 * iAmount){
			cAmount = cAmount + (cAmount*interest);
			year += 1;
		}
		System.out.println(year);

	}
}