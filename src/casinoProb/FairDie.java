package casinoProb;

import hmmmodel.Emission;
import hmmmodel.Transition;
import hmmmodel.Zustand;

/**
 * Zustand-Object.
 * Equals to the FairDie-Zustand in durbin book.
 */
public class FairDie extends Zustand
{


    /**
     * Constructor
     * @param representant String representation of this FairDie-Zustand.
     */
    public FairDie(String representant)
    {
        super(representant);

    }

    /**
     * Return the probability to transist from this Zustand
     * to another zustand.
     * @param zustand Zustand to transit to.
     * @return Probability of the transition to zustand.
     */
    @Override
    public double getProba(Zustand zustand)
    {
        return 0;
    }

    /**
     * Return the probability to emit from this Zustand
     * to a specific emission.
     * @param emission Emission to transit to.
     * @return Probability of the emit to emission.
     */
    @Override
    public double getProba(Emission emission)
    {
        return 0;
    }

    /**
     * Initializes the Emission-list this Zustand can emit, with their
     * corresponding Probability.
     */
    @Override
    public void initEmissions()
    {
        emissions.add(new Emission("1",(1.0/6.0), this)) ;
        emissions.add(new Emission("2",(1.0/6.0), this));
        emissions.add(new Emission("3",(1.0/6.0), this));
        emissions.add(new Emission("4",(1.0/6.0), this));
        emissions.add(new Emission("5",(1.0/6.0), this));
        emissions.add(new Emission("6",(1.0/6.0), this));
    }

    /**
     * Initializes the Transition-list this Zustand can transit to, with their
     * corresponding Probability.
     */
    @Override
    public void initTransition()
    {
        transitions.add(new Transition(Casino.FAIR_DIE,0.95));
        transitions.add(new Transition(Casino.LOADED_DIE, 0.05));
    }
}
