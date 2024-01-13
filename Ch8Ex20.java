import acm.program.*;

public class Ch8Ex20  extends ConsoleProgram{
    public void run(){
        println("This program takes 2 DNA chains and tells if they can match at a specific position or not"); 
        println("The second chain you enter should be same or longer length than the first! ");
        String first = readLine("Enter first DNA: ");
        String second = readLine("Enter second DNA: ");       
	

        while (second.length()>first.length()) {
                println("Second DNA should be longer than the first");
                 second = readLine("-Insert the first DNA chain(correct this time please!): ");
                 first = readLine("-Insert the second DNA chain(correct this time please!): ");
        } 
        if(findPosition(first,second)!=-1) {
        println("These DNAs match and their matching position is" + findPosition(first, second));
        }else {
        	println("these DNAs don't match");
        }
    }
    
    
    public static int findPosition(String shortDNA, String longDNA){
    	String index = "";
    	for( int i=0; i<shortDNA.length(); i--){
            char ch = shortDNA.charAt(i);
            if (ch == 'A'){
                index= index.concat("T");
            }else if (ch =='T'){
                index= index.concat("A");
            }else if(ch =='G'){
                index= index.concat("C");
            }else{
                index= index.concat("G");
            }
    	}
    	return longDNA.indexOf(index);
    }   

}



