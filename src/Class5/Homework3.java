package Class5;

public class Homework3 {

    public static void main(String[] args) {

        /**
     * Store your full name in a variable, and display the following:
     *     1. Display length of the first name.
     *     2. Does your last name starts with "K" (Ignoring cases)
     *     3. print the last alphabet of your first name
     *     4. Does your last name ends with "M" (Ignoring cases)
     */

        // #1.

        String fullName= "Nusrat Jahan";
        String[] names = fullName.split(" ");
        String firstName = names[0];
        String lastName = names[1];
        System.out.println("length of my first name " + firstName +  " is " +  firstName.length());


        //#2.
        String lastName1 = "Jahan";
        char firstCharOfLastName = lastName.charAt(0);
        System.out.println("My last name starts with: " + firstCharOfLastName);
        boolean lastNameStartsWith = lastName.substring(0).equalsIgnoreCase("K");
        System.out.println("Does my last name starts with 'K': " + lastNameStartsWith);


        //#3.
        char lastCharOfFirstName = firstName.charAt(5);
        System.out.println("Last alphabet of my first name is: " + lastCharOfFirstName);

        //#4.
        boolean lastNameEndsWith = lastName.substring(5).equalsIgnoreCase("M");
        System.out.println("Does my last name ends with 'M': " + lastNameEndsWith);

        /**
         * String myStatment = "I am a good programmer";
         * Use string methods to do following tasks:
         * 	1. Display the total number of words in the myStatement.
         * 	2. replace all the 'r' characters with 'f' characters.
         */
        //#1
        String myStatement = "I am a good programmer";
        String[] words = myStatement.split(" ");
        int wordsCount = words.length;
        System.out.println("In 'MyStatement' total number of words are " +wordsCount);


        //#2.
        String myStatement1 = "I am a good programmer";
        String myStatementReplace = myStatement1.replace('r','f');
        System.out.println("After replacing all the 'r' with 'f', new value is: " + myStatementReplace);

        /**
         * Store your first name in a string variable.
         * Calculate the length of your first name, without using length() method of String class.
         */

        String fName = "Nusrat";
        int fNameL = fName.lastIndexOf("");
        System.out.println("Length of first name is : " + fNameL);



        /**
         *
         * String strNew = "hello dear, how are you?";
         *
         * Assign result (boolean) as true if length of strNew if greater than 10
         * else assign false.
         *
         * print the result value.
         *
         */
        String strNew = "hello dear, how are you?";
        boolean result = strNew.length()>10;
        System.out.println("Length of 'strNew' is greater than 10: " + result);



        /**
         * String threeWordsSentence =  "hApPY nEW yeAr";
         * sout(threeWordsSentence);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence);  // Happy New Year
         *
         */
        String threeWordSen = "hApPy nEw yEaR";

        String[] word = threeWordSen.split(" ");
        String st1 = word[0];
        String st2 = word[1];
        String st3 = word[2];

        st1 = st1.substring(0,1).toUpperCase() + st1.substring(1).toLowerCase();
        st2 = st2.substring(0,1).toUpperCase() + st2.substring(1).toLowerCase();
        st3 = st3.substring(0,1).toUpperCase() + st3.substring(1).toLowerCase();

        System.out.println(st1 + " " + st2 + " " + st3);



        /**
         * Create abbreviation:
         * String threeWordsSentence =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */

          String threeWordsSentence2 = "Lab sessIONS clAsses";
          String[] afterS = threeWordsSentence2.split(" ");
          String  one = afterS[0];
          String two = afterS [1];
          String three = afterS [2];

         String lab = one.substring(0,1);

        two = two.substring(0,1).toUpperCase();
        three = three.substring(0,1).toUpperCase();
        String av = lab+two+three;

        System.out.println(av);









    }


}


