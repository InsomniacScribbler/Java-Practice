package FindMyTrain;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {
        TrainSystem system = new TrainSystem();
        // adding stations
        Station station1 = new Station("ST01", "Agra");
        Station station2 = new Station("ST02", "Delhi");
        Station station3 = new Station("ST03", "Patna");

        // adding new trains
        Train train1 = new Train("12451" , "Rajdhani", "Express");
        Train train2 = new Train("12452" , "Sampark Kranti", "Superfast");
        Train train3 = new Train("12453" , "MaalGaadi", "Goods");

        //platform numbers

        Platform p1 = new Platform(1);
        Platform p2 = new Platform(2);
        Platform p3 = new Platform(3);

        p1.setTrain(train1);
        p2.setTrain(train2);
        p3.setTrain(train3);

        List<Platform> pl1 = new ArrayList<>();
        pl1.add(p1);
        pl1.add(p2);

        station1.setPlatformList(pl1);



        Schedule s1 = new Schedule(train1, station1,"9AM","9:05AM", p1 );
        Schedule s2 = new Schedule(train1, station1,"10AM","10:02AM", p2 );

        system.addStations(station1);
        system.addStations(station2);
        system.addStations(station3);

        system.addTrains(train1);
        system.addTrains(train2);

        system.addSchedule(s1);
        system.addSchedule(s2);
        //FIND TRAINS
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter source :");
        String source = sc.nextLine();
        System.out.println("Enter Destination :");
        String destination = sc.nextLine();

        List<Schedule> myTrains = system.findMyTrains(source, destination);

        System.out.println("Your trains between given locations are");
        System.out.println(myTrains);
    }
}
