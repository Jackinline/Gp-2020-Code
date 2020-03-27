package gp.command.ftp;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

//        new Thread(()->{
        Scanner scanner = new Scanner(System.in);
        Invoker invoker = new Invoker();
        while (scanner.hasNextLine()){
            String input = scanner.next();
            if("quit".equals(input)){
                break;
            }
            if("start".equals(input)){
                start(invoker);
            }
            if("stop".equals(input)){
                invoker.closeRunning=true;
            }
            if("--".equals(input)){
                invoker.removeLastOneCommand();
                continue;
            }
            if("show".equals(input)){
                invoker.show();
            }
            boolean isAdd="+".equals(input.substring(0,1));
            boolean isRemove="-".equals(input.substring(0,1));
            String command = input.substring(1 );
            if (Invoker.map.containsKey(command)) {
                if(isAdd) {
                    invoker.addCommand(Invoker.map.get(command));
                }else if(isRemove){
                    invoker.removeCommand(Invoker.map.get(command));
                }
            }
        }
//        }).start();
    }

    public static  void start(Invoker invoker){
        new Thread(invoker::Running).start();

    }
}
