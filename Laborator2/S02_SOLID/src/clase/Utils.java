package clase;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

	public static void readAndPrint(List<AplicantReader> aplicantReaders) {

		try {
			for(AplicantReader reader: aplicantReaders) {
				List<Aplicant> aplicants = reader.readAplicants();
				for(Aplicant aplicant: aplicants) {
					System.out.println(aplicant.toString());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
