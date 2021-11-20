package Bad;
// ---> Interface segregation:
// When classes are forced to implement unnecessary functionalities of interface then 
//  we need to further break down the interface to make it more modular.

interface BST{
    void insertNum();
    void deleteNum();
    int getMin();
    int getMax();
    void traverse();

    int checkHeight();
    void rotateLeft();
    void rotateRight();
}

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


    // MyBST is forced to implement following unnecessary functionalities. 
    // These functionalities are necessary for AVL 
    //  but unnecessary for normal BST. 
    @Override
    public int checkHeight() {
        return -1;
    }

    @Override
    public void rotateLeft() {
        System.out.println("Normal BST:: no rotate left implemented");
        
    }

    @Override
    public void rotateRight() {
        System.out.println("Normal BST:: no rotate right implemented");
        
    }
  
}


class AVL implements BST{

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
        BST bst = new MyBST();
        bst.rotateRight();
    }
}