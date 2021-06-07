package exapmle5;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int first = input.nextInt();

        System.out.print("What is the second number? ");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int multi = first * second;
        int div = first/second;

        System.out.println(
                first+" + "+second+" = "+add+"\n"
                +first+" - "+second+" = "+sub+"\n"
                +first+" + "+second+" = "+multi+"\n"
                +first+" / "+second+" = "+div+"\n");
    }
}
