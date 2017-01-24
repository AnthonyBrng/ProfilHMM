package hmmmodel;

/**
 * Transition-Object.
 * Just a simple Object containing a target zustand property and a probability property
 */
public class Transition
{
    public Zustand target;
    public double proba ;

    /**
     * Constructor
     * @param target Zustand to transit to
     * @param proba probability to transit to target
     */
    public Transition(Zustand target, double proba)
    {
        this.target = target ;
        this.proba = proba ;
    }

}
