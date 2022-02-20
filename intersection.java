package com.company.newdaysgrowup;

public class intersection {
    public static void main(String[] args){
       int ar[]={1,2,3,4,5,6};
       int ar1[]={2,3,4,8,9};
       for(int i=0;i<ar.length;i++){
           for(int j=0;j<ar1.length;j++){
               if(ar[i]==ar1[j]){
                  System.out.println(ar[i]);

               }
           }
       }
    }
}
