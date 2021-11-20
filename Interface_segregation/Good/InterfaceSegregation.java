package Good;

// ---> Interface segregation:
// When classes are forced to implement unnecessary functionalities of interface then 
//  we need to further break down the interface to make it more modular.

interface BST{
    void insertNum();
    void deleteNum();
    int getMin();
    int getMax();
    void traverse();


}

interface BalancedBST extends BST{
    int checkHeight();
    void rotateLeft();
    void rotateRight();
} 

// Now, MyBST doesn't need to implement unnecessary functionalities
class MyBST implements BST{

    @Override
    public void insertNum() {
        //insert logic        
    }

    @Override
    public void deleteNum() {
        //delete logic
        
    }

    @Override
    public int getMin() {
        //get min logic
        return -1;
    }

    @Override
    public int getMax() {
        //get max logic
        return 100;
    }

    @Override
    public void traverse() {
        //traverse logic
        
    }

}


class AVL implements BalancedBST{

    @Override
    public void insertNum() {
        //insert logic        
    }

    @Override
    public void deleteNum() {
        //delete logic
        
    }

    @Override
    public int getMin() {
        //get min logic
        return -1;
    }

    @Override
    public int getMax() {
        //get max logic
        return 100;
    }

    @Override
    public void traverse() {
        //traverse logic
        
    }

    @Override
    public int checkHeight() {
        // check height logic
        return 0;
    }

    @Override
    public void rotateLeft() {
        System.out.println("AVL:: rotating right");
        
    }

    @Override
    public void rotateRight() {
        System.out.println("AVL:: rotating left");
        
    }

}


class InterfaceSegregation{
    public static void main(String[] args){
        AVL avl = new AVL();
        avl.rotateRight();
    }
}