package ilu2;

public class Welcome {

	public static String affichage(String nom) {
		StringBuilder retour = new StringBuilder();
		StringBuilder maj= new StringBuilder();
		retour.append("Hello,");
		maj.append(". AND HELLO,");
		if (isempty(nom)) {
			retour.append("my friend");
		}
		else if (nom.equals("JERRY")) {
			retour.toString().toUpperCase();
			retour.append("JERRY");
		}
		String[] nameList = nom.trim().split("\\s+");
		if (nameList.length==1) {
			retour.append(nameList[0]);
		}
		else {
			for (int i=0;i<nameList.length;i++) {
				if (nameList[i].equals(nameList[i].toUpperCase()))
				{
					maj.append(nameList[i]);
				}
				else {
					retour.append(nameList[i]);
				}	
			}
			retour.append(maj);
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
