package main;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {

    public static void main(String[] args) {

    }

    private static void print(byte[][] diagram) {
        for (int i = 0; i < diagram.length; i++)
        {
            for (int j = 0; j < diagram[i].length; j++)
            {
                if (diagram[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
