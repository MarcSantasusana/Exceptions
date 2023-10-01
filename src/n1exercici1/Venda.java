package n1exercici1;

import java.util.ArrayList;

public class Venda
{

    private int preuTotal;

    private ArrayList<Producte> colleccioProductes;

    public Venda()
    {
        preuTotal = 0;
        colleccioProductes = new ArrayList<Producte>();
    }


    public void calcularTotal() throws VendaBuidaException
    {

        if(colleccioProductes.isEmpty())
        {

            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");

        }
        else
        {

            for(Producte producte : colleccioProductes)
            {
                preuTotal += producte.getPreu();
            }

        }


        System.out.println("El preu total és " + preuTotal);
        

    }

    public ArrayList<Producte> getColleccioProductes() {
        return colleccioProductes;
    }
}
