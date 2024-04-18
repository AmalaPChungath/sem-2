class strman
{
	public static void main(String args[])
	{
		String str="  Hello,World!  ";
		System.out.println("concatinated string \n"+str.concat("\njava"));
		System.out.println("substring from 8\n"+str.substring(8));
		System.out.println("starting index of world : "+str.indexOf("World"));
		System.out.println("relpaced string is\n"+str.replace("World","India"));
		if(str.equals("Hello,World!"))
			System.out.println("strings are equal");
		else
			System.out.println("not equal");
		
		System.out.println("trim white space of string\n"+str.trim());
		
		System.out.println("uppercase : "+str.toUpperCase());
		System.out.println("lowercase : "+str.toLowerCase());
		System.out.println("length of string : "+str.length());
		System.out.println("character at 8 : "+str.charAt(8));
		
		String s[]=new String[str.length()];
		s=str.trim().split(",");
		System.out.println("splited words are \n");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
}




/*
concatinated string 
  Hello,World!  
java
substring from 8
World!  
starting index of world : 8
relpaced string is
  Hello,India!  
not equal
trim white space of string
Hello,World!
uppercase :   HELLO,WORLD!  
lowercase :   hello,world!  
length of string : 16
character at 8 : W
splited words are 

Hello
World!
*/
