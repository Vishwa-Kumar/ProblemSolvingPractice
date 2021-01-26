package geeksForGeeks;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LRUCache {

	private static int CACHE_SIZE;
	private static Deque<Integer> dQueue;
	private static HashMap<Integer, Integer> hm;

	LRUCache(int cap) {
		// Intialize the cache capacity with the given
		// cap

		CACHE_SIZE = cap;
		dQueue = new LinkedList<>();
		hm = new HashMap<Integer, Integer>(cap);

	}

	// This method works in O(1)
	public static int get(int key) {
		if(hm.containsKey(key))
		{
			return hm.get(key);
		}
		return -1;
	}

	// This method works in O(1)
	public static void set(int key, int value) {
		// your code here
		if(hm.containsKey(key))
		{
			dQueue.remove(key);
			
		}
		else
		{
			if(dQueue.size()==CACHE_SIZE)
			{
				int last=dQueue.removeLast();
				hm.remove(last);
				
			}
			hm.put(key, value);
		
		}
		dQueue.addFirst(key);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
