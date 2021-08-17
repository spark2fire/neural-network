package cn.spark2fire.neural.network.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Leon@cn.spark2fire
 * Date: 2021/8/17.
 * QQ Group: 493306318
 */
@Data
public class Neuron {
    private List<Double> listOfWeightIn;
    private List<Double> listOfWeightOut;

    public Neuron() {
        super();
        listOfWeightIn = new ArrayList<>();
        listOfWeightOut = new ArrayList<>();
    }

    public double initNeuron() {
        return new Random().nextDouble();
    }
}
