public class palindrome {
    /**
     *  Most compact code version
     *
     *  public static boolean isPalindrome(String stringToCheck){
     *      StringBuilder reverseStringToCheck = new StringBuilder(stringToCheck);
     *      return stringToCheck.equals(reverseStringToCheck.reverse().toString());
     *  }
     *
     * This next way to write this methos is a bit more long winded, but really more readable
     * for a third developer or for myself after long time pasts.
     * I don't like compact code like this:
     *
     *
     * */

    /*
        Most compact in more readable way
    
        public static boolean isPalindrome( String stringToCheck ){
            boolean result = false;
            StringBuilder reverseStringToCheck = new StringBuilder( stringToCheck.toLowerCase() );
            if( stringToCheck.toLowerCase().equals( reverseStringToCheck.reverse() ) ){
                result = true;
            }
            return result;
        }
    */

     /**
     *
     * Most efficent code version in term of time esecution time.
     * In the best case (No palindrome string) the loop ends at the first circle because the method processes only the first char.
     *In the worst case (palindrome string) the method processes only half string.
     *
     **/

    public static boolean isPalindrome(String stringToCheck){
        char[] charsToCheck = stringToCheck.toCharArray();

        int i1 = 0;
        int i2 = charsToCheck.length - 1;
        while (i2 > i1) {
            if (charsToCheck[i1] != charsToCheck[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

    public static void main( String[] args ) {
        String result = "";
        String[] myStrings;

        //My strings array to check
        myStrings = new String[]{
                "Rotor",
                "aNnA",
                "step on no pets",
                "Java",
                "121",
                "Xanax",
                "1 xanax 1",
                "1 xanax 2"
        };

        for ( String oneString : myStrings ) {

            if( ! isPalindrome( oneString ) ){
                result = "not";
            }

            System.out.println(String.format( "'%s' is %s a palindrome", oneString, result ) );
        }

    }

}
