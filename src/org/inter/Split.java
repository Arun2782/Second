package org.inter;

public class Split {

public Split(int age ,String name, long mobile) {
	
	this.age =age;
	this.mobile=mobile;
	this.name=name;
	
}
	 int age;
	 String name ;
	 long mobile;
	
	private  void info() {
		System.out.println(age+name+mobile);

	}
			public static void main(String[] args) {
				Split s=new Split(28, "subbu", 163373737);
				s.info();
				Split ss=new Split(28, "koki", 163373737l);
				ss.info();
				
			}
	}

