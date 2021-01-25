package hlr1g18;

public class Simulation {
    public static void main(String[] args) {
        Network network = new Network();
        Agent infected = new Agent(true);

        network.agents.add(infected);
        infected.addNetwork(network);
        for (int i = 0; i < 10; i++){
            Agent nAgent = new Agent(false);
            network.agents.add(nAgent);
            nAgent.addNetwork(network);
        }

        boolean running = true;
        while(running){
            running = false;
            for (Agent agent : network.agents) {
                agent.step();
                if (!agent.getInfected()){
                    running = true;
                }
                System.out.print(agent.getInfected());
            }
            System.out.println(" ");
        }
    }
}
