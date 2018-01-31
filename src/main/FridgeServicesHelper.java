package main;

/**
 * Created by ejerwit on 31/01/18.
 */
public class FridgeServicesHelper {

    private Fridge store;
    public FridgeServicesHelper() {
        store = new Fridge();
    }

    public boolean store(FridgeStorable obj) {
        store.put(obj);
        return true;
    }
}
