package com.epam.com.patternsproject.behavioral.mediator;

/**
 * Created by taras
 */
public interface Mediator  {

    void send(String message, Colleague colleagueSender);

}
