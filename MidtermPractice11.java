

import acm.program.*;
import acm.util.RandomGenerator;

public class MidtermPractice11 extends ConsoleProgram{

	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int n =readInt("Enter a number in binary: ");
		
		println(reversedBinary(n));
		println(binary(n));
		println(reverseTheBinary(n));
		println(2*binaryToDecimal(n));
	}
	
	private String reversedBinary(int n) {
		String binary = "";
		while(n>0) {
		int m = n%2;
		n/=2;
		binary+= Integer.toString(m);
		}
		return binary;
	}
	
	private String binary(int n) {
		String reverse = reversedBinary(n);
		String result = "";
		for(int i =reverse.length()-1; i>=0;i--) {
			result+=reverse.charAt(i);
		}
		String zeros = "";
		if(result.length()!=32) {
			int m = 32-result.length();
		    for(int j=0; j<m; j++) {
		    	zeros+="0";
		    }
		}
		result = zeros+result;
		return result;
	}
	
	private String reverseTheBinary(int n) {
		String binary1 = binary(n);
		String binary2 = "";
		for(int i=0; i<binary1.length(); i++) {
			if(binary1.charAt(i) == '0') {
				binary2+='1';
			}else {
				binary2+='0';
			}
		}
		return binary2;
	}
	
	private int binaryToDecimal(int n) {
		String binary1 = reverseTheBinary(n) ;
		int b =0;
		int two = 1;
		int decimal = 0;
		for(int j =binary1.length()-1; j>0; j--) {
			char ch = binary1.charAt(j);
			String number = ""+ch;
			b = Integer.parseInt(number);
			decimal+=b*two;
			number = "";
			two*=2;
		}
		return decimal;
	}
	
}

