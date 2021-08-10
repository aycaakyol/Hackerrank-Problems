package com.practice;

public class RepeatedString 
{
    public static long repeatedString(String s, long n) 
    {
        long ans = 0;
        long l = s.length();
        long aCount = 0;

        if(s.contains("a"))
        {
            for(int i = 0; i < l; i++)
            {
                if(s.charAt(i) == 'a')
                    aCount++;
            }

            ans += aCount*(n/l);

            for(int i = 0; i < n%l; i++)
            {
                if(s.charAt(i) == 'a')
                    ans++;
            }

            return ans;
        }

        else 
            return 0;
    }
}
