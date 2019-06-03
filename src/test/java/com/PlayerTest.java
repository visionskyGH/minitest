package com;


import static org.junit.Assert.*;

public class PlayerTest {
    @org.junit.Test
    public void getCallStr() throws Exception {
        Player p = new Player();
        assertEquals("2",p.getCallStr(2));
        assertEquals("Fizz",p.getCallStr(12));
        assertEquals("Buzz",p.getCallStr(10));
        assertEquals("FizzBuzz",p.getCallStr(15));
    }

    @org.junit.Test
    public void getCallStrUL() throws Exception {
        Player p = new PlayerUL();
        assertEquals("2",p.getCallStr(2));
        assertEquals("Fizz",p.getCallStr(32));
        assertEquals("Buzz",p.getCallStr(52));
        assertEquals("FizzBuzz",p.getCallStr(53));
    }



}
