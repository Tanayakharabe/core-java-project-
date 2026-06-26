// in exam we have to write everything in detail , eg. lets take an eclipse ex of linked list etc
package collectionarraylistint;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class intclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// list support both array list and linked list
		List<Integer> KK = new LinkedList<Integer>();// here list is our class and also  arraylist is our class.
		KK.add(10);// object.add method , here we are adding cities name by add()
		KK.add(20);// no. are not written in double inverted comma , only string is wrritten in double inverted comma 
		KK.add(30);
		KK.add(40);
		System.out.println("no. :" +KK);// result is stored in obj kk

		System.out.println("Element at index 2:" +KK.get(2));// to get what is on index 2 , get.(index) is used
	
	// now to replace no from specific index and to add anoter no there 	
	KK.set(1, 50);// set(index,null) is used
	
	System.out.println("updated list:" +KK);
	// now to remove no 
    KK.remove(2);// remove(index)is used
    
   System.out.println("new list after removing:" +KK);
		

	}

}
