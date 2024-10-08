package array;

public class SimpleArray {

	public static void main(String[] args) {
		String[] car = { "Volvo", "BMW", "Ford", "Hyundai", "KIA","Mahindra" };
		int[] price = { 5, 10, 15, 20, 25 };
		car[0]= "Maruti";

		System.out.println(car[0]);
		System.out.println(price[0]);
		System.out.println("Array Length of car"+car.length);
		System.out.println("Array Length of price"+price.length);
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
			
		}
		
		for (int i : price) {
			System.out.println(i);
		}

	
	//Multidimensional Array
	
	int[][]multi= {{1,2,3,},{4,5,6}};
	System.out.println(multi[1][2]);
	}
}
