package hlr1g18;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Agent {
    private boolean infected;

    private ArrayList<Network> networks = new ArrayList<Network>();

    Agent(boolean infected){
        this.infected = infected;
    }

    public void addNetwork(Network network){
        networks.add(network);
    }

    public void step(){
        if (networks.get(0).agents.get(ThreadLocalRandom.current().nextInt(0, networks.get(0).agents.size())).getInfected()){
            infected = true;
        }
        else{
            infected = false;
        }
    }

    public boolean getInfected(){
        return infected;
    }
}
