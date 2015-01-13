import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int countGrowth(int cycles){
        int counter = 1;
        int height = 1;
        while (counter <= cycles){
            if(counter%2 == 1)
                height *= 2;
            else
                height += 1;
            counter++;
        }
        return height;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T;
        T = in.nextInt();
        int[] result = new int[T];
        for (int i = 0; i<T; i++){
            int N;
            N = in.nextInt();
            int treeHeight;
            treeHeight = countGrowth(N);
            result[i] = treeHeight;
        }
        for (int j = 0; j<result.length; j++)
            System.out.println(result[j]);
    }
}
