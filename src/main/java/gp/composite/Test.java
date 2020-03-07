package gp.composite;

public class Test {
    public static void main(String[] args) {
        MyNode node=new MyNode("root Node ",0);
        MyNode node10=new MyNode("10 Node",1);
        MyNode node11=new MyNode("11 Node",1);
        MyNode node12=new MyNode("12 Node",1);
        MyNode node101=new MyNode("101 Node",2);
        MyNode node121=new MyNode("121 Node",2);
        MyNode node122=new MyNode("122 Node",2);
        MyNode node123=new MyNode("123 Node",2);
        node.addTree(node10);
        node.addTree(node11);
        node.addTree(node12);
        node10.addTree(node101);
        node12.addTree(node121);
        node12.addTree(node122);
        node12.addTree(node123);
        node.show();
    }
}
