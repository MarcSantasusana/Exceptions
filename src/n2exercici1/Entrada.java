package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada
{
    private static Scanner scanner;

    public Entrada()
    {
        scanner = new Scanner(System.in);

    }

    public static byte llegirByte(String missatge) throws InputMismatchException
    {
        System.out.println(missatge);

        byte input = scanner.nextByte();

        return input;

    }

    public static int llegirInt(String missatge) throws InputMismatchException
    {
        System.out.println(missatge);

        int input = scanner.nextInt();

        scanner.nextLine();

        return input;
    }

    public static float llegirFloat(String missatge) throws InputMismatchException
    {
        System.out.println(missatge);

        float input = scanner.nextFloat();

        return input;
    }

    public static double llegirDouble(String missatge) throws InputMismatchException
    {
        System.out.println(missatge);

        double input = scanner.nextDouble();

        return input;
    }

    public static char llegirChar(String missatge) throws Exception
    {
        System.out.println(missatge);

        String input = scanner.nextLine();

        char lletra = input.charAt(0);

        if(input.length() != 1 || !Character.isLetter(lletra))
        {
            throw new Exception();
        }



        return lletra;
    }

    public static String llegirString(String missatge) throws Exception
    {
        System.out.println(missatge);


        String input = scanner.nextLine();

        return input;
    }

    public static boolean llegirSiNo(String missatge) throws Exception
    {
        System.out.println(missatge);

        String input = scanner.nextLine();

        char lletra;
        lletra = input.charAt(0);


        if(input.length() != 1)
        {
            throw new Exception();
        }

        boolean bool;

        if (lletra == 's') {
            bool = true;

        } else if (lletra == 'n') {
            bool = false;

        }
        else {

            throw new Exception();
        }


        return bool;
    }
}
