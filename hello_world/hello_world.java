package hello_world;

import java.util.Scanner;

public class hello_world
{
    public static void print_hello(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("arg0: " + args[0]);
        System.out.println("arg1: " + args[1]);
    }

    public static void read_hello()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola, informe seu nome");
        String name = scanner.next();
        System.out.println("Informe sua idade");
        int age = scanner.nextInt();

        System.out.printf("Ola %s sua idade é %s \n",name, age);
    }
}
