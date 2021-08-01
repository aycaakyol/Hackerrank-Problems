package com.practice;

public class ChocolateFeast 
{
    public static int chocolateFeast(int n, int c, int m) 
    {
        int ans  = 0;               //n para c fiyat m koşul
        int left = 0; 
        int org = 0;
        int bought = n/c;
        ans += bought;

        while(left+bought >= m)
        {
            org = bought+left;
            bought =  (bought + left)/m;
            left = org - bought*m; 
            ans += bought;
        }

        if(ans == 0)
            ans = bought;

        return ans;
    }
}
