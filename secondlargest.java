package com.company.newdaysgrowup;

public class secondlargest {
    public static void main(String[] args) {
        // int ar[]={1,2,3,4,5,6,7};
        int ar[] = {21, 71, 302, 456, 54, 65,888};
        int temp;
   int     max=ar[0];
      for ( int i = 0; i < ar.length; i++) {
          for (int j = i + 1; j < ar.length; j++)
              if (ar[i] > ar[j]) {
                  temp = ar[i];
                  ar[i] = ar[j];
                  ar[j] = temp;}
                  if (max <ar[i]) {
                      max = ar[i];
         // System.out.println(ar[i]+" "+ar[j]+" "+temp);
      }}
        System.out.println("first largest number"+" "+max);
        System.out.println("second largest number"+" "+ar[ar.length-2]);
    }
}
