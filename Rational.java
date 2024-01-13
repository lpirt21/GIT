public class Rational {
	
	public Rational() {
		this(0);
	}
	
	
	
	public Rational(int n) {
		this(n,1);
	}
	
	
	
	public Rational(int x, int y) {
		int g = gcd(Math.abs(x), Math.abs(y));
		num = x/g;
		den = Math.abs(y)/g;
		if(y<0) num = - num;
		
	}
	
	
	
	public Rational add(Rational r) {
		return new Rational(this.num * r.den + r.num * this.den,this.den*r.den);
	}
	
	
	
	public Rational substract(Rational r) {
		return new Rational(this.num * r.num - r.num * this.den, this.den * r.den);
	}
	
	
	
	public Rational multiply(Rational r) {
		return new Rational(this.num * r.num, this.den * r.den);
	}
	
	
	
	public Rational divide(Rational r) {
		return new Rational(this.num*r.den, this.den * r.num);
	}
	
	
	public String toString() {
		if(den == 1) {
			return "" + num;
		}else {
			return num + "/" + den;
		}
	}
	
	private int gcd(int x, int y) {
		int num = x%y;
		while(num>0) {
			x = y;
			y = num;
			num = x%y;
		}
		return y;
	}
	
	private int num;
	private int den;
}
