public class Multiples
{
    //----------------------------------------------------
    // Prints multiples of a user-specified number up to
    // a user-specified limit.
    //----------------------------------------------------

    public static void main (String[] args)
    {
        final int PER_LINE = 5;

        printMultiples (5, 100, PER_LINE);

        printMultiples (2, 20, PER_LINE);

        printMultiples (3, 33, PER_LINE);
    }//End main method

    public static void printMultiples (int start, int upperLimit, int numPerLine)
    {
        int mult, count = 0;

        System.out.println ("\nThe multiples of " + start + " between " +
                start + " and " + upperLimit + " (inclusive) are: ");

        for (mult = start; mult <= upperLimit; mult += start)
        {
            System.out.print (mult + "\t");
            //Print a specific number of values per line of output

            count++;

            if (count % numPerLine == 0)
            {
                System.out.println();
            }//End if
        }//End for loop
    }//End method to calculate and print the multiples
}//End class Multiples
