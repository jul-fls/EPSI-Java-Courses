package org.gitscm.hooks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exo2_Hook2 {

	public static void main(String[] args) throws IOException {
		String data = new String(Files.readAllBytes(Paths.get(args[0])));
	    if (data.contains("flusin")) {
	        System.out.println("La destination de commit contiens bien le nom 'flusin'");
	        System.exit(0);
	    } else {
	        System.out.println("La destination de commit ne contiens pas le nom 'flusin'");
	        System.exit(1);
	    }
	}

}
