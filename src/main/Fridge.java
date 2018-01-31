package main;

/**
 * Created by ejerwit on 31/01/18.
 */
public class Fridge {

    public void put(FridgeStorable obj) {
        System.out.println("I'm storing some sort of object in the fridge!");
    }

    public void put(ExpirableFridgeStorable obj) {
        System.out.println("I'm storing an expirable object with an expiry date of " + obj.getTtl());
    }
}
