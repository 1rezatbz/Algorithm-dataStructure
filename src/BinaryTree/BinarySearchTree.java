package BinaryTree;

public class BinarySearchTree {
    private TreeNode root;
    public void insert (Integer data) {
        if(root == null){this.root =new TreeNode(data);}
        else {root.insert(data);}
    }

    public TreeNode find(Integer data) {
        if(root!=null){return root.find(data);}
        return null;
    }
    public void delete (Integer data) {
        TreeNode toDel = find(data);
        toDel.delete();
    }

    public Integer smallest(){
        if(this.root!=null){return root.smallest();}
        return null;
    }
    public Integer largest(){
        if(this.root!=null){return root.largest();}
        return null;
    }

    public void traverseInOrder(){
        if(this.root!=null){this.root.traverseInOrder();}
        System.out.println();
    }

    public void traversePreOrder(){}//todo
    public void traversePostOrder(){}//todo

    public int height() {
        if (this.root == null) return 0;
        return this.root.height();
    }


//    public void delete (Integer data) {
//        TreeNode current = this.root;
//        TreeNode parent = this.root;
//        boolean isLeftChild = false;
//        if (current ==null){return;} // tree is empty
//        while (current != null && current.getData() != data){
//            parent=current;
//            if (data<current.getData()){
//                current = current.getLeftChild();
//                isLeftChild = true;
//            }else {
//                current =current.getRightChild();
//                isLeftChild=false;
//            }
//        }
//        if (current ==null){return;} // node to be deleted not found
//        // this is case 1 node is leaf
//        if (current.getRightChild()==null && current.getLeftChild()==null){
//            if(current==root){root=null;}
//            else { if (isLeftChild){parent.setLeftChild(null);}
//                else {parent.setRightChild(null);}
//            }
//        }
//        // this is case 2 broken down further into 2 separate cases
//          //current has left child
//        else if (current.getRightChild()==null){
//            if (current ==root){root= current.getLeftChild();}
//            else if(isLeftChild){parent.setLeftChild(current.getLeftChild());}
//            else {parent.setRightChild(current.getLeftChild());}
//        }
//          //current has right child
//        else if (current.getLeftChild()==null){
//            if(current ==root){root= current.getRightChild();}
//            else if(isLeftChild){parent.setLeftChild(current.getRightChild());}
//            else {parent.setRightChild(current.getRightChild());}
//        }
//        // this is case 3 node to be deleted has 2 children
//  // Todo else {return;}
//    }

    public static void main(String[] args) {
        int [] sample={5,3,1,2,4,6,8,7,9};
        BinarySearchTree bst = new BinarySearchTree();
        for (int i:sample){bst.insert(i);}
        System.out.println(bst.find(65));
        System.out.println(bst.smallest());
        System.out.println(bst.largest());
		bst.delete(9);
        System.out.println(bst.height());
        bst.traverseInOrder();
    }




}
