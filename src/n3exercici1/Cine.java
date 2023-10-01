package n3exercici1;

import java.util.*;

public class Cine
{
    private int nFiles;
    private int nSeientsFila;
    private GestioButaques gestioButaques;

    public Cine()
    {
        gestioButaques = new GestioButaques();
        demanarDadesInicials();

    }

    public void iniciar()  {


        boolean sortir = false;

        while(!sortir) {

            try {

                int opcio;

                opcio = menu();


                switch (opcio) {

                    case 0:

                        sortir = true;

                        break;

                    case 1:

                        mostrarButaques();

                        break;

                    case 2:

                        mostrarButaquesPersona();

                        break;

                    case 3:

                        reservarButaca();

                        break;

                    case 4:

                        anularReserva();

                        break;

                    case 5:

                        anularReservaPersona();

                        break;

                    default:

                        System.out.println("Aquesta opció no és vàlida");

                }

            } catch (ExcepcioFilaIncorrecta | ExcepcioButacaLliure | ExcepcioNomPersonaIncorrecte | ExcepcioSeientIncorrecte |
                   ExcepcioButacaOcupada e){

                System.out.println(e.getMessage());
            }

        }

    }

    public int menu()
    {
        Scanner scanner = new Scanner(System.in);
        int opcio;

        System.out.println("Esculli una opció: \n");

        System.out.println("1.- Mostrar totes les butaques reservades.\n" +
                "\n" +
                "2.- Mostrar les butaques reservades per una persona.\n" +
                "\n" +
                "3.- Reservar una butaca.\n" +
                "\n" +
                "4.- Anul·lar la reserva d’una butaca.\n" +
                "\n" +
                "5.- Anul·lar totes les reserves d’una persona.\n" +
                "\n" +
                "0.- Sortir.");

        opcio = scanner.nextInt();

        return opcio;

    }

    public void mostrarButaques()
    {
        for(int i = 0; i < gestioButaques.getButaques().size(); i++)
        {
            String stringButaca = gestioButaques.getButaques().get(i).toString();

            System.out.println(stringButaca);
        }

    }

    public void mostrarButaquesPersona() throws ExcepcioNomPersonaIncorrecte {

        Scanner scanner = new Scanner (System.in);

        String nom;

        nom = introduirPersona();

        for(int i = 0; i < gestioButaques.getButaques().size(); i++)
        {
            if(gestioButaques.getButaques().get(i).getPersona().equals(nom))
            {
                String stringButaca = gestioButaques.getButaques().get(i).toString();
                System.out.println(stringButaca);
            }

        }

    }

    public void reservarButaca() throws ExcepcioFilaIncorrecta, ExcepcioSeientIncorrecte, ExcepcioNomPersonaIncorrecte, ExcepcioButacaOcupada {

       int fila = introduirFila();

       int seient = introduirSeient();

       String persona = introduirPersona();

       Butaca butaca = new Butaca(fila, seient, persona);

       gestioButaques.afegirButaca(butaca);

    }

    public void anularReserva() throws ExcepcioFilaIncorrecta, ExcepcioSeientIncorrecte, ExcepcioButacaLliure {

        int fila = introduirFila();

        int seient = introduirSeient();

        gestioButaques.eliminarButaca(fila, seient);

    }

    public void anularReservaPersona() throws ExcepcioNomPersonaIncorrecte, ExcepcioButacaLliure {

        String persona = introduirPersona();

        ArrayList<Butaca> butaquesEliminades = new ArrayList<Butaca>();

        for(int i = 0; i < gestioButaques.getButaques().size(); i++)
        {
            if(gestioButaques.getButaques().get(i).getPersona().equals(persona))
            {

                butaquesEliminades.add(gestioButaques.getButaques().get(i));

            }

        }

        for(int i = 0; i < butaquesEliminades.size(); i++)
        {
            int fila = butaquesEliminades.get(i).getnFila();
            int seient = butaquesEliminades.get(i).getnSeient();

            gestioButaques.eliminarButaca(fila, seient);

        }

    }

    public String introduirPersona() throws ExcepcioNomPersonaIncorrecte
    {
        Scanner scanner = new Scanner (System.in);
        String nom;

        System.out.println("Introdueixi el nom de la persona");

        nom = scanner.nextLine();

        char[] chars = nom.toCharArray();
        int i = 0;

        while(i < chars.length)
        {
            if(Character.isDigit(chars[i]))
            {

                throw new ExcepcioNomPersonaIncorrecte("El nom no pot contenir números");

            }
            i++;
        }

        return nom;

    }

    public void demanarDadesInicials()
    {
        boolean excepcio = true;
        int metode = 0;

        while(excepcio) {

            try {
                Scanner scanner = new Scanner(System.in);

                if(metode == 0) {

                    System.out.println("Introdueixi el nombre de files");

                    nFiles = scanner.nextInt();

                    metode++;
                }


                    System.out.println("Introdueixi el nombre de seients");

                    nSeientsFila = scanner.nextInt();

                excepcio = false;

            } catch (InputMismatchException e) {
                System.out.println("Introdueixi un número");
            }
        }

    }

   public int introduirFila() throws ExcepcioFilaIncorrecta
   {
       Scanner scanner = new Scanner (System.in);
       int fila;

       System.out.println("Introdueixi el nombre de fila");

       fila = scanner.nextInt();

       if(fila >= 1 && fila <= nFiles)
       {
           return fila;
       }

       else {

           throw new ExcepcioFilaIncorrecta("Aquest número de fila no existeix");
       }

   }

    public int introduirSeient() throws ExcepcioSeientIncorrecte
    {
        Scanner scanner = new Scanner (System.in);
        int seient;

        System.out.println("Introdueixi el número del seient");

        seient = scanner.nextInt();

        if(seient >= 1 && seient <= nSeientsFila)
        {
            return seient;
        }

        else {

            throw new ExcepcioSeientIncorrecte("Aquest número de seient no existeix");
        }

    }
}
