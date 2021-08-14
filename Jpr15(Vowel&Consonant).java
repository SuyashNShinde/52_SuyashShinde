package com.google;

public class JPR15 {
    public static void main(String[] args) {
        char a='a';
        if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            System.out.println("Character "+a+" is vowel.");
        }
        else{
            System.out.println("Character "+a+" is consonant.");
        }
    }
}
