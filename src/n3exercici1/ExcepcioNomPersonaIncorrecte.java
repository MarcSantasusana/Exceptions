package n3exercici1;

public class ExcepcioNomPersonaIncorrecte extends Exception{

    public ExcepcioNomPersonaIncorrecte()
    {

    }

    public ExcepcioNomPersonaIncorrecte(String missatge)
    {
        super(missatge);
    }
}
