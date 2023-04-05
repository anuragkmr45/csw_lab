class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data) {
		this.data = data;
		this.left = null;
        this.right = null;
	}
}

public class SortedArrToBST {
	
	static Node root;

	Node ArrToBST(int arr[], int ps, int pe) {

		if (ps > pe) {
			return null;
		}

		int mid = (ps + pe) / 2;
		Node node = new Node(arr[mid]);

		node.left = ArrToBST(arr, ps, mid - 1);

		node.right = ArrToBST(arr, mid + 1, pe);
		
		return node;
	}

	void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

    void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + "  ");
        inOrder(node.right);
    }
	
	public static void main(String[] args) {
		SortedArrToBST tree = new SortedArrToBST();
		int arr[] = {1, 2, 3, 4, 5, 6};

		int n = arr.length;
		root = tree.ArrToBST(arr, 0, n - 1);
		System.out.println("in-order traversal");
		tree.inOrder(root);
	}
}

