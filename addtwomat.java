package com.company.newdaysgrowup;

public class addtwomat {
    public static void main(String[] args) {
        int ar1[][]={{1,2,3,},{4,5,6},{7,8,9}};
        int ar2[][]={{2,1,3},{5,4,6},{8,7,9}};
        int sum[][]=new int[3][3];
        if(ar1.length==ar2.length){
        for( int i=0;i<ar1.length;i++){
            for(int j=0;j<ar1.length;j++) {

                sum[i][j] = ar1[i][j] + ar2[i][j];
                System.out.print(sum[i][j] + " ");

            }
            System.out.println();

           }
        }else{
            System.out.println("both matrix are not same");
        }
    }}

