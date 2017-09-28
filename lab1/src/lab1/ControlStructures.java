package lab1;


public class ControlStructures {
	public static void main(String [] args) {
		primeNumber();
		fooBarBaz();
	}
	public static void primeNumber() {
		int x=0, a=2;
		while(x<50) {
			int z=0;
			for(int y=1;y<a;y++) {
				if(a%y==0) {
					z++;
				}
			}
			if(z==1) {
				System.out.println(a);
				x++;
				a++;
			}else {
				a++;
			}
		}
	}
	public static void fooBarBaz() {
		for(int x=1;x<=500;x++) {
			String a = "foo",b = "bar",c = "baz";
			if((x%3!=0)&&(x%7!=0)&&(x%10!=0)) {
				System.out.println(x);
			}
			if((x%3==0)&&(x%7!=0)&&(x%10!=0)) {
				System.out.println(a);
			}else if((x%3==0)&&((x%7==0)||(x%10==0))){
				System.out.print(a);
			}
			if((x%7==0)&&(x%10!=0)) {
				System.out.println(b);
			}else if((x%7==0)&&(x%10==0)){
				System.out.print(b);
			}
			if(x%10==0) {
				System.out.println(c);
			}
		}
	}

}

