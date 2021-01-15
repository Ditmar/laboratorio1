import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String princesdataString = input.nextLine();
		String percentdataString = input.nextLine();
		Double[] princesdata = new Double[princesdataString.split(",").length];
	    Double[] percentdata = new Double[princesdataString.split(",").length];
	    String[] pricess = princesdataString.split(",");
	    String[] percents = percentdataString.split(",");
	    String[] descriptiondata = new String[princesdata.length];
	    
	    for (int i = 0; i < princesdata.length; i++) {
			princesdata[i] = Double.parseDouble(pricess[i]);
			percentdata[i] = Double.parseDouble(percents[i]);
			descriptiondata[i] = input.nextLine();
		}
		Double x = 0.0;
		Double total = 0.0;
		for (int i = 0; i < princesdata.length; i++) {
			if (descriptiondata[i].contains("alto")) {
				x = princesdata[i] / (1 + percentdata[i] / 100);
			}
			if (descriptiondata[i].contains("bajas")) {
				x = -princesdata[i] / (1 - percentdata[i] / 100);
			}
			if (descriptiondata[i].contains("igual")) {
				x = 0.0;
			}
			total += x * (percentdata[i] / 100);
			//results.add(x);
		}
		System.out.println(total);
	}

}
