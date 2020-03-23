package gp.strategy;

import gp.strategy.machine.BaseCopyMachine;
import gp.strategy.machine.JDCopyMachine;
import gp.strategy.machine.TaoBaoCopyMachine;
import gp.strategy.machine.TiMailCopyMachine;
import gp.strategy.machine.VvicCopyMachine;
import gp.strategy.machine.ZwdCopyMachine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ¶öººÊ½
 */
public class CopyMachineFactory {
    private   static Map<BaseCopyMachine.CopyMachineType,BaseCopyMachine> map= new HashMap<BaseCopyMachine.CopyMachineType, BaseCopyMachine>();
    static {
        map.put(JDCopyMachine.getType(),new JDCopyMachine());
        map.put(TaoBaoCopyMachine.getType(),new TaoBaoCopyMachine());
        map.put(TiMailCopyMachine.getType(),new TiMailCopyMachine());
        map.put(VvicCopyMachine.getType(),new VvicCopyMachine());
        map.put(ZwdCopyMachine.getType(),new ZwdCopyMachine());
    }
    private  CopyMachineFactory (){}
    public static  BaseCopyMachine getMachine(BaseCopyMachine.CopyMachineType type){
       return  map.get(type);
    }
}
