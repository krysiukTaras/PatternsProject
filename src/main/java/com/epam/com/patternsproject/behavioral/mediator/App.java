package com.epam.com.patternsproject.behavioral.mediator;

/**
 * Created by taras on 03.11.15.
 */
public class App {

    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower();
        Colleague boing = new Boing();
        Colleague helicopter = new Helicopter();

        controlTower.addColleague(boing);
        controlTower.addColleague(helicopter);


        controlTower.send("Get out of my line", boing);
    }


}