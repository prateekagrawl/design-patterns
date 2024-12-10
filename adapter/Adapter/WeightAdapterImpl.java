package adapter.Adapter;

import adapter.Adaptee.WeightMachine;

public class WeightAdapterImpl implements WeightAdapter {

    WeightMachine weightMachine;
    
    public WeightAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {

        double weightInPound = weightMachine.getWeightInPounds();

        //convert pound to kg
        double weightInKg = weightInPound * .45;
        return weightInKg;
        
    }
    
}
