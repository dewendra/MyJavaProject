package codepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareOfEvenNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 3, 6, 8); //output: Reslut list:[1, 16, 3, 36, 64]
		List<Integer> resultList = new ArrayList<Integer>();
		for (int num : list) {
			if (num % 2 == 0) {
				resultList.add(num * num);
			} else {
				resultList.add(num);
			}
		}
		System.out.println("Reslut list:" + resultList);

	}

}
