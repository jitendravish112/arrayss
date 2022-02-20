package com.company.newdaysgrowup;
import java.util.Scanner;
public class spiralorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.print("enter the numbbeer of rows  :  ");
        m=sc.nextInt();
        System.out.print("Enter the number of columms  :  ");
        n=sc.nextInt();
        int  ar[][]=new int[m][n];
       System.out.print("enter the number of element  :  ");
        for(int i=0;i<m;i++) {

            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();

            }

        }
        int w = 0;
        int x = ar.length-1;
        int y = 0;
        int z = ar[0].length-1;
        while(w <= x && y <= z){
            for (int i = w; i <= z; i++) {
                System.out.print(ar[w][i] + " ");
            }
            for (int i = w+1; i <= x; i++) {
                System.out.print(ar[i][z] + " ");
            }
            if(w+1 <= x){
                for (int i = z-1; i >= y; i--) {
                    System.out.print(ar[x][i] + " ");
                }
            }
            if(y+1 <= z){
                for (int i = x-1; i > w; i--) {
                    System.out.print(ar[i][y] + " ");
                }
            }
            w++;
            x--;
            y++;
            z--;
        }
    }
}