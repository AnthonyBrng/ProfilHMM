package hmmmodel;

import java.util.ArrayList;

/**
 * Created by anthony on 21.01.17.
 */
public abstract class Zustand
{

    private String representant ;
    public ArrayList<Emission> emissions = new ArrayList<>() ;
    public  ArrayList<Zustand> zustands = new ArrayList<>() ;


    /**
     *
     * @param representant
     */
    public Zustand(String representant)
    {
        this.representant = representant ;
        initEmissions();
        initZustands();
    }

    /**
     *
     * @return
     */
    public String toString()
    {
        return this.representant ;
    }



    /*
        ABSTRACT SECTION
     */
    public abstract double getProba(Zustand zustand);

    public abstract double getProba(Emission emission);

    public abstract void initEmissions();

    public abstract void initZustands();

}
