import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		String cadena = in.nextLine();
		
		String[] cad = cadena.split("mundo");
		System.out.println(cad[2]);
		
	}

}
