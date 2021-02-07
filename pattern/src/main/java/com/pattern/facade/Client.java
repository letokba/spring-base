package com.pattern.facade;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class Client {

    public static void unusedFacade() {
        System.out.println("I need to execute all steps when I want to send a letter.\n");
        LetterProcess process = new LetterProcessImpl();
        process.writeContext("Hello Facade Pattern");
        process.fillEnvelope("Shanghai, China");
        process.letterIntoEnvelope();
        process.sendLetter();
    }

    public static void useFacade() {
        System.out.println("I am trying to use the Facade Pattern, it's like black-box!\n");
        PostOfficeFacade facade = new PostOfficeFacade();
        String context = "Hello Facade Pattern";
        String address = "Shanghai, China";
        facade.sendLetter(context, address);
    }

    public static void main(String[] args) {
        unusedFacade();
        System.out.println();
        useFacade();
    }
}
