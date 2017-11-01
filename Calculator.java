 /**
   Класс реазирует калькулятор
*/
 public class Calculator{
 	/**
		Результат вычисления
 	*/
 	private int result;

 	/**
 	Суммирует аргументы
 	@param params Аргументы суммирования
 	*/
 	public void add(int ... params){
 		for (Integer param : params){
 			this.result += param;
 		}
 	}
/**
	Метод используется для вычитания
	@param params Аргументы вычитания
*/
 	public void subtract(int ... params){
 		for (int a = 0; a < params.length; a++){
 	 		if (a == 0 && this.result == 0){
 			this.result = params[a];
 			} else this.result -= params[a];
 		}
 	}
 	/**
	Метод используется для деления
	@param params Аргументы деления
 	*/

 	public void div(int ... params){
 		for (int a = 0; a < params.length; a++){
 			if (a == 0 && this.result == 0){
 				this.result =  params[a];
 			} else this.result /=  params[a];
 		}
 	}
 	/**
	Метод используется для умножения
	@param params Аргументы умножения
 	*/

 	public void mult(int ... params){
 		for (int a = 0; a < params.length; a++){
 			if (a == 0 && this.result == 0){
 				this.result =  params[a];
 			} else this.result *=  params[a];
 		}
 	}

 	/**
	Возвращает результат суммирования
 	*/

 	public int getResult() {
 		return this.result;
 	}

 	/**
	Очищает результат
 	*/
 	public void cleanResult(){
 		this.result = 0;
 	}
 }