package cn.spark2fire.neural.network.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by Leon@cn.spark2fire
 * Date: 2021/8/17.
 * QQ Group: 493306318
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class HiddenLayer extends Layer {
    @Override
    public void printLayer() {
        System.out.println("Hidden Layer has " + neuronNumber + " neurons:");
        for (int i = 0; i < neuronNumber; i++) {
            System.out.println("Neuron #" + i + ":");
            System.out.println("=================== IN =========================");
            for (Double in : neuronList.get(i).getListOfWeightIn()) {
                System.out.print(in);
            }
            System.out.println("=================== Out =========================");
            for (Double out : neuronList.get(i).getListOfWeightOut()) {
                System.out.print(out);
            }
        }
    }
}
