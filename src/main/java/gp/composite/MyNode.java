package gp.composite;

import java.util.ArrayList;
import java.util.List;

public class MyNode extends Tree {

    private List<Tree> trees;
    private int level;

    public MyNode(String name, int level) {
        this.trees = new ArrayList<Tree>();
        this.level=level;
        setName(name);
    }

    public void show() {
        for (int i=0;i<level;i++){
            System.out.print("   ");
        }
        System.out.println("name:"+getName());
        for (Tree tree:trees){
            tree.show();
        }
    }

    public void addTree(Tree tree){
        trees.add(tree);
    }

    public void removeTree(Tree tree){
        trees.remove(tree);
    }
}
