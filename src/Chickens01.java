public class Chickens01 {
    public static void main(String[] args) {
        int chickenCount=8;
    	int eggsPerChicken=4;
    	int totalEggs=0;
        totalEggs += eggsPerChicken*chickenCount;
        chickenCount++;
        totalEggs+=eggsPerChicken*chickenCount;
        chickenCount/=2;
        totalEggs+=eggsPerChicken*chickenCount;
        System.out.println(totalEggs);
    }   
}
