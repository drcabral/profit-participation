import java.util.HashMap;

public class Constants {
    public static final HashMap<String, Integer> OCCUPATION = new HashMap<>(){
        {
            put("TRAINEE", 1);
            put("ANALYST", 2);
            put("MANAGER", 3);
        }
    };
    public static final double profitPercentage = 0.4;
    public static final double thresholdValue = 10000;
}