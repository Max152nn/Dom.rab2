package com.F_P_S;

public class ex3 {
    public static void main(String[] args) {
        System.out.println(max(0,0,0));
        System.out.println(max1(0,0,0));
    }

    public static int max(int a,int b,int c){
        int max=0;
        if(a==b && a==c){
            return max=a;
        }else if(a>b && a>c){
            return max = a;
        }else if(b>a && b>c){
            return max=b;
        }else if(c>a && c>b){
            return max = c;
        }
        return max;
    }

    public static int max1(int a,int b,int c){
        return Math.max(Math.max(a,b),c);
    }

    
}
