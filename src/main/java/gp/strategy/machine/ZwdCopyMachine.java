package gp.strategy.machine;

import gp.strategy.pojo.item;

public class ZwdCopyMachine extends BaseCopyMachine{
    public item copy(String url) {
        System.out.println("17��ҳ�棺"+url);
        System.out.println("ͨ��JSoup�����ȡ�����Ϣ����װitem");
        return new item();
    }

    public static CopyMachineType getType(){
        return  CopyMachineType.ZWD;
    }
}