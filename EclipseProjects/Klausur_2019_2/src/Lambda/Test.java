package Lambda;

public class Test {
	
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,6,7,7,2,3};
		Data d = new Data(arr);
		
		
		int result = d.act();
		System.out.println(result);
	}
	

}
