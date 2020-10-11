package uk.ac.uos.i2p.s201951;

public class Swap {

    public static void main(String[] args) {
        int first = 3;
        int second = 4;

        System.out.println("First variable: " + first + " Second variable: " + second);

        int buffer = first;
        first = second;
        second = buffer;

        System.out.println("First variable: " + first + " Second variable: " + second);
    }

}
