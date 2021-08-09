package com.practice;

import java.util.ArrayList;

public class TwoStrings 
{
    public static String twoStrings(String s1, String s2) 
    {
        ArrayList<Character> l1 = new ArrayList<>();
        ArrayList<Character> l2 = new ArrayList<>();
        int ans = 0;

        for(int i = 0; i < s1.length(); i++)
        {
            if(!(l1.contains(s1.charAt(i))))
                l1.add(s1.charAt(i));
        }

        for(int i = 0; i < s2.length(); i++)
        {
            if(!(l2.contains(s2.charAt(i))))
                l2.add(s2.charAt(i));
        }

        for(int i = 0; i < Math.min(l1.size(),l2.size()); i++)
        {
            if(l1.size() ==  Math.min(l1.size(),l2.size()))
            {
                if(l2.contains(l1.get(i)))
                    ans++;
            }

            else 
            {
                if(l1.contains(l2.get(i)))
                    ans++;
            }
        }

        if(ans > 0)
            return "YES";
        else 
            return "NO";
    }
}
