package com.pattern.facade;

/**
 * @author Yong
 * @date 2021/2/7
 */
public class PostOfficeFacade {
    private final LetterProcess letterProcess;

    public PostOfficeFacade() {
        this.letterProcess = new LetterProcessImpl();
    }

    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }

}
