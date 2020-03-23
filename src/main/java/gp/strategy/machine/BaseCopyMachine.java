package gp.strategy.machine;

import gp.strategy.pojo.item;

public abstract class BaseCopyMachine {

   public abstract item copy(String url) ;

   public static CopyMachineType getType(){
       return  CopyMachineType.EMPTY;
   }

   public enum  CopyMachineType{
       JD,//¾©¶«
       TAOBAO,//ÌÔ±¦
       VVIC,//ËÑ¿îÍø
       ZWD,//
       TIMAIL,
       EMPTY
   }
}
