public class Lexicon {

	public String translate(String s){
		char[] vowels = {'a', 'e', 'i', 'o', 'u'}; 
    
    String output = "";
    for(int i = 0; i < s.length(); i++){
      output += s.substring(i, i+1);
      for(char v : vowels){
        if(v == s.charAt(i) && output.indexOf("ent") == -1 && s.indexOf("ent") == -1){          
          output += "ent";
        }
      }
    }
    boolean consonant = true;
    for(char v : vowels){
      if(s.charAt(s.length()-1) == v){
        consonant = false;
      }
    }
    if(consonant && s.charAt(s.length() - 1) != 's'){
      output += "ingy";
    }
    return output;
	}

}
