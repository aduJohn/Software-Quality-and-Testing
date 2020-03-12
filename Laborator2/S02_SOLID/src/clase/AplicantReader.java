package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader{
	protected String fileName;
	
	public AplicantReader(String fileName) {
		this.fileName = fileName;
	}

	abstract List<Aplicant> readAplicants() throws FileNotFoundException;
}
