package com.epam.com.patternsproject.behavioral.mediator;

/**
 * Created by taras on 03.11.15.
 */
public interface Mediator  {

    void send(String message, Colleague colleagueSender);

}
