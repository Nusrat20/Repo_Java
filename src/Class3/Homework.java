package Class3;

public class Homework {
    public static void main(String [] args){
        double fTemp = 89;
        double cTemp = (fTemp-32) * 5/9; // used conversion  formula from the web
        System.out.println(fTemp + " deg F is eqal to " + cTemp + " deg C");
        double fTemp1 = 79;
        double kTemp = (fTemp1-32) * 5/9 + 273.15;
        System.out.println(fTemp1 + " deg F is equal to " + kTemp + " deg K " );
        double kTemp1 = 100;
        double cTemp1 = 100 - 273.15;
        System.out.println(kTemp1 + " K temp is equal to " + cTemp1 + " deg C ");
        double kTemp2 = 30;
        double fTemp2 = (kTemp2 - 273.15) * 9/5 + 32;
        System.out. println(kTemp2 + " K temp is equal to " + fTemp2 + " deg F " );
        double cTemp2 = 20;
        double fTemp3 = (cTemp2 * 9/5) + 32;
        System.out.println(cTemp2 + " deg C is equal to " + fTemp3 + " deg F");
        double cTemp3 = 15;
        double kTemp3 = 15 + 273.15;
        System.out.println(cTemp3 + " deg C is equal to " + kTemp3 + " K temp ");



    }
}
