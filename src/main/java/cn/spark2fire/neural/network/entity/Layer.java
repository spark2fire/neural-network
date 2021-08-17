package cn.spark2fire.neural.network.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leon@cn.spark2fire
 * Date: 2021/8/17.
 * QQ Group: 493306318
 */
public abstract class Layer {
    protected List<Neuron> neuronList;
    protected int neuronNumber;

    public Layer() {
        neuronList = new ArrayList<>();
    }

    public abstract void printLayer();
}
