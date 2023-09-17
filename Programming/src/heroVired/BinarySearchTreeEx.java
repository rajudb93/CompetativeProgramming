package heroVired;

public class BinarySearchTreeEx {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinarySearchTree {
        Node root;

        public BinarySearchTree() {
            this.root = null;
        }

        public void insert(int data) {
            root = insertRec(root, data);
        }

        private Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
            if (data < root.data) {
                root.left = insertRec(root.left, data);
            }
            if (data > root.data) {
                root.right = insertRec(root.right, data);
            }
            return root;
        }

        public Node search(Node root, int data) {
            if (root == null) {
                return null;
            }
            if(root.data==data){
                return root;
            }
            if(data<root.data){
                return search(root.left,data);
            }
            return  search(root.right,data);
        }

    }

    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Search for 60:");
        Node searchResult = bst.search(bst.root, 60);
        if (searchResult != null) {
            System.out.println("Found: " + searchResult.data);
        } else {
            System.out.println("Not Found");
        }
    }
}
