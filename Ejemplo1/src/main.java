import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Double year = input.nextDouble();
		Double century = Math.ceil((year / 100)) ;
		Integer ouput = century.intValue();
		System.out.print(ouput);
	}

}
