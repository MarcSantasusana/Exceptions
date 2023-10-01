package n3exercici1;

import java.util.ArrayList;

public class GestioButaques {

   private ArrayList<Butaca> butaques;

   public GestioButaques()
   {
       butaques = new ArrayList<Butaca>();
   }

    public ArrayList<Butaca> getButaques() {
        return butaques;
    }

    public void afegirButaca(Butaca butaca) throws ExcepcioButacaOcupada
    {
        int fila = butaca.getnFila();
        int seient = butaca.getnSeient();

        int index = cercarButaca(fila, seient);

        if(index == -1)
        {
            butaques.add(butaca);
            System.out.println("La butaca s'ha reservat amb èxit");

        }
        else
        {
            throw new ExcepcioButacaOcupada("Aquesta butaca no es pot reservar perquè ja està ocupada. ");

        }

    }

    public void eliminarButaca(int fila, int seient) throws ExcepcioButacaLliure
    {
        int index = cercarButaca(fila, seient);

        if(index == -1)
        {
            throw new ExcepcioButacaLliure("No es pot eliminar aquesta butaca perquè està lliure");

        }
        else
        {
            butaques.remove(index);
            System.out.println("La butaca s'ha eliminat amb èxit");

        }

    }

    public int cercarButaca(int fila, int seient)
    {
        int index = 0;
        boolean trobat = false;

        while(index < butaques.size() && !trobat)
        {
            if(butaques.get(index).getnFila() == fila && butaques.get(index).getnSeient() == seient)
            {
                trobat = true;
            }
            else
            {
                index++;
            }

        }

        if(!trobat)
        {
            index = -1;
        }

        return index;
    }
}
