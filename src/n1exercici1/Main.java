package n1exercici1;

public class Main {
    public static void main(String[] args)
    {

        Venda venda = new Venda();

        Producte producte1 = new Producte("Mòbil", 500);
        Producte producte2 = new Producte("Pilota", 2);
        Producte producte3 = new Producte("Taula", 25);

        Producte[] array = {producte1, producte2, producte3};


        try
        {

            venda.calcularTotal(); // Excepció VendaBuidaException

        }
        catch(VendaBuidaException e)
        {
            System.out.println(e.getMessage());

        }

        try
        {

            System.out.println(array[-1].getPreu()); //Excepció ArrayIndexOutOfBoundsException

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }





    }
}