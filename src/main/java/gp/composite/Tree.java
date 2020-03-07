package gp.composite;

public abstract class Tree {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void show( );
}
