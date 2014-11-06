package com.resnus.euler.problem18;

public class Node <E> {
	private final E value;
	private Node <E> left, right;
	
	public Node(E value){
		this.value = value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Node<E> getLeftNode(){
		return this.left;
	}
	
	public void setRightNode(Node<E> right){
		this.right = right;
	}
	
	public Node<E> getRightNode(){
		return this.right;
	}
	
	public void setLeftNode(Node<E> left){
		this.left = left;
	}
	
	public E getValue(){
		return this.value;
	}
}
