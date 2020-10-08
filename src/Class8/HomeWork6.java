package Class8;

public class HomeWork6 {
    public static void main(String[] args) {

        System.out.println("Average of the given numbers are : " + average() );

        indexOf();



    }

    public static double average() {


        /**
         * Create a method to find average of an int-array
         *
         */
        //public static void arrayAvg(int[] arr) {

        // write code to find average
        // Decide on the return type
        // 22, 11, 33, 44, 55
        // add all / total number


        double[] ave = {22, 11, 33, 44, 55};
        double sum = 0;

        for (int a = 0; a < ave.length; a++) {
            sum = sum + ave[a];
        }

        double average = sum / ave.length;
        return average;
    }

    public static void indexOf(){
        /**
         *
         * String[] names = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"}
         * String nameToSearch = "philip";
         * Create a method (NO return) that will print the index of given name in the given array
         *
         */
        String[] names = {"john", "michael", "gphilipppre", "philip", "ilena", "palena", "fahry"};
        int index = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == "philip")
                index = i;
        }
        System.out.println("Index of the name 'philip' is : " + index);

    }

}











