import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String inputdata = input.next();
		String[] cadena = inputdata.split(",");
		Integer[] numbers = new Integer[cadena.length];
		//convert string to int;
		for (int i = 0; i < cadena.length; i++) {
			numbers[i] = Integer.parseInt(cadena[i]);
		}
		//sort
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == numbers[i + 1]) {
				System.out.println(numbers[i]);
				return;
			}
		}
		System.out.println(0);
	}

}
