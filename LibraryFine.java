package com.practice;

public class LibraryFine 
{
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) 
    {
        int fine = 0;

        if(y1 == y2)
        {
            if(m1 == m2)
            {
                if(d1 == d2)
                {
                    fine = 0;
                }

                else if(d2 > d1)
                    fine = 0;

                else 
                    fine = 15 * (d1-d2);
            }

            else if(m2 > m1)
                fine = 0;

            else 
                fine = 500 * (m1-m2);
        }

        else if(y2 > y1)
            fine = 0;

        else
            fine = 10000;

        return fine;
    }

    public static void main(String[] args)
    {
        int d1 = 2;
        int m1 = 7;
        int y1 = 1014;
        int d2 = 1;
        int m2 = 1;
        int y2 = 1015;

        System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
    }
}
