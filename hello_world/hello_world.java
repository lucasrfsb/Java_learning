package hello_world;

import java.util.Scanner;

public class hello_world
{
    public static String test = "teste_classe";

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

    public static void gerador_identificador()
    {
        // Criando um objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo a string (nome)
        String nome = scanner.nextLine();

        // Lendo o número inteiro (ID)
        int id = scanner.nextInt();

        // TODO: Formate o identificador (minúsculas e sem espaços):
        String identificador = nome.replaceAll("\\s", "").toLowerCase() + '-' + String.valueOf(id);

        // TODO: Exiba o resultado:
        System.out.println(identificador);

        // Fechando o scanner
        scanner.close();
    }

    public static void testPersonSemConstrutor()
    {
        Person_sem_construtor person = new Person_sem_construtor();
        person.setAge(10);
        person.setName("Lucas");
        System.out.println(person.getName() + ' ' + person.getAge());
    }

    public static void testPerson()
    {
        Person person = new Person("Lucas");
        person.setAge(10);
        System.out.println(person.getName() + ' ' + person.getAge());
    }

    public static void tesdRecord()
    {
        PersonRecord record = new PersonRecord("Joao", 10);
        System.out.println(record.name());
        System.out.println(record.age());
    }
}
