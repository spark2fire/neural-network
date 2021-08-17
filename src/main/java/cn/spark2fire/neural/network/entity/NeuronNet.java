package cn.spark2fire.neural.network.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leon@cn.spark2fire
 * Date: 2021/8/17.
 * QQ Group: 493306318
 */
@Data
@AllArgsConstructor
public class NeuronNet {
    private InputLayer inputLayer;
    private OutputLayer outputLayer;
    private List<HiddenLayer> hiddenLayerList = new ArrayList<>();
    private int numberOfHiddenLayers;

    public NeuronNet() {
        super();
    }

    public void printNet() {
        inputLayer.printLayer();
        System.out.println("This neuron net has " + numberOfHiddenLayers + " hidden layers.");
        for (HiddenLayer layer : hiddenLayerList) {
            layer.printLayer();
        }
        outputLayer.printLayer();
    }

}
