package ilu2;

public class Welcome {

	public static String affichage(String nom) {
		StringBuilder retour = new StringBuilder();
		StringBuilder maj= new StringBuilder();
		maj.append(".AND HELLO");
		retour.append("Hello");
		if (isempty(nom)) {
			retour.append(",");
			retour.append("my friend");
		}
		else {
			// Suppression des espaces inutiles
		    nom = nom.trim().replaceAll("\\s+", " ");
			String[] nameList = nom.split(",");
			if (nameList.length==1) {
				if (nameList[0].equals(nameList[0].toUpperCase())) {
					retour.replace(0,5,"HELLO");
					retour.append(",");
					retour.append(nom);
					retour.append(" !");
				}
				else {
					retour.append(",");
					retour.append(trans(nameList[0]));
				}
			}
			else if (nameList.length==2) {
				for (int i=0;i<(nameList.length);i++) {
					retour.append(",");
					retour.append(trans(nameList[i]));
				}
			}
			else {
				boolean ishere=false;
				for (int i=0;i<(nameList.length);i++) {
					if (nameList[i].equals(nameList[i].toUpperCase()))
					{
						retour.append(",");
						maj.append(nameList[i]);
						ishere=true;
					}
					else {
						retour.append(",");
						retour.append(trans(nameList[i]));
					}	
				}
				if (ishere) {
					maj.append("!");
					retour.append(maj);
				}
				//retour.append("and");
				//retour.append(nameList[(nameList.length)-1]);
			}
			
		}
		return retour.toString();
	}
	
	public static boolean isempty(String input) {
		boolean res=false;
		if (input.equals(" ") || input.equals("  ")) {
			res=true;
		}
		return res;
	}
	
	public static String trans(String input) {
		return input.substring(0,1).toUpperCase()+input.subSequence(1,input.length());
	}
	
}
