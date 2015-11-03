package com.epam.com.patternsproject.behavioral.mediator;

import java.util.ArrayList;

/**
 * Created by taras on 03.11.15.
 */
public class ControlTower implements Mediator {

    private ArrayList<Colleague> colleagueList;

    public ControlTower() {
        super();
        colleagueList = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagueList.add(colleague);
    }

    @Override
    public void send(String message, Colleague colleagueSender) {
        for (Colleague colleague : colleagueList) {
            if (colleague != colleagueSender)
                colleague.recive(message+ " by "+ colleagueSender.toString());
        }
    }

}
