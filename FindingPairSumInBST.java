
import java.util.HashSet;
import java.util.Scanner;

public class FindingPairSumInBST {
	static class Node {
		Node left;
		Node right;
		int data;
	}

	public static Node insert(Node node, int value) {
		if (node == null) {
			return createNewNode(value);
		}

		if (value < node.data) {
			node.left = insert(node.left, value);
		} else if ((value > node.data)) {
			node.right = insert(node.right, value);
		}
		return node;
	}

	public static Node createNewNode(int k) {
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}

	public static boolean ifPairExists(Node node, int sum) {
		HashSet<Integer> set = new HashSet<>();
		return ifPairExistsUtil(node, sum, set);
	}

	public static boolean ifPairExistsUtil(Node node, int sum, HashSet<Integer> set) {
		if (node == null) {
			return false;
		}

		if (set.contains(sum - node.data)) {
			System.out.println("pair is : (" + (sum - node.data) + " , " + node.data + ")");
			return true;
		}

		set.add(node.data);

		if (ifPairExistsUtil(node.left, sum, set)) {
			return true;
		}
		return ifPairExistsUtil(node.right, sum, set);
	}

	public static void main(String[] args) {
		FindingPairSumInBST a = new FindingPairSumInBST();
		FindingPairSumInBST.Node root = new FindingPairSumInBST.Node();
		root = null;
		root = a.insert(root, 40);
		root = a.insert(root, 20);
		root = a.insert(root, 60);
		root = a.insert(root, 10);
		root = a.insert(root, 30);
		root = a.insert(root, 50);
		root = a.insert(root, 70);

		System.out.println("enter the value of sum for which you want to find a pair of nodes");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		boolean b = a.ifPairExists(root, z);
		if (b == false) {
			System.out.println("pair does not exist");
		}
	}
}
