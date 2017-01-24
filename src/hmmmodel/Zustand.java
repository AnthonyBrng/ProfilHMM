package hmmmodel;

import java.util.ArrayList;

/**
 * Abstract Zustand-Object
 *
 * Contains a String-Representation, a List of emission object this Zustand can emit
 * and a list of Transition-Objects this Zustand can transit to.
 */
public abstract class Zustand
{

    private String representant ;
    public ArrayList<Emission> emissions = new ArrayList<>() ;
    public  ArrayList<Transition> transitions = new ArrayList<>() ;


    /**
     * Constructor
     * @param representant String-Representation
     */
    public Zustand(String representant)
    {
        this.representant = representant ;
        initEmissions();
        initTransition();
    }

    /**
     * Equals to getRepresentant()
     * @return returns the String-Representant.
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

    public abstract void initTransition();

}
