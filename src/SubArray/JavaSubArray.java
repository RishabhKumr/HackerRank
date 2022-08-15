package SubArray;

import java.io.*;
import java.util.*;

public class JavaSubArray {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0; i< size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i =0;i < size;i++)
        {
            int sum = 0;
            for(int j = i; j <size;j++)
            {
                sum = sum + arr[j];
                if(sum < 0)
                {
                    count = count+1;
                }
            }
        }
        System.out.println(count);
    }
}