package ilu2;

public class Welcome {

	public static String affichage(String nom) {
		StringBuilder retour = new StringBuilder();
		retour.append("Hello,");
		if (isempty(nom)) {
			retour.append("my friend");
		}
		String[] nameList = nom.trim().split("\\s+");
        if (nameList.length == 1) {
           retour.append(nameList[0]);
           }
        else if (nameList.length == 2) {
        	retour.append(nameList[1]);
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
