package com.pattern.facade;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class LetterProcessImpl implements LetterProcess{
    @Override
    public void writeContext(String context) {
        System.out.println("Letter Context: " + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("Letter's address: " + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("the letter has put into envelope.");
    }

    @Override
    public void sendLetter() {
        System.out.println("the letter has been sent");
    }
}
