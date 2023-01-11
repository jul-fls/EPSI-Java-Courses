package org.gitscm.hooks;

public class Debug_Hook {

	public static void main(String[] args) {
		for(String arg : args) {
			System.out.println(arg);
		}
		System.exit(1);
	}

}
