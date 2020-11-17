package com.company;

public class Die {
    private int x;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
    }

    public void roll()
    {
        x = (int) (6 * Math.random())+1;
    }
    public int getNumDots()
    {
        return x;
    }
}
