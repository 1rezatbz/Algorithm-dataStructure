package BinaryTree;

public class TreeNode {
    private Integer data;
    private TreeNode leftChild;
    private boolean isDeleted = false;
    private TreeNode rightChild;
    public TreeNode(Integer data){this.data = data;}
    public boolean isLeaf(){return this.leftChild==null && this.rightChild==null;}

    public TreeNode find (Integer data) {
        if (this.data == data && !isDeleted) {return this;}
        if (data < this.data && leftChild != null) {return leftChild.find(data);}
        if (rightChild != null) {return rightChild.find(data);}
        return null;}
    public void insert(Integer  data){
        if(data >= this.data){
            if(this.rightChild==null){this.rightChild= new TreeNode(data);}
            else {this.rightChild.insert(data);}
        }else {
            if (this.leftChild ==null){this.leftChild= new TreeNode(data);}
            else {this.leftChild.insert(data);}
        }
    }
    public Integer getData() {
        return data;
    }
    public void setLeftChild(TreeNode leftChild){
        this.leftChild = leftChild;}
    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
    public TreeNode getLeftChild() {
        return leftChild;
    }
    public TreeNode getRightChild() {
        return rightChild;}
    public void delete() {this.isDeleted = true;}
    public boolean isDeleted() {return isDeleted;}
    public Integer smallest(){
        if(leftChild==null){return this.data; }
        return this.leftChild.smallest();
    }
    public Integer largest(){
        if(rightChild==null){return this.data;}
        return this.rightChild.largest();
    }

    public void traverseInOrder(){
        if (this.leftChild!=null){this.leftChild.traverseInOrder();}
        System.out.println(this + "");
        if(this.rightChild!=null){this.rightChild.traverseInOrder();}
    }

    public int height(){
        if(isLeaf()){return 1;}
        int left = 0;
        int right = 0;
        if(this.leftChild!=null){left= this.leftChild.height();}
        if(this.rightChild!=null){right=this.rightChild.height();}
        return (left>right) ? (left+1): (right+1);
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
