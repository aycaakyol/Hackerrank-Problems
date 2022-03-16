import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CoinChange {
    public static long getWays(int n, List<Long> c, int m) { // n is the value we want to reach and c is the list of coins
        long[] arr = new long[n+1];
        arr[0] = 1;

        for(int i = 0; i < m; i++) {
            for(int j = c.get(i); j <= n; j++) {
                arr[j] += arr[j - c.get(i)];
            }
        }

        return arr[n];
    }    

    public static void main(String[] args) {
    }
}