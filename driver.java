//import java.util.ArrayList;
import java.util.HashSet;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String s1="";
        String s2="AAAA";
        String s3="ABCDv";
        String s4="abbbbbbbbbb";
        boolean value;
         value=checkUnique(s4);
         if(value==true) {
        	 System.out.println("The string is unique");
         }else {
        	 System.out.println("The string contains duplicate chars");
         }
	}

	
	
	public static boolean checkUnique(String string) {
		string=string.toLowerCase();
		if(string.isEmpty()) {
			return true;
		}
		
		HashSet<Character>chars = new HashSet<Character>(); // Using a hashset is much better for this coding problem
		for(int c=0;c<string.length();c++) {
			if(chars.contains(string.charAt(c))) { 
				return false;
			}else {
				chars.add(string.charAt(c));
			}
			
		}
		
		
		
		return true;
	}
}
