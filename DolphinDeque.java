//Ameer Ahmed

import java.util.Deque;
import java.util.LinkedList;

public class DolphinDeque {

	public static void main(String[] args) {
		
		//create deque using the LinkedList class
		Deque<String> DolphinLine = new LinkedList<>();
		
		//adding people into the line
		DolphinLine.add("Joey");
		DolphinLine.addFirst("Angelica");
		DolphinLine.addLast("Preston");
		System.out.println("The line is: " + DolphinLine + "\n");
		
		System.out.println("The first person in the line is: " + DolphinLine.peekFirst());
		System.out.println("The last person in the line is: " + DolphinLine.peekLast() + "\n");
		
		System.out.println("One person can come inside which is: " + DolphinLine.pollFirst());
		System.out.println("The line now contains: " + DolphinLine);
	}
}