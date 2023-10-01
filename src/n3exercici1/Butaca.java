package n3exercici1;

public class Butaca
{

    private int nFila;
    private int nSeient;
    private String persona;

    public Butaca(int nFila, int nSeient, String persona)
    {
        this.nFila = nFila;
        this.nSeient = nSeient;
        this.persona = persona;
    }

    public int getnFila() {
        return nFila;
    }

    public int getnSeient() {
        return nSeient;
    }

    public String getPersona() {
        return persona;
    }

    public boolean equals(Butaca butaca)
    {
        boolean iguals = false;

        if(this.nFila == butaca.getnFila() && this.nSeient == butaca.getnSeient())
        {
            iguals = true;

        }

        return iguals;
    }

    @Override
    public String toString()
    {
        return "Fila: " + nFila + ", Seient: " + nSeient + ", Persona: " + persona;
    }
}
