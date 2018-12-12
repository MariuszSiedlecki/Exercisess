package water;

public class MainWater {
    public static void main(String[] args) {
        MyWater myWater = new MyWater();
        System.out.println("Big bottle: " + myWater.addLargeBottle(100) + " piece");
        System.out.println("Middle bottle: " + myWater.addMediumBottle(5) + " piece");
        System.out.println("Small bottle: " + myWater.addSmallBottle(20) + " piece");

        System.out.println("We have: " + myWater.countBottleWater()+ " liter water ");
    }
}
