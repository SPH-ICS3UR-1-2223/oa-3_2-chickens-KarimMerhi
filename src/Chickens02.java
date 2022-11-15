public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
  // 	String dailyAverage="9000";
    //	String monthlyAverage="270000";
    	//String monthlyProfit="5000";	
        //System.out.println("Daily Average:   " +dailyAverage);
       // System.out.println("Monthly Average: " +monthlyAverage);
        //System.out.println("Monthly Profit:  $" +monthlyProfit);
    	double monthlyAverage;
    	double dailyAverage;
    	double monthlyProfit;
    	int eggCount=0;
    	eggCount+=100;
    	eggCount+=121;
    	eggCount+=117;
    	dailyAverage=eggCount/3;
    	monthlyAverage=dailyAverage*30;
    	monthlyProfit=monthlyAverage*0.18;
    	System.out.println(monthlyProfit);
    }
    
}
