package casinoProb;

import hmmmodel.Emission;
import hmmmodel.Zustand;

import java.util.ArrayList;

/**
 * Created by anthony on 21.01.17.
 */
public class Casino
{


    ArrayList<Zustand> states = new ArrayList<>();

    public Casino()
    {
        states.add(new FairDie("Fair"));
        states.add(new LoadedDie("Loaded"));

    }


    /**
     *
     * @return
     */
    public String toString()
    {
        StringBuilder result = new StringBuilder() ;
        for(Zustand z: states)
        {
            result.append(z.toString()) ;

            for(Emission e: z.emissions)
            {
                result.append("\n\t" + e.represent + " : "+ e.prob + "\n");
            }
            result.append("\n") ;
        }
        return result.toString() ;
    }



    public static void main(String[] args)
    {
        Casino c = new Casino();

        System.out.println(c);
    }

}
