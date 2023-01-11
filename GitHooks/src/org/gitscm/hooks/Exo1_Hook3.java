package org.gitscm.hooks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exo1_Hook3 {

	public static void main(String[] args) throws IOException {
		String data = new String(Files.readAllBytes(Paths.get(args[0])));
	    int length = data.length();
	    if(length%2==0) {
	    	System.out.println("Le message de commit a une longueur paire !");
	    	System.exit(0);
	    }else {
	    	System.out.println("Le message de commit a une longueur impaire !");
	    	System.exit(1);
	    }
	}

}
