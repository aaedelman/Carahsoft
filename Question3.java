/******************************************************************************
Quesiton 3

author: Antoine Edelman
date: 12/21/19

*******************************************************************************/
import java.util.Scanner; 
public class Question3
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a string and Press Enter");
            String text1 = scan.next();
            System.out.println("Now enter another string");
            String text2 = scan.next();
            System.out.println(isAnagram(text1, text2));
        }
        scan.close();
    }
    

	public static boolean isAnagram(String text1, String text2) {
		if(text1.length() != text2.length()) {
		    return false;
		}
		ArrayList<char> charleft = new ArrayList<char>(text1.toCharArray());
		for(char a: text2.toCharArray) {
		    if(charleft.contains(a)) {
		        charleft.remove(a);
		    }
		}
		return charleft.size() == 0;
	}
}