package com.practice;

import java.util.ArrayList;
import java.util.List;

public class HalloweenSale 
{
    public static int howManyGames(int p, int d, int m, int s) 
    {
        int ans = 0;
        int price = p;

        while(s > 0)
        {
            if(price < m)
                price = m;

            if(price == m)
            {
                if(s >= price)
                {
                    ans++;
                    s -= price;
                }

                else 
                    s = 0;
            }

            else 
            {
                if(s >= price)
                {
                    ans++;
                    s -= price;
                    price -= d;
                }

                else 
                    s = 0;
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        System.out.println(howManyGames(20, 3, 6, 70));
    }
}
