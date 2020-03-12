package clase;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		Utils util = new Utils();
		StudentReader stud1 = new StudentReader("studenti.txt");
		AngajatReader ang1 = new AngajatReader("angajati.txt");
		StudentReader stud2 = new StudentReader("studenti.txt");
		List<AplicantReader> readers = new ArrayList<AplicantReader>();
		readers.add(stud1);
		readers.add(ang1);
		readers.add(stud2);
		util.readAndPrint(readers);
	}

}
