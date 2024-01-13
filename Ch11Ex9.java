//the art and science of java chapter 11 exercise 9

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ch11Ex9 extends GraphicsProgram {
	private int count =0;
	private JTextField words;
	private String line;
	private int CIRCLE = 13;
    private int RECT_W = 33;
    private int RECT_H = 17;
	private int diff = 15;
	private int diffy1 = 50;
	private int diffy2 = 47;
	GObject gobj;
	
	public void run() {
		words = new JTextField(40);
		words.addActionListener(this);
		add(new JLabel("Input string"),SOUTH);
		add(words,SOUTH);
			
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == words) {
			line = words.getText();
			StringTokenizer tokenizer = new StringTokenizer(line, " ",true);
			while(tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				token = takeString(token);
				String wr = translate(token);
				transform(wr,count);
				count++;
		    }
		}
	}
	
	private String takeString(String line) {
		String word = "";
		for(int i =0; i<line.length();i++) {
			char ch = line.charAt(i);
			if(Character.isLetter(ch)) {
				ch = Character.toUpperCase(ch);
			}
			word +=ch;
	    }
		return word;
	}
	
	
	private String translate(String line) {
		String letter = "";
		String word = "";
		for(int i=0; i<line.length(); i++) {
			char ch = line.charAt(i);
			switch(ch) {
				case 'A' : letter =".- "; break;
				case 'B' : letter ="-... ";break;
				case 'C' : letter ="-.-. ";break;
				case 'D' : letter ="-.. ";break;
				case 'E' : letter =". ";break;
				case 'F' : letter ="..-. ";break;
				case 'G' : letter ="--. ";break;
				case 'H' : letter =".... ";break;
				case 'I' : letter =".. ";break;
				case 'J' : letter =".--- ";break;
				case 'K' : letter ="-.- ";break;
				case 'L' : letter =".-.. ";break;
				case 'M' : letter ="-- ";break;
				case 'N' : letter ="-. ";break;
				case 'O' : letter ="--- ";break;
				case 'P' : letter =".--. ";break;
				case 'Q' : letter ="--.- ";break;
				case 'R' : letter =".-. ";break;
				case 'S' : letter ="... ";break;
				case 'T' : letter ="- ";break;
				case 'U' : letter ="..- ";break;
				case 'V' : letter ="...- ";break;
				case 'W' : letter =".-- ";break;
				case 'X' : letter ="-..- ";break;
				case 'Y' : letter ="-.-- ";break;
				case 'Z' : letter ="--.. ";break;
			}
			word+=letter;
		}
		return word;
	}
	
	private void transform(String wr, int j) {
		StringTokenizer tokenizer = new StringTokenizer(wr," ", true);
		String token = "";
		gobj = new GRect(0,0,1,1);
		while(tokenizer.hasMoreTokens()) {
			token = tokenizer.nextToken();
			for(int i=0; i < token.length();i++) {
				char m = token.charAt(i);
				if(i!=0) {
				m = token.charAt(i-1);
				}
				char h = token.charAt(i);
				
				if(m == '.') {
				if(h == '.') {
					GOval oval = new GOval(gobj.getX() + CIRCLE+ diff,diffy1+diffy1*j,CIRCLE,CIRCLE);
					oval.setFilled(true);
					add(oval);
					gobj = oval;
				}
				}else if(m =='-') {
					if(h == '.') {
					GOval oval = new GOval(gobj.getX() + RECT_W + diff,diffy1+diffy1*j,CIRCLE,CIRCLE);
					oval.setFilled(true);
					add(oval);
					gobj = oval;
					}
				}
				if(m == '-') {
				if(h == '-') {
					GRect rect = new GRect(gobj.getX() + RECT_W+ diff ,diffy2+diffy1*j,RECT_W,RECT_H);
					rect.setFilled(true);
					add(rect);
					gobj = rect;
				}
				}else if(m=='.') {
					if(h == '-') {
					GRect rect = new GRect(gobj.getX() + CIRCLE+ diff ,diffy2+diffy1*j,RECT_W,RECT_H);
					rect.setFilled(true);
					add(rect);
					gobj = rect;
					}
				}
				if(h == ' ') {
					gobj = new GRect(gobj.getX() +gobj.getWidth()+ diff, j*diffy1, 10,10);
				}
			}
		}		
	}	
}
