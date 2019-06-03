package com;

public class PlayerUL extends Player{

    @Override
    protected boolean isFizz(int num){
        return (num%3==0||String.valueOf(num).indexOf("3")>=0);
    }
    @Override
    protected boolean isBuzz(int num){
        return (num%5==0||String.valueOf(num).indexOf("5")>=0);
    }
}
