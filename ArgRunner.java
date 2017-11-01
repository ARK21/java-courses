/**
Класс для запуска программы, принимает данные из входных параметров
*/
public class ArgRunner{

	public static void main(String [] arg){
		 Calculator calc = new Calculator();
		 switch (arg[0]){
		 	case "add": calc.add(Integer.valueOf(arg[1]), Integer.valueOf(arg[2]));
		 	break;
		 	case "sub": calc.subtract(Integer.valueOf(arg[1]), Integer.valueOf(arg[2]));
		 	break;
		 	case "div": calc.div(Integer.valueOf(arg[1]), Integer.valueOf(arg[2]));
		 	break;
		 	case "mult": calc.mult(Integer.valueOf(arg[1]), Integer.valueOf(arg[2]));
		 	break;
		 }
		 System.out.println(arg[0] + "= " + calc.getResult());
		 calc.cleanResult();
	}
}