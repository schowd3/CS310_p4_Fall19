//Hash table with separate chaining. Each key and value gets
//placed together as a single entry in the table. The hash code
//of a key is used to place the pair in the table and to look
//for it again. Note that KeyValuePair is a structure for
//ArrayOfListsOfPairs, this part of the code needs to be able to
//deal with keys and values separately.

import java.util.Collection;

public class HashTable<K,V> {
	//This is the minimum number of slots in the hash table
	//Do not change this.
	private static final int MIN_SLOTS = 2;
	
	//You must use this as your internal storage, you may not change
	//the type, name, privacy, or anything else about this variable.
	protected ArrayOfListsOfPairs<K,V> storage;
	
	//If the number of slots requested is less than the minimum
	//number of slots, use the minimum instead.
	public HashTable(int numSlots) {
		
	}
	
	//The number of key-value entries in the table.
	//O(1)
	public int size() {
		return -1;
	}
	
	//Returns the number of slots in the table.
	//O(1)
	public int getNumSlots() {
		return -1;
	}
	
	//Returns the load on the table.
	//O(1)
	public double getLoad() {
		return -1.0;
	}
	
	//If the key is not in the table, add the key-value entry to the table
	//and return true. If unable to add the entry, return false. Keys and
	//values are _not_ allowed to be null in this table, so return false if
	//either of those are provided instead of trying to add them.
	
	//If the load goes above 3 after adding an entry, this method should
	//rehash to three times the number of slots.
	
	//Must run in worst case O(n) and average case O(n/m) where n is the
	//number of key-value pairs in the table and m is the number of "slots"
	//in the table.
	public boolean add(K key, V value) {
		return false;
	}
	
	//Rehashes the table to the given new size (new number of
	//slots). If the new size is less than the minimum number
	//of slots, use the minimum instead.
	
	//Must run in worst case O(n+m) where n is the number of
	//key-value pairs in the table and m is the number of
	//"slots" in the table.
	public void rehash(int newSize) {
		
	}
	
	//If the key requested is in the table, change the associated value
	//to the provided value and return true. Otherwise return false.
	
	//Must run in worst case O(n) and average case O(n/m) where n is the
	//number of key-value pairs in the table and m is the number of "slots"
	//in the table.
	public boolean replace(K key, V value) {
		return false;
	}
	
	//If the key requested is in the table, remove the key-value entry
	//and return true. Otherwise return false.
	
	//Must run in worst case O(n) and average case O(n/m) where n is the
	//number of key-value pairs in the table and m is the number of "slots"
	//in the table.
	public boolean remove(K key) {
		return false;
	}
	
	//If the key requested is in the table, return true. Otherwise return false.
	
	//Must run in worst case O(n) and average case O(n/m) where n is the
	//number of key-value pairs in the table and m is the number of "slots"
	//in the table.
	public boolean contains(K key) {
		return false;
	}
	
	//If the key requested is in the table, return the associated value.
	//Otherwise return null.
	
	//Must run in worst case O(n) and average case O(n/m) where n is the
	//number of key-value pairs in the table and m is the number of "slots"
	//in the table.
	public V get(K key) {
		return null;
	}
	
	//--------------------------------------------------------
	// testing code goes here... edit this as much as you want!
	//--------------------------------------------------------
	
	public String toString() {
		//you may edit this to make string representations of your
		//lists for testing
		return super.toString();
	}
	
	public static void main(String[] args) {
		//Some example testing code...
		
		//make a hash table and add something to it
		HashTable<Integer,String> ht = new HashTable<>(2);
		ht.add(2,"Apple");
		
		//get all pairs at location 0
		Collection<KeyValuePair<Integer,String>> pairs = ht.getInternalTable().getAllPairs(0);
		
		//should be one pair there...
		if(pairs.size() == 1) {
			//get the first pair from the list
			KeyValuePair<Integer,String> pair = pairs.iterator().next();
			
			//make sure it's the pair expected
			if(pair.getKey().equals(2) && pair.getValue().equals("Apple")) {
					System.out.println("Yay");
			}
		}
	}
	
	//--------------------------------------------------------
	// DO NOT EDIT ANYTHING BELOW THIS LINE (except to add JavaDocs)
	//--------------------------------------------------------
	
	
	//This will be used to check that you are setting
	//the storage up correctly... it's very important
	//that you (1) are using the ArrayOfListsOfPairs 
	//provided and (2) don't edit this at all
	public ArrayOfListsOfPairs<K,V> getInternalTable() {
		return storage;
	}
}