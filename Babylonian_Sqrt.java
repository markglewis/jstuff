//mark lewis
//babylonian  method of calculating sqrt
public class Babylonian_Sqrt{
	public static void main(String[] args){
		double a = Double.parseDouble(args[0]);
		
		double g = a/2;
		while(g*g !=a){
			g = (g + a/g)/2;
		}

		System.out.println(g);

	}
}