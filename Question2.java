/******************************************************************************
Quesiton 2

author: Antoine Edelman
date: 12/21/19

*******************************************************************************/

public class Question2
{
    public static void main(String[] args) {
        extractInfo(args[0] ,"Request ID#");
    }
    
    //extracts the value by searching the variable name by line
	public static String extractInfo(String text, String varName) {
		String search = varName;
		String [] lines = text.split("\n");
		
		for(String line : lines) {
		    if(line.contains(search) && line.length() > search.length()+2) {
		        return line.substring(search.length()+2, line.length()-1);
		    }
		}
	    return "";
	}
}
