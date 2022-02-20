package com.company.newdaysgrowup;

public class sthomework {
    public static void main(String[] args) {
      int  startTime[]={1,2,3};
      int endTime[]={5,7,10};
        int queryTime=6;
        busyStudent(startTime, endTime,queryTime);
    }
    public static void busyStudent(int startTime[], int endTime[], int queryTime) {
            int students = 0;
            for (int i = 0; i < startTime.length; i++){
                if (startTime[i] <= queryTime && queryTime <= endTime[i])
                    students++;}

        System.out.println(students);
        }
    }

