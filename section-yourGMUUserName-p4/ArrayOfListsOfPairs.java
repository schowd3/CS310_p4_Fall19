//This structure is an array where each entry is the head of its own
//linked list. The linked lists are made up of "bare nodes" (i.e.
//they are not "wrapped" in a nice linked list class). Each node
//in each linked list contains a key-value pair (rather than an single
//value).

//This class will form the baseline for creating a hash table for a
//map that uses separate chaining (each entry in a map is a key-value
//pair). This class will also form a baseline for creating an adjacency
//list (where each entry is a key-value pair where keys are the
//"adjacent" node and values are the connection between them). This way
//we have a universal way for to access your internal structures when
//grading these two classes.

//You have a lot of freedom in how you design this class, as long as
//the provided code work as described. However, because this is only
//a baseline for the other classes you are writing, it would be bad
//design on your part to add in anything specific to hash tables
//(such as rehashing) or specific to graphs (such as source/destination
//information for edges). Our advice to you is: (1) keep it simple
//and (2) think before you code.

//Read the "do not edit" section carefully so that you know what is
//already available. This should help you form some ideas of what
//types of things are missing.

//You may: Add additional methods or variables of any type (even
//public!), but again, you _must_ use the provided Node class, the
//provided "storage" instance variable, and all provided methods
//_must still work_.

//You may not import anything from java.util (and you may not use anything
//from java.util in your part of the code). We use java.util.ArrayList in
//the provided code, but it is not available to you.

public class ArrayOfListsOfPairs<K,V> {
	//This is your internal structure, you must use this
	//you may not change the type, name, privacy, or anything
	//else about this variable. It is initialized in the
	//provided constructor (see the do-not-edit section)
	//and the Node class is also defined there.
	private Node<K,V>[] storage;
	
	// Your code goes here!
	
	
	
	
	
	//--------------------------------------------------------
	// testing code goes here... edit this as much as you want!
	//--------------------------------------------------------
	
	public String toString() {
		//you may edit this to make string representations of your
		//lists for testing
		return super.toString();
	}
	
	public static void main(String[] args) {
		
	}
	
	
	
	
	//--------------------------------------------------------
	// DO NOT EDIT ANYTHING BELOW THIS LINE (except to add JavaDocs)
	//--------------------------------------------------------
	
	//This is what one node in one linked list looks like
	public static class Node<K,V> {
		//it contains one key-value pair
		public KeyValuePair<K,V> pair;
		
		//and one pointer to the next node
		public Node<K,V> next;
		
		//convenience constructor
		public Node(KeyValuePair<K,V> pair) {
			this.pair = pair;
		}
		
		//convenience constructor
		public Node(KeyValuePair<K,V> pair, Node<K,V> next) {
			this.pair = pair;
			this.next = next;
		}
	}
	
	//Creates an array with the specified number of lists-of-pairs
	@SuppressWarnings("unchecked")
	public ArrayOfListsOfPairs(int numLists) {
		storage = (Node<K,V>[]) new Node[numLists];
	}
	
	//Returns the number of lists in this collection
	public int getNumLists() {
		return storage.length;
	}
	
	//Returns all key-value pairs in the specified sublist of this collection
	public java.util.ArrayList<KeyValuePair<K,V>> getAllPairs(int listId) {
		java.util.ArrayList<KeyValuePair<K,V>> lst = new java.util.ArrayList<>();
		
		Node<K,V> current = storage[listId];
		while(current != null) {
			lst.add(current.pair);
			current = current.next;
		}
		
		return lst;
	}
	
	//Returns all key-value pairs in this collection
	public java.util.ArrayList<KeyValuePair<K,V>> getAllPairs() {
		java.util.ArrayList<KeyValuePair<K,V>> lst = new java.util.ArrayList<>();
		
		for(int i = 0; i < storage.length; i++) {
			lst.addAll(getAllPairs(i));
		}
		
		return lst;
	}
}
