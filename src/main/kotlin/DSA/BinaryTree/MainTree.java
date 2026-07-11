package DSA.BinaryTree;

public class MainTree {
    public static void main(String[] args) {
       // BST tree = new BST();
        /*int[]nums={5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();*/

        /*int[]nums2={1,2,3,4,5,6,7,8,9};
        tree.populatedSorted(nums2);
        tree.display();*/

       /* AVL tree2 = new AVL();
        for(int i=0; i < 1000; i++) {
            tree2.insert(i);
        }
        System.out.println(tree2.height());*/

        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
        // tree.display();

        System.out.println(tree.query(1, 6));
    }
}
