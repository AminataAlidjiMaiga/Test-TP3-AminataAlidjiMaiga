package ilu2;

public class Welcome {

	public static String affichage(String nom) {
		StringBuilder retour = new StringBuilder();
		retour.append("Hello,");
		if (isempty(nom)) {
			retour.append("my friend");
		}
		else if (nom.equals("bob")) {
			retour.append("Bob");
		}
		else if (nom.equals("JERRY")) {
			retour.toString().toUpperCase();
			retour.append("JERRY");
		}
		return retour.toString();

	}
	
	public static boolean isempty(String input) {
		boolean res=false;
		if (input.equals(" ") || input==null) {
			res=true;
		}
		return res;
	}
}
