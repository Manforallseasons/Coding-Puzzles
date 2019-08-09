package fizzbuzz;

public class Main {
    public static void main(String[] args) {
        for (int x = 0; x < 1000; x++) {
        	if (x%3 == 0 || x%5 == 0) {
        		if(x%3 ==0) {
        			System.out.print("Fizz");
        		}
        		if (x%5 == 0) {
        			System.out.print("Buzz");
        		}
        	}
        	else {
        		System.out.print(x);
        	}
        	System.out.println();
        }
    }
}
