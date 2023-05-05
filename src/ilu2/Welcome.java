package ilu2;

public class Welcome {

	public static String welcome(String input) 

	{
		StringBuilder retour = new StringBuilder();
		StringBuilder maj= new StringBuilder();
		maj.append(".AND HELLO");
		retour.append("Hello");
		if(isempty(input))
		{ 
			retour.append(", my friend");
		}
		else{
			input=input.trim().replaceAll("\\s+", "");
			String[] name = input.split(",");
			if (name.length==1) 
			{
				if (maj(name[0]))
				{
					retour.replace(0, 5,"HELLO,");
					retour.append(input);
					retour.append(" !");
				}
				else
				{
					retour.append(",");
					retour.append(change(name[0]));}
			}
			else
			{
				if(majhere(name))
				{
					int nbmaj=majcount(name);
					String derniermaj =null;
					String derniermin=null;
					int nbmin=name.length-nbmaj;
					for (int i=0;i<(name.length);i++) 
					{
						if(maj(name[i]))
						{
							if(nbmaj!=1)
							{
								maj.append(",");
								maj.append(name[i]);
								nbmaj--;
							}
							else
							{
								derniermaj=name[i];
							}
						}
						else
						{
							if(nbmin!=1)
							{
								String add=change(name[i]);
								retour.append(",");
								retour.append(add);
								nbmin--;
							}
							else
							{
								derniermin=name[i];
							}
						}
					}
					maj.append(" AND ");
					maj.append(derniermaj);
					maj.append(" !");
					retour.append(" and ");
					retour.append(change(derniermin));
					retour.append(maj);
				}
				else
				{
					if(name.length==2)
					{
						for (int i=0;i<(name.length);i++) 
						{
								String add=change(name[i]);
								retour.append(",");
								retour.append(add);
						}
					}
					else
					{
						for (int i=0;i<(name.length)-1;i++) 
						{
								String add=change(name[i]);
								retour.append(",");
								retour.append(add);
						}
						retour.append(" and ");
						retour.append(change(name[(name.length)-1]));
					}
				}
			}
		}
		return retour.toString();

	}
	public static boolean isempty(String input) {
		String x=input.trim().replaceAll("\\s+", "");
		return x=="";
	}

	public static boolean maj(String input)
	{
		return input.equals(input.toUpperCase());
	}

	public static String change(String input)
	{
		return input.substring(0,1).toUpperCase()+input.subSequence(1,input.length());
	}

	

	public static boolean majhere(String[] list)
	{
		boolean x=false;
		for (int i=0;i<(list.length);i++) 
		{
			if(maj(list[i]))
			{
				x=true;
			}
		}
		return x;
	}

	public static int majcount(String[] l)
	{
		int x=0;
		for (int i=0;i<(l.length);i++) 
		{
			if(maj(l[i])){
				x++;
			}}
	return x;

	}
}
