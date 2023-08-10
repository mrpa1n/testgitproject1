package Day_1;

public class String_methods {

	public static void main(String[] args) {
		
		String name ="My name is omkar";
		String abc = "MY NAME IS JAISWAR";
		String xyz = "  My name is Omkar  ";
		
		System.out.println(name.length());
		
		System.out.println(name.charAt(3));
		
		System.out.println(name.equals("My name is Omkar"));
		
		System.out.println(name.equalsIgnoreCase("MY Name IS omkar"));
		
		System.out.println(name.concat(abc));
		
		System.out.println(xyz.trim());
		
		System.out.println(name.toString());
		
		System.out.println(name.substring(5));
		
		System.out.println(name.substring(3, 6));
		

	}

}
