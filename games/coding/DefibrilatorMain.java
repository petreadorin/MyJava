package games.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DefibrilatorMain {

    public static void main(String args[]) {
        ArrayList<Defibrilator> list = new ArrayList<Defibrilator>();
        Defibrilator def0 = new Defibrilator(0, 25, 25);
        def0.SetName("SUJVA");
        Defibrilator def1 = new Defibrilator(1, 50, 50);
        Defibrilator def2 = new Defibrilator(2, 75, 75);
        list.add(def0);
        list.add(def1);
        list.add(def2);


        double userLon = 12;
        double userLat = 12;

        double minDistance = Double.MAX_VALUE;
        for (Defibrilator item : list)
        {
            if (minDistance > item.CalculateDistance(userLon, userLat))
            {
                minDistance = item.CalculateDistance(userLon, userLat);
            }
            System.out.println("Min distance " + item.GetId()+ " is: " + item.CalculateDistance(userLon, userLat));
        }
        System.out.println("Min distance EVER is: " + minDistance);

    }

}