package casinoProb;

import hmmmodel.Emission;
import hmmmodel.Zustand;

/**
 * Created by anthony on 21.01.17.
 */
public class LoadedDie extends Zustand
{


    /**
     *
     * @param representant
     */
    public LoadedDie(String representant)
    {
        super(representant);

    }

    @Override
    public double getProba(Zustand zustand)
    {
        return 0;
    }

    @Override
    public double getProba(Emission emission)
    {
        return 0;
    }

    @Override
    public void initEmissions()
    {
        emissions.add(new Emission("1",(1.0/10.0), this)) ;
        emissions.add(new Emission("2",(1.0/10.0), this));
        emissions.add(new Emission("3",(1.0/10.0), this));
        emissions.add(new Emission("4",(1.0/10.0), this));
        emissions.add(new Emission("5",(1.0/10.0), this));
        emissions.add(new Emission("6",(1.0/2.0), this));
    }

    @Override
    public void initZustands()
    {

    }
}
