package Class3;

public class LabSession {
     public static void main(String[] args) {
         double mile = 1;
         double kilometer = 1;
         double mileIntoKm = mile * 1.609344;
         boolean convert = (1== kilometer);
         System.out.println("1  mile is");


         // do 4 hours contain 14400 seconds?
         int hour = 15;
         int second = 3000;
         int hourInSeconds = 60 * 60* hour;
         boolean compareXNumberOfSecond = second == hourInSeconds;
         System.out.println("do " + hour + " hours contain " + second + " seconds? " + compareXNumberOfSecond);

         int num1 = 25;
         int num2 = 25;
         boolean compareNum1andNum2 = num1==num2;
         System.out.println("num1 and num2 is even " +  compareNum1andNum2 );



     }
}
