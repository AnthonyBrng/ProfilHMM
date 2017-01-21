package hmmmodel;

/**
 * Created by anthony on 21.01.17.
 */
public class Emission {

    int represent;
    double prob;
    Zustand owner;


    public Emission(int represent, double prob, Zustand owner){
        this.represent = represent;
        this.prob = prob;
        this.owner = owner;
    }





}
