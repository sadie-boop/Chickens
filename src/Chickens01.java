public class Chickens01 {
    public static void main(String[] args) {
        // first problem
        int totalEggs = 0;
        int chickensCount = 3;
        int eggsPerChickens = 5;

        // Monday
        totalEggs = countEggs(eggsPerChickens, chickensCount);

        // Tuesday
        ++chickensCount;
        totalEggs += countEggs(eggsPerChickens, chickensCount);


        //Wednesday
        chickensCount /=2;
        //System.out.println(chickensCount);
        totalEggs += countEggs(eggsPerChickens, chickensCount);


        System.out.println(totalEggs);
    }

    //calculates totalEggs
    public static int countEggs(int eggsPerChickens, int chickensCount){
        return eggsPerChickens *chickensCount;
    }
}
