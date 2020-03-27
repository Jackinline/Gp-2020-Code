package gp.command.ftp;

import gp.command.ftp.command.Command;
import gp.command.ftp.command.DownloadCommand;
import gp.command.ftp.command.UploadCommand;
import gp.command.ftp.command.logOutCommand;
import gp.command.ftp.command.loginCommand;
import gp.command.ftp.receive.IReceive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.prefs.Preferences;
import java.util.stream.Collectors;

public class Invoker {
    final transient ReentrantLock lock = new ReentrantLock();
    ArrayList<Command> lists = new ArrayList<>();
    public static   HashMap<String, Command> map = new HashMap<>();

    public  volatile boolean closeRunning=false;
      static {
        map.put("login", new loginCommand());
        map.put("logout", new logOutCommand());
        map.put("upload", new UploadCommand());
        map.put("download", new DownloadCommand());
    }


    public void addCommand(Command command) {
//        final ReentrantLock lock = this.lock;
        this.lock.lock();
        try {
            lists.add(command);
            System.out.println("加入命令： "+command.getClass().getSimpleName());
        } finally {
            lock.unlock();
        }

    }

    public void removeCommand(Command command) {
        final ReentrantLock lock = this.lock;
        lock.lock();
        if(lists.size()==0){
            return ;
        }
        try {
            int[] postion = {0};
            lists = (ArrayList<Command>) lists.stream().filter(v -> {
                //全部命令都来自map对象，所以直接用==
                if (command == v && postion[0] == 0) {
                    postion[0]++;
                    return false;
                }
                return true;
            }).collect(Collectors.toList());
            System.out.println("撤销命令  "+command.getClass().getSimpleName());
        } finally {
            lock.unlock();
        }
    }

    public Command removeLastOneCommand() {
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            Command remove = lists.remove(lists.size() - 1);
            System.out.println("撤销命令  "+remove.getClass().getSimpleName());
            return remove;
        } finally {
            lock.unlock();
        }
    }

    public Command removeStartOneCommand() {

        final ReentrantLock lock = this.lock;
        lock.lock();
        if(lists.size()==0){
            return null;
        }
        try {
            Command remove = lists.remove(0);
            System.out.println("撤销命令  " + remove.getClass().getSimpleName());
            return remove;

        } finally {
            lock.unlock();
        }
    }

    public void show(){
        lists.forEach(v->System.out.println(v.getClass().getName()));
    }

    public void Running() {
        try {
            while (true) {
                if(closeRunning){
                    System.out.println("关闭Running，暂停");
                    closeRunning=false;
                    break;
                }
                if (lists.size() > 0) {
                    Command command = removeStartOneCommand();
                    System.out.println("Running---------处理命令："+command.getClass().getSimpleName());
                    TimeUnit.SECONDS.sleep(3);
                    command.execute();
                }else{
                    System.out.println("Running---------命令为空等待命令");
                    TimeUnit.SECONDS.sleep(6);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
