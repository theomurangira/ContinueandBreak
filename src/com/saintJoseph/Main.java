package com.saintJoseph;

public class Main {

    public static void main(String[] args) {
        int n=20;

        while(n>0)
        {
             --n;// a==19
            //n--;
            if(n%2==0)
            {
                continue;
            }
            System.out.println("n= "+n);
            if(n==15)
            {
                break;
            }
        }
    }
}
