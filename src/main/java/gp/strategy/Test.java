package gp.strategy;

import gp.strategy.machine.BaseCopyMachine;
import gp.strategy.pojo.item;

public class Test {

    public static void main(String[] args) {
        BaseCopyMachine jdMachine = CopyMachineFactory.getMachine(BaseCopyMachine.CopyMachineType.JD);
        item copy = jdMachine.copy("https://item.jd.com/66759898112.html");

        BaseCopyMachine tiMailMachine = CopyMachineFactory.getMachine(BaseCopyMachine.CopyMachineType.TIMAIL);
        item copy2 = tiMailMachine.copy("https://detail.tmall.hk/hk/item.htm?spm=a1z10.1-b-s.w5003-22558018313.13.27826811J8t7nq&id=604214845878&scene=taobao_shop");
    }
}
