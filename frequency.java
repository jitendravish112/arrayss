package com.company.newdaysgrowup;
import java.util.Scanner;
public class frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("Enter number of rows in matrix:");
        m = sc.nextInt();

        System.out.print("Enter number of columns in matrix:");
        n = sc.nextInt();

        int arr[][] = new int[m][n];  //Declare a Matrix
        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("The Original Matrix:");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        int even=0,odd=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
        }
        System.out.println("Total odd number in the matrix:>> " + odd);
        System.out.println("Total even number in the matrix: >" + even);

    }
}

