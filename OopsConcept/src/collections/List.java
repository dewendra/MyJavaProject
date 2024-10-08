package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class List {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		//Adding elements in Array list
		nameList.add("Dewendra");
		nameList.add("Manish");
		nameList.add("Prashant");
		nameList.add("Pawan");
		nameList.add("Eshaan");
		nameList.add("Durgesh");

		System.out.println("List of name:" + nameList);//Getting all elements Array list
		System.out.println("Size of list: "+nameList.size());//Getting Array List size
		System.out.println("Name of get position 1:" + nameList.get(1));//Getting 2nd position element
		System.out.println("Checking List is empty or not:"+nameList.isEmpty());//Checking list is empty or not

		System.out.println("Removing object/elements from list:"+nameList.remove("Durgesh"));//Removing object/elements from list
		System.out.println("List of name:" + nameList);
		
		nameList.add(5, "Annant");
		System.out.println("List of name:" + nameList);
		
		System.out.println("-----Linked List Collection------");
		LinkedList<Integer> numberList=new LinkedList<>();
		//Adding elements in Linked list
		numberList.add(3);
		numberList.add(6);
		numberList.add(7);
		numberList.add(12);
		numberList.add(24);
		System.out.println("Number List :"+numberList);//Getting all elements Linked list
		System.out.println("numberList : "+numberList.size());//Getting Linked List size
		System.out.println("Getting 4th Element:"+numberList.get(3));//Getting 4th position element
		System.out.println("Removing 3rd position Element:"+numberList.remove(2));//Removing 3rd position element
		System.out.println("Number List :"+numberList);
		System.out.println("Removing First Element:"+numberList.removeFirst());//Removing elements from first position
		System.out.println("Number List :"+numberList);
		System.out.println("Removing Last Element:"+numberList.removeLast());//Removing elements from last position
		System.out.println("Number List :"+numberList);
		
		System.out.println("-----Stack------");
		Stack<String>stackString=new Stack<>();
		//Adding element in stack
		stackString.push("Cat");
		stackString.push("Dog");
		stackString.push("Horse");
		stackString.push("Elephant");
		stackString.push("Lion");
		
		System.out.println("All Elements:"+stackString);//Getting all elements from stack
		System.out.println("Removed Element:"+stackString.pop());//Remove an element from the top of the stack
		System.out.println("Added Element:"+stackString.push("Tiger"));//Add an element to the top of the stack
		System.out.println("All Elements:"+stackString);
		System.out.println("Top Element:"+stackString.peek());//Returns an object from the top of the stack
		
		System.out.println("-----Vector------");
		Vector<String> vector=new Vector<>();
		//Adding element in vector
		vector.add("Car");
		vector.add("Bus");
		vector.add("Truck");
		vector.add("Train");
		vector.add("Plane");
		System.out.println("Vector Elements"+vector);
		vector.add(1, "Ship");
		System.out.println("Vector Elements"+vector);
		System.out.println("Getting 2th Element:"+vector.get(2));
		System.out.println("Size of vector:"+vector.size());
		System.out.println("Vector contains Train :"+vector.contains("Train"));
		String str[]=new String[5];
		System.out.println("to Array"+vector.toArray(str));
		
		
		Iterator<String> iterator=vector.iterator();
		System.out.print("Vector Using Iterator :");
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.println(",");
		}
		System.out.println("---------Enumeration---------------");
		//Enumeration
		Enumeration enumeration=Collections.enumeration(vector);
		System.out.println("Enumeration");
		System.out.println("printing each enumeration constant by enumerating through the Vector:");
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		System.out.println("---------SET---------------");
		
		HashSet<String>hashSet=new HashSet<>();
		hashSet.add("Array");
		hashSet.add("LinkedList");
		hashSet.add("Set");
		hashSet.add("Hashmap");
		hashSet.add("Hascode");
		
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.contains("Set"));
		System.out.println(hashSet.hashCode());
		
		HashSet<Integer> linkedHashset=new LinkedHashSet<>();
		linkedHashset.add(12);
		linkedHashset.add(15);
		linkedHashset.add(22);
		linkedHashset.add(27);
		linkedHashset.add(32);
		System.out.println("LinkedHashset :"+linkedHashset);
		System.out.println("LinkedHashset contains :"+linkedHashset.contains(22));
		System.out.println("LinkedHashset isEmpty :"+linkedHashset.isEmpty());
		System.out.println("LinkedHashset remove :"+linkedHashset.remove(32));
		System.out.println("LinkedHashset size :"+linkedHashset.size());
		
		Set<Integer> treeSet=new TreeSet<>();
		treeSet.add(12);
		treeSet.add(15);
		treeSet.add(22);
		treeSet.add(27);
		treeSet.add(32);
		System.out.println("TreeSet By default Ascending order :"+treeSet);//By default Ascending
		
		TreeSet<Integer>descendingOrder=(TreeSet<Integer>) ((TreeSet<Integer>) treeSet).descendingSet();
		System.out.println("TreeSet Descending order :"+descendingOrder);
		//For custom sorting we use Comparator  and Comparable
		
	}

}
