package gp.strategy.machine;

import gp.strategy.pojo.item;

public class TaoBaoCopyMachine extends BaseCopyMachine{
    public item copy(String url) {
        System.out.println("淘宝页面："+url);
        System.out.println("通过JSoup爬虫获取相关信息，组装item");
        return new item();
    }

    public static CopyMachineType getType(){
        return  CopyMachineType.TAOBAO;
    }
}
