package com.pattern.facade;

/**
 * @author Yong
 * @date 2021/2/7
 */
public interface LetterProcess {

    void writeContext(String context);

    void fillEnvelope(String address);

    void letterIntoEnvelope();

    void sendLetter();
}
