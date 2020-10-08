package Class7;

public class HomeWork5 {
    public static void main(String [] args){


        // Subject - Homework-5
        //
        //        /**
        //         * Write code/method to return abbreviation for any given string
        //         * Example: String msg = "Outfit of the day"
        //         * Expected: OOTD   // GM HAGDTY
        //         * String msg = "have a great day to you"
        //         *
        //         code
        //         *
        //         * sout("Abbreviation : " + abr);
        //         */

        String msg = " have a great day to you";
        String bbr = "";
        String[] words = msg.split(" ");
        System.out.println(words);

        for(int i = 1;i<words.length-1;i++){
            bbr += words[i].charAt(0);

        }
        String bbr1 = bbr.toUpperCase();
        System.out.println("Abbrevation : " + bbr1 );



        //        String msg = "have happy and prosperous life";
        //        String abr = "";
        //        code
        //        System.out.println("Abbreviation: " + abr);     // HHAPL


        String msg3 = "have happy and prosperous life";
        String abra = "";
        String arr[] = msg3.split(" ");// when I use string arr[] it gave me HHAPL
        for (int i = 0; i <= arr.length - 1; i++) {
            abra = abra + arr[i].charAt(0);
        }
        System.out.println("Abbreviation: " + abra.toUpperCase());     // HHAPL



             String msg2 = "have a happy and prosperous life";
             String abr= "";
             String [] words1 = msg2.split(" ");// But this is giving me HAHAPL, Why?
             for(int i = 0; i <= words1.length - 1; i++){
                 abr = abr + words1[i].charAt(0);
             }
             System.out.println( "Abreviation : " + abr.toUpperCase());




        //        /**
        //         * Change the string to title case
        //         */
        //        String line = "once upOn a tiMe in the UNIVERSE";   //  Once Upon A Time In The Universe
        //        System.out.println("Line (Before modification) : " + line);
        //        // code
        //        System.out.println("Line (After modification) : " + line);


              String line = "once upOn a tiMe in the UNIVERSE";
              System.out.println("Line (before modification) : " + line);
              String[] modif = line.toLowerCase().split(" ");
              line = "";
              for(int m = 0;m<modif.length;m++){
                  line = line +  " "  + modif[m].substring(0,1).toUpperCase()+modif[m].substring(1);

              }
              line = line.trim();
              System.out.println("Line (After modification ) : " + line);




        //
        //
        //        /**
        //         * reverse a string
        //         */
        //        String message = "happy holidays"; //syadiloh yppah
        //        String reverseMessage = "";
        //        System.out.println("Message : " + message);
        //        // code
        //        System.out.println("Message in reverse: " + reverseMessage);    // syadiloh yppah



        String message = "happy holidays";
        String reverseMessage = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reverseMessage = reverseMessage + message.charAt(i);}
            System.out.println("Message in reverse: " + reverseMessage);




    }

}
















