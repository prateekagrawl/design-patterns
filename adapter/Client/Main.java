package adapter.Client;

import adapter.Adaptee.WeightMachineForBabies;
import adapter.Adapter.WeightAdapter;
import adapter.Adapter.WeightAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightAdapter weightMachineAdapter = new WeightAdapterImpl(new WeightMachineForBabies());
        System.out.println("Weight in Kg " + weightMachineAdapter.getWeightInKg());

    }
}
