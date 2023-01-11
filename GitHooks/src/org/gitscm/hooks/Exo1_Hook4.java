package org.gitscm.hooks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exo1_Hook4 {

	public static void main(String[] args) throws IOException {
	    String data = new String(Files.readAllBytes(Paths.get(args[0])));
	    if (data.matches("[A-Z]{3}-[0-9]{4}")) {
	        System.out.println("Le message de commit commence bien avec le pattern XXX-0000");
	        System.exit(0);
	    } else {
	        System.out.println("Le message de commit ne commence pas avec le pattern XXX-0000");
	        System.exit(1);
	    }
	}

}
