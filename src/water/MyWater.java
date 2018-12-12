package water;

public class MyWater {


    private static double BIG_WATER = 2.0;
    private static double MIDDLE_WATER = 1.0;
    private static double SMALL_WATER = 0.5;

    private int countOfBig;
    private int countOfMiddle;
    private int countOfSmall;

    public int addLargeBottle(int howMany) {
        countOfBig += howMany;
        return countOfBig;
    }

    public int addMediumBottle(int howMany) {
        countOfMiddle += howMany;
        return countOfMiddle;
    }

    public int addSmallBottle(int howMany) {
        countOfSmall += howMany;
        return countOfSmall;
    }

    public double countBottleWater() {
        return countOfBig * BIG_WATER + countOfMiddle * MIDDLE_WATER + countOfSmall * SMALL_WATER;
    }

}
