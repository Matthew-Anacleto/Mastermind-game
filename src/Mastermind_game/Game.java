package Mastermind_game;

public class Game {
	public static void main(String[] args) {
		
	}
}

class Row{
	// A row is a list of four nodes
	
	public int[] compareTo(Row input) {
		return null;
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
		return 0;
	}
	
}