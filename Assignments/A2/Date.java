/** Program: Date - Object
	Author(s): Tom Stutler
	Last Date Modified: 9/18/15
*/

import java.util.Scanner;

public class Date
{
    private int month;
    private int day;
    private int year; //a four digit number.

    public Date( )
    {
        month = 1;
        day = 1;
        year = 1000;
    }

    public Date(int monthInt, int day, int year)
    {
        setDate(monthInt, day, year);
    }

    public Date(String monthString, int day, int year)
    {
        setDate(monthString, day, year);
    }

    public Date(int year)
    {
        setDate(1, 1, year);
    }

    public Date(Date aDate)
    {
        if (aDate == null)//Not a real date.
        {
             System.out.println("Fatal Error.");
             System.exit(0);
        }

        month = aDate.month;
        day = aDate.day;
        year = aDate.year;
    }

    public void setDate(int monthInt, int day, int year)
    {
        if (dateOK(monthInt, day, year))
        {
            this.month = monthInt;
            this.day = day;
            this.year = year;
        }
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public void setDate(String monthString, int day, int year)
    {
        if (dateOK(monthString, day, year))
        {
        	if (monthString.equals("January"))
		        this.month = 1;
		    else if (monthString.equals("February"))
		        this.month = 2;
		    else if (monthString.equalsIgnoreCase("March"))
		        this.month = 3;
		    else if (monthString.equalsIgnoreCase("April"))
		        this.month = 4;
		    else if (monthString.equalsIgnoreCase("May"))
		        this.month = 5;
		    else if (monthString.equals("June"))
		        this.month = 6;
		    else if (monthString.equalsIgnoreCase("July"))
		        this.month = 7;
		    else if (monthString.equalsIgnoreCase("August"))
		        this.month = 8;
		    else if (monthString.equalsIgnoreCase("September"))
		        this.month = 9;
		    else if (monthString.equalsIgnoreCase("October"))
		        this.month = 10;
		    else if (monthString.equals("November"))
		        this.month = 11;
		    else if (monthString.equals("December"))
		        this.month = 12;
		    else
		    {
		        System.out.println("Fatal Error");
		        System.exit(0);
		    }
		    
            this.day = day;
            this.year = year;
        }
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public void setDate(int year)
    {
        setDate(1, 1, year);
    }

    public void setYear(int year)
    {
        if ( (year < 1000) || (year > 9999) )
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.year = year;
    }
    
    public void setMonth(int monthNumber)
    {
        if ((monthNumber <= 0) || (monthNumber > 12))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            month = monthNumber;
    }

    public void setDay(int day)
    {
        if ((day <= 0) || (day > 31))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.day = day;
    }

    public int getMonth( )
    {
        return month;
    }

    public int getDay( )
    {
        return day;
    }

    public int getYear( )
    {
        return year;
    }

    public String toString( )
    {
        return (monthString(month) + " " + day + ", " + year);
    }

    public boolean equals(Date otherDate)
	{
	    if (otherDate == null)
	        return false;
	    else
	        return ( (month == otherDate.month) &&
	            (day == otherDate.day) && (year == otherDate.year) );
    }

    public boolean precedes(Date otherDate)
    {
        return ( (year < otherDate.year) ||
           (year == otherDate.year && month < otherDate.month) ||
           (year == otherDate.year && month == otherDate.month
                                         && day < otherDate.day) );
    }

    public void readInput( )
    {
        boolean tryAgain = true;
        Scanner keyboard = new Scanner(System.in);
        while (tryAgain)
        {
            System.out.println("Enter month, day, and year"
				+"on three lines as three integers.");
            int monthInput = keyboard.nextInt( );
            keyboard.nextLine();
            int dayInput = keyboard.nextInt( );
            keyboard.nextLine();
            int yearInput = keyboard.nextInt( );
            keyboard.nextLine();
            if (dateOK(monthInput, dayInput, yearInput) )
            {
                setDate(monthInput, dayInput, yearInput);
                tryAgain = false;
            }
            else
                System.out.println("Illegal date. Reenter input.");
         }
    }

    private boolean dateOK(int monthInt, int dayInt, int yearInt)
    {
        return ( (monthInt >= 1) && (monthInt <= 12) &&
                 (dayInt >= 1) && (dayInt <= 31) &&
                 (yearInt >= 1000) && (yearInt <= 9999) );
    }

    private boolean dateOK(String monthString, int dayInt, int yearInt)
    {
        return ( monthOK(monthString) &&
                 (dayInt >= 1) && (dayInt <= 31) &&
                 (yearInt >= 1000) && (yearInt <= 9999) );
    }

    private boolean monthOK(String month)
    {
        return (month.equals("January") || month.equals("February") ||
                month.equals("March") || month.equals("April") ||
                month.equals("May") || month.equals("June") ||
                month.equals("July") || month.equals("August") ||
                month.equals("September") || month.equals("October") ||
                month.equals("November") || month.equals("December") );
    }

    private String monthString(int monthNumber)
    {
        switch (monthNumber)
        {
        case 1:
            return "January";
        case 2:
            return "February";
        case 3:
            return "March";
        case 4:
            return "April";
        case 5:
            return "May";
        case 6:
            return "June";
        case 7:
            return "July";
        case 8:
            return "August";
        case 9:
            return "September";
        case 10:
            return "October";
        case 11:
            return "November";
        case 12:
            return "December";
        default:
            System.out.println("Fatal Error");
            System.exit(0);
            return "Error"; //to keep the compiler happy
        }
    }
}
