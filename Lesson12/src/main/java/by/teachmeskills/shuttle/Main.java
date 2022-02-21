package by.teachmeskills.shuttle;

import by.teachmeskills.shuttle.start.IStart;
import by.teachmeskills.shuttle.start.Nasa;
import by.teachmeskills.shuttle.start.RosCosmos;
import by.teachmeskills.shuttle.start.SpaceX;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SpasePort spasePort = new SpasePort();

        IStart rosCosmos = new RosCosmos();
        IStart nasa = new Nasa();
        IStart spaceX = new SpaceX();

        spasePort.start(rosCosmos);
        spasePort.start(nasa);
        spasePort.start(spaceX);
    }
}
