package AppLogic;

public class Utils {
    public String correctCapitalization (String str) {
        String cap = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return cap;
    }
}
