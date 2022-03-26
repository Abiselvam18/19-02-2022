package javastring;

public class String_handling {

	public static void main(String[] args) {
		
		//creating string by java literal
		String s1="Java";
		char[] ch={'S','t','r','i','n','g'};
		
		//converting char array to string
		String s2=new String(ch);
		
		//creating java string by new keyword
		String s3=new String("Example");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
