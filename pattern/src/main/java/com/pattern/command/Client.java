package com.pattern.command;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class Client {

    public static void command1() {
        System.out.println("[command] let American greet to everyone.");
        Invoker invoker = new Invoker();
        Receiver receiver = new AmericanReceiver();
        Command command = new GreetCommand(receiver);
        invoker.setCommand(command);
        invoker.action();
    }

    public static void command2() {
        System.out.println("[command] let Chinese greet to everyone.");
        Invoker invoker = new Invoker();
        Receiver receiver = new ChineseReceiver();
        // 命令通常是一次性
        Command command = new GreetCommand(receiver);
        invoker.setCommand(command);
        invoker.action();
    }

    public static void letDo(String command) {
        int i = command.indexOf("let ") + 4;
        int j = command.indexOf(' ', i);
        int k = command.indexOf(' ', j + 1);
        String role = command.substring(i, j);
        String action = command.substring(j + 1, k);

        if("Chinese".equals(role) && "greet".equals(action)) {
            command2();
        }
        if("American".equals(role) && "greet".equals(action)) {
            command1();
        }
    }

    public static void main(String[] args) {
        System.out.println("[command] = Let [role] do [action]\n");
        letDo("[command] let American greet to everyone.");
        System.out.println();
        letDo("let Chinese greet to everyone.");
    }
}
