package casinoProb;

import hmmmodel.Emission;
import hmmmodel.Transition;
import hmmmodel.Zustand;

import java.util.ArrayList;

/**
 *  Represents the whole Unfair-Casino-Markov-Model, with their initial
 *  probabilities.
 *
 */
public class Casino
{


    public static Zustand FAIR_DIE = new FairDie("Fair") ;
    public static Zustand LOADED_DIE  =  new LoadedDie("Loaded");

    ArrayList<Zustand> states = new ArrayList<>();

    /**
     * Constructor
     */
    public Casino()
    {
        FAIR_DIE = new FairDie("Fair") ;
        LOADED_DIE = new LoadedDie("Loaded") ;
        states.add(FAIR_DIE);
        states.add(LOADED_DIE);

    }


    /**
     * String-Represetation
     * @return the model listed with the corresponding probabilities
     */
    public String toString()
    {
        StringBuilder result = new StringBuilder() ;
        for(Zustand z: states)
        {
            result.append(z.toString()) ;

            for(Transition t : z.transitions)
            {
                result.append("\n"+ t.target + " : " + t.proba);
            }

            result.append("\n");
            for(Emission e: z.emissions)
            {
                result.append("\n\t" + e.represent + " : "+ e.prob + "\n");
            }
            result.append("\n") ;
        }
        return result.toString() ;
    }


    /**
     * Debug-Method
     * @param args
     */
    public static void main(String[] args)
    {
        Casino c = new Casino();

        System.out.println(c);
    }

}
