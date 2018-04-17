package fireCode;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearch {

	class Node {
		boolean visited;
		String data;
		ArrayList<Node> adjacentNodes = new ArrayList<>();

	}

	public boolean depthFirstSearch(Node rootNode, String data) {

		if (rootNode == null || data == null) {
			return false;
		} else {
			Stack<Node> s = new Stack<>();
			s.add(rootNode);
			rootNode.visited = true;
			Node tempNode = null;

			while (!s.isEmpty()) {
				tempNode = s.pop();
				if (tempNode.data.equalsIgnoreCase(data)) {
					return true;
				}
				for (int i = 0; i < tempNode.adjacentNodes.size(); i++) {
					if (!tempNode.visited) {
						s.add(tempNode.adjacentNodes.get(i));
					}
				}
			}
		}

		return false;

	}

}
