package leetCode.amazon.arraysAndStrings;

import java.util.HashMap;

public class IntegerToRoman {

	class BSTNode {
		BSTNode left, right;
		int data;
		String symbol;

		/* Constructor */
		public BSTNode() {
			left = null;
			right = null;
			symbol="";
			data = 0;
		}

		/* Constructor */
		public BSTNode(int n,String s) {
			left = null;
			right = null;
			data = n;
			symbol=s;
		}

		/* Function to set left node */
		public void setLeft(BSTNode n) {
			left = n;
		}

		/* Function to set right node */
		public void setRight(BSTNode n) {
			right = n;
		}

		/* Function to get left node */
		public BSTNode getLeft() {
			return left;
		}

		/* Function to get right node */
		public BSTNode getRight() {
			return right;
		}

		/* Function to set data to node */
		public void setData(int d) {
			data = d;
		}
		
		public String getSymbol(int d) {
			return symbol;
		}

		/* Function to get data from node */
		public int getData() {
			return data;
		}

		@Override
		public String toString() {
			return "BSTNode  data=" + data + ", symbol=" + symbol + "]";
		}
		
	}

	class BST {
		private BSTNode root;

		/* Constructor */
		public BST() {
			root = null;
		}

		/* Function to check if tree is empty */
		public boolean isEmpty() {
			return root == null;
		}

		/* Functions to insert data */
		public void insert(int data,String symbol) {
			root = insert(root, data,symbol);
		}

		/* Function to insert data recursively */
		private BSTNode insert(BSTNode node, int data,String symbol) {
			if (node == null)
				node = new BSTNode(data,symbol);
			else {
				if (data <= node.getData())
					node.left = insert(node.left, data,symbol);
				else
					node.right = insert(node.right, data,symbol);
			}
			return node;
		}

	

		
		/* Functions to count number of nodes */
		public int countNodes() {
			return countNodes(root);
		}

		/* Function to count number of nodes recursively */
		private int countNodes(BSTNode r) {
			if (r == null)
				return 0;
			else {
				int l = 1;
				l += countNodes(r.getLeft());
				l += countNodes(r.getRight());
				return l;
			}
		}

		/* Functions to search for an element */
		public BSTNode search(int val) {
			BSTNode bstNode= search(root, val,root);
			return bstNode;
		}

		/* Function to search for an element recursively */
		private BSTNode search(BSTNode r, int val, BSTNode lastSmallest) {
			
			BSTNode res=lastSmallest;
			if(r==null)
			{
				return lastSmallest;
			}
			
			if(val>r.getData())
			{
				lastSmallest=r;
				res=search(r.right,val,lastSmallest);
			}
			else if(val<r.getData())
			{
				res=search(r.left,val,lastSmallest);
			}
			else
			{
				res=r;
			}
			
			return res;
		}

		/* Function for inorder traversal */
		public void inorder() {
			inorder(root);
		}

		private void inorder(BSTNode r) {
			if (r != null) {
				inorder(r.getLeft());
				System.out.print(r.getData() + " ");
				inorder(r.getRight());
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: 58
//		Output: "LVIII"
//		Explanation: L = 50, V = 5, III = 3.
		
		
//		Input: 1994
//		Output: "MCMXCIV"
//		Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
		
		BST bst=new IntegerToRoman().new BST();
		bst.insert(50,"L");
		bst.insert(5,"V");
		bst.insert(1,"I");
		bst.insert(10,"X");
		bst.insert(500,"D");
		bst.insert(100,"C");
		bst.insert(1000,"M");
		
		BSTNode res=bst.search(50);
		
		//System.out.println(res);
		
		IntegerToRoman obj=new IntegerToRoman();
		
		int num=4;
		System.out.println(obj.intToRoman(num));
		

	}

	public String intToRoman(int num) {
		
		BST bst=new BST();
		bst.insert(50,"L");
		bst.insert(5,"V");
		bst.insert(1,"I");
		bst.insert(10,"X");
		bst.insert(500,"D");
		bst.insert(100,"C");
		bst.insert(1000,"M");
		
		HashMap<String,BSTNode> predMap=new HashMap<String, BSTNode>();
		predMap.put("I", new BSTNode(5,"V"));
		predMap.put("V", new BSTNode(10,"X"));
		
		predMap.put("X", new BSTNode(50,"L"));
		predMap.put("L", new BSTNode(100,"C"));
		predMap.put("L", new BSTNode(500,"D"));
		predMap.put("D", new BSTNode(1000,"M"));
		

		
		
		int r=0;
		StringBuilder sb=new StringBuilder();
		int placeDigit=1;
		int temp=0;
		while (num>0)
		{
			r=num%10;
			temp=r * placeMultiplier(placeDigit);
			sb.append(findRomanSymbol(temp,bst,predMap));
			num=num/10;
		}
		sb.reverse();
		
		return sb.toString();
	}
	private int placeMultiplier(int p)
	{
		int num=1;
		for(int i=1;i<p;i++)
		{
			num=10 * num;
		}
		return num;
	}
	
	public String findRomanSymbol(int num,BST bst,HashMap<String,BSTNode> predMap) {
		
		BSTNode node=bst.search(num);
		
		if(num==0)
		{
			return "";
		}
		if(node.data==num)
		{
			return node.symbol;
		}
		
		if(predMap.get(node.symbol).data-placeMultiplier(countdisit(node.data))==num)
		{
			return predMap.get(node.symbol).symbol+node.symbol;
		}
//		if(node.data%5==0)
//		{
//			if(node.data-(placeMultiplier(countdisit(node.data)))==num)
//			{
//				return predMap.get(node.symbol)+node.symbol;
//			}
//		}
//		if(node.data%10==0)
//		{
//			if(node.data-(placeMultiplier(countdisit(node.data)-1))==num)
//			{
//				return predMap.get(node.symbol)+node.symbol;
//			}
//		}
		
		StringBuilder sb=new StringBuilder();
		while(num>0)
		{
			sb.append(node.symbol);
			num=num-node.data;
		}
		
		
		return sb.toString();
	}
	
	private int countdisit(int Number)
	{
		int count=0;
		while(Number > 0) {
			Number = Number / 10;
			count = count + 1; 
		}
		return count;
	}

}
