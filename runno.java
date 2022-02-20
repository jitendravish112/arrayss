package com.company.newdaysgrowup;
public class runno {
    public static void main(String[] args) {
//int numbers[]={5,6,7,8,9,11,23,42,21};
        int numbers[] = {1, 2, 3, 4, 5};
        sumoafar(numbers);
    }

   public static void sumoafar(int numbers[]) {
        int sum = 0;
int add=0;
        for (int  i = 0; i < numbers.length; i++) {
            {
                sum = sum + numbers[i];
                numbers[i]= sum;
                add=numbers[i];

            }
        }System.out.println(add);
    }


}