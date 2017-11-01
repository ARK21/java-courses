import java.util.Scanner;
/**
Класс для пользовательского ввода данных
*/

public class InteractRunner {

	public static void main(String [] arg){
		Scanner reader = new Scanner (System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")){
				System.out.println("Enter operation (add/sub/div/mult)");
				String operation = reader.next();
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				switch (operation) {
					case "add": calc.add(Integer.valueOf(first), Integer.valueOf(second));
		 			break; 
		 			case "sub": calc.subtract(Integer.valueOf(first), Integer.valueOf(second));
		 			break;
		 			case "div": calc.div(Integer.valueOf(first), Integer.valueOf(second));
		 			break;
		 			case "mult": calc.mult(Integer.valueOf(first), Integer.valueOf(second));
		 			break;
				}
				System.out.println("Result: " + calc.getResult());
				System.out.println("Use result ? (yes/no)");
				String useResult = reader.next();
				switch (useResult){
					case "yes": ;
					break;
					case "no": calc.cleanResult();	
					break;
				}
				System.out.println("Exit: yes/no");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}