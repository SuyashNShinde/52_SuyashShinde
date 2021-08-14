package com.google;

public class JPR13 {
    public static void main(String[] args) {
        int first=100,second=500;
        int temp;
        System.out.println("Before swapping: first= "+first+" second= "+second);
        temp=first;
        first=second;
        second=temp;
        System.out.println("After swapping: first= "+first+" second= "+second);


    }
}
