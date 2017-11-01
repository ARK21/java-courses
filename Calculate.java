public class Calculate {

	public static void main (String[] args){
		System.out.println("Calculate...");
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
		double sum = first + second;
		double subtraction = first - second;
		double div = first / second;
		double mult = first * second;
		double pow = Math.pow(first, second);
		System.out.println("Sum = " + sum);
		System.out.println("Subtraction = " + subtraction);
		System.out.println("Div = " + div);
		System.out.println("Mult = " + mult);
		System.out.println("Pow = " + pow);


	}
}