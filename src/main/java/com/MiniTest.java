package com;

public class MiniTest {

    public static void main(String[] args){

        for(int i=1;i<=100;i++){
            printStage1(i);
        }

        for(int i=1;i<=100;i++){
            printStage2(i);
        }

    }

    public static void printStage1(int i){
        StringBuilder out = new StringBuilder("");
        if(i%3==0) {
            out.append("Fizz");
        }
        if(i%5==0){
            out.append("Buzz");
        }
        if(out.length()==0){
            out.append(i);
        }
        System.out.println(out.toString());
    }

    public static void printStage2(int i){
        StringBuilder out = new StringBuilder("");
        if(i%3==0||String.valueOf(i).indexOf("3")>=0) {
            out.append("Fizz");
        }
        if(i%5==0||String.valueOf(i).indexOf("5")>=0){
            out.append("Buzz");
        }
        if(out.length()==0){
            out.append(i);
        }
        System.out.println(out.toString());
    }
}
