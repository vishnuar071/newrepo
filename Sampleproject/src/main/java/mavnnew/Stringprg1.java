package mavnnew;

public class Stringprg1 {

	public static void main(String[] args) {
String s= "first";
String s1= "second";
System.out.println(s);
System.out.println(s1);
char a[]= {'q', 'w','e', 'r'};
String s2= new String (a);
System.out.println(s2);
//charAt
char c=s.charAt(4);
System.out.println(c);
//length
System.out.println(s.length());
//concat  used to add 2 strings
System.out.println(s.concat(s1));
//contains 
String abc ="my name is vishnu";
System.out.println(abc.contains("name"));
System.out.println(abc.contains("age"));
String x= "First"; 
String f= "first";
//Equals 
System.out.println(x.equals(s));
System.out.println(f.equals(s));
System.out.println(x.equals(s1));

//equals ignore case

System.out.println(x.equalsIgnoreCase(s));

//upto uppercase

System.out.println(f.toUpperCase());

String q= "QWERTY";

System.out.println(q.toLowerCase());
System.out.println(f.toLowerCase());

//value of  used for type casting, convert 

//String w = 10;
int e=10;
String k= String.valueOf(e);
System.out.println(k);
//is empty

String n ="ggg";
System.out.println(n.isEmpty());

System.out.println(s==f);
String d= new String("first");
System.out.println(s==d);

	}

}
 