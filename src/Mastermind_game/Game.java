package Mastermind_game;

public class Game {
	public static void main(String[] args) {
		
	}
}

class Row{
	// A row is a list of four nodes
	private Node[] row;
	
	public Row() {
		this.row = new Node[4];
	}
	public Row(Node[] input) {
		this.row = new Node[4];
		for(int i = 0; i < 4; i++)
			this.row[i] = new Node(input[i].getValue());
	}
	
	public int[] compareTo(Row input) {
		// compare all elements and return number of hits, almosts and misses
		
		int[] hits = new int[4]; // stores number of hits and their index
		int almosts = 0;
		int hitCount = 0;
		
		for(int i = 0; i < 4; i++)
			if(this.row[i].compareTo(input.getRow()[i]) == 0) {
				hits[i] = 1;
				hitCount++;
				}
		
		Node[] trimmedInput = new Node[4 - hitCount];
		Node[] trimmedThis = new Node[4 - hitCount];
		
		int newCount = 0;
		
		for(int i = 0; i < 4; i++) {
			if(hits[i] == 0) {
				trimmedInput[newCount] = input.getRow()[i];
				trimmedThis[newCount] = this.row[i];
				newCount++;
			}
		}
		
		for(int i = 0; i < newCount; i++) {
			
			for(int j = 0; j < newCount; j++) {
				
			}
		}
		
		
		
		
		return null;
	}
	
	public Node[] getRow() {
		return this.row;
	}

}

class Node implements Comparable<Node>{
	// A node is characterized by its value
	
	private int value;
	
	public Node() {
		this.value = 0;
	}
	public Node(int value) {
		this.value = value;
	}
	public Node(Node node) {
		this.value = node.getValue();
	}
	
	
	public int getValue() {
		return this.value;
	}
	
	@Override
	public int compareTo(Node input) {	
		// returns 0 if this and input are the same
		return this.value - input.value;
	}
	
}