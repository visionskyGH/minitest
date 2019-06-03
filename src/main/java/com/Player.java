package com;

public class Player {

    public String getCallStr(int num){
        StringBuilder out = new StringBuilder("");
        if(isFizz(num)) {
            out.append("Fizz");
        }
        if(isBuzz(num)){
            out.append("Buzz");
        }
        if(out.length()==0){
            out.append(num);
        }
        return out.toString();
    }

    protected boolean isFizz(int num){
        return num%3==0;
    }

    protected boolean isBuzz(int num){
        return num%5==0;
    }
}
