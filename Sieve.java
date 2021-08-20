package inner;
import java.util.*;

public class Sieve {
       
		//Prints a list of prime numbers based on the Sieve of Eratosthenes
	
        public static void main(String args []) {
        		int i = 3;
        		int j = 1;
        		boolean isprime = true;
        		LinkedList<Integer> ll = new LinkedList<>();
        		ll.add(2);
                while (true) {
                	for (int k = 0; k<ll.size(); k++) {
                		if(i % (ll.get(k)) == 0) {
                			isprime = false;
                			break;
                		}
                		else {
                			continue;
                		}
                	}
                	//Adds number to the linked list if it's prime.
                	if(isprime) {
                		ll.add(i);
                		j++;
                		System.out.println(i);
                	}
                	isprime = true;
                	i +=2;
                }
        }
}