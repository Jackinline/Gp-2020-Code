package gp.singleton.test;

import gp.singleton.register.ContainerSingleton;

public class Test {
    public static void main(String[] args) {
        Object instance1 = ContainerSingleton.getInstance("gp.singleton.test.Pojo");
        Object instance2 = ContainerSingleton.getInstance("gp.singleton.test.Pojo");
        System.out.println(instance1 == instance2);
    }
}
