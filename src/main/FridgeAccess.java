package main;

/**
 * Created by ejerwit on 31/01/18.
 */
public class FridgeAccess {

    public static void main(String[] args) {
        new FridgeServicesHelper().store(new ActualExpirable());
    }
}
