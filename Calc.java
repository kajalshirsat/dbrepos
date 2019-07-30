
public class Calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calculator..............!!!!!!!!! :)");
		System.out.println("add : "+add(2,3));
		System.out.println("subtract : "+subtract(2,3));
		System.out.println("multiply : "+multiply(2,3));
		System.out.println("divide : "+divide(2,3));

	}
	
	static float add(float a, float b){
		return a+b;
	}
	static float subtract(float a, float b){
		return a-b;
	}
	static float multiply(float a, float b){
		return a*b;
	}
	static float divide(float a, float b){
		return a/b;
	}

}
