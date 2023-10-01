package n2exercici1;

public class Main
{
    public static void main(String[] args)
    {

        boolean excepcio = true;

        int metode = 0;


        while(excepcio) {

        Entrada entrada = new Entrada();


            try {

                if(metode == 0)
                {
                    byte inputByte = Entrada.llegirByte("Introdueixi la seva edat");
                    System.out.println(inputByte);
                    metode++;
                }

                if(metode == 1)
                {

                    double inputDouble = Entrada.llegirDouble("Introdueixi el seu pes");
                    System.out.println(inputDouble);
                    metode++;
                }

                if(metode == 2)
                {

                    float inputFloat = Entrada.llegirFloat("Introdueixi la seva alçada");
                    System.out.println(inputFloat);
                    metode++;

                }

                if(metode == 3)
                {

                    int inputInt = Entrada.llegirInt("Introdueixi el codi postal de la teva direcció");
                    System.out.println(inputInt);
                    metode++;

                }

                if(metode == 4)
                {


                    char inputChar = Entrada.llegirChar("Introdueixi la seva lletra del teu DNI");
                    System.out.println(inputChar);
                    metode++;
                }

                if(metode == 5)
                {

                    boolean inputBoolean = Entrada.llegirSiNo("Treballes? 's' per un Si o 'n' per un No");
                    System.out.println(inputBoolean);
                    metode++;

                }


                    String inputString = Entrada.llegirString("Introdueixi el seu nom");
                    System.out.println(inputString);
                    metode++;


                excepcio = false;

            } catch (Exception e) {
                System.out.println("Error de format");
            }

        }


    }


}
