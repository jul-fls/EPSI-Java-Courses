package org.gitscm.hooks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exo1_Hook2 {

	public static void main(String[] args) throws IOException {
		String data = new String(Files.readAllBytes(Paths.get(args[0])));
	    if(data.startsWith("Bonjour")) {
	    	System.out.println("Le message de commit commence bien par 'Bonjour' !");
	    	System.exit(0);
	    }else {
	    	System.out.println("Le message de commit ne commence pas par 'Bonjour' !");
	    	System.exit(1);
	    }
	}

}
