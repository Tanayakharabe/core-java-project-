package stringjavatnp;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String text = "hello java world";
        System.out.println("Original String:" +text);
        System.out.println("Length:" +text.length());
        System.out.println("Uppercase:" +text.toUpperCase());
        System.out.println("Lowercase:" +text.toLowerCase());
        System.out.println("character at index 4:" +text.charAt(4));
        System.out.println("Contains 'java':" +text.concat("Java"));
        System.out.println("Starts with Hello:" +text.startsWith("Hello"));
        System.out.println("Ends with 'World':" +text.endsWith("World"));
        System.out.println("Index of 'Java':" +text.indexOf("Java"));
        System.out.println("last index of 'o':" +text.lastIndexOf("o"));
        System.out.println("Substring(6):" +text.substring(6));
        System.out.println("Substring(6,10):" +text.substring(6,10));
        
        String s1 = "java";
        String s2 = "java";
        
        
        System.out.println("Equals:" +s1.equals(s2));
        System.out.println("Equals Ignore Case:" + "JAVA".equalsIgnoreCase("Java"));
        System.out.println("Replace:" + text.replace("Java","Python"));
        System.out.println("Is Empty:"  + text.isEmpty());
        
        
        String spaces = "  Java  ";
        System.out.println("Trim:'" +spaces.trim() + "'");
        
        
        String fruits = "Apple,Mango,Banana";
        String[]arr = fruits.split(",");
        
        
        System.out.println("Split Result:");
        for(String fruit : arr) {
        	System.out.println(fruit);
        }
         System.out.println("Replace:" + text.replace("Java","Python"));
        System.out.println("Is Empty:"  + text.isEmpty());
        
        
        String spaces1 = "  Java  ";
        System.out.println("Trim:'" +spaces1.trim() + "'");
        
        
        String fruits1 = "Apple,Mango,Banana";
        String[]arr1 = fruits1.split(",");
        
        
        System.out.println("Split Result:");
        for(String fruit : arr1) {
        	System.out.println(fruit);
        }
        
        String joined = String.join("-","Java","Python","C++");
        System.out.println("Join:"  +joined);
        
        System.out.println("Repeat:" + "Hi".repeat(3));
        String joined1 = String.join("-","Java","Python","C++");
        System.out.println("Join:"  +joined1);
        
        System.out.println("Repeat:" + "Hi".repeat(3));
        
        
	}

}
