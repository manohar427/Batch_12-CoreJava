package com.string;

public class StringDemo {

	public static void main(String[] args) {

		/*String name = "abcdEwsdjwhcjkccccccc";

		System.out.println(name.length());
		
		System.out.println(name);//String@h2q3748263
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		int count = 0;
		for(int i=0;i<name.length();i++){
			
			if(name.charAt(i) == 'w')
				count = count +1;
		}
		
		System.out.println("c -count:"+count);*/
		
/*		
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s1 == s3);//T
		System.out.println(s1 == s2);//F
		System.out.println(s3 == s2);//F
*/		
		
		String n1 = "abc";
		n1 = n1 +"pqr";
		
		System.out.println(n1);
		
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("pqr");
		
		System.out.println(sb);
		
		StringBuilder sbl =new StringBuilder();
		sbl.append("abc");
		sbl.append("pqr");
		System.out.println(sbl);
		
		
		
	}

}
