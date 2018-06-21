package org.nd4j.linalg.api.ops.impl.transforms;

import org.nd4j.autodiff.functions.DifferentialFunction;
import org.nd4j.autodiff.samediff.SDVariable;
import org.nd4j.autodiff.samediff.SameDiff;
import org.nd4j.imports.NoOpNameFoundException;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.BaseTransformOp;

import java.util.Collections;
import java.util.List;

/**
 * [1, 2, 3, 1] -> [0, 0, 1, 0]
 * @author Adam Gibson
 */
public class IsMax extends BaseTransformOp {
    public IsMax(SameDiff sameDiff, SDVariable i_v, boolean inPlace) {
        super(sameDiff, i_v, inPlace);
    }

    public IsMax(SameDiff sameDiff, SDVariable i_v, int[] shape, boolean inPlace, Object[] extraArgs) {
        super(sameDiff, i_v, shape, inPlace, extraArgs);
    }

    public IsMax(SameDiff sameDiff, SDVariable i_v, Object[] extraArgs) {
        super(sameDiff, i_v, extraArgs);
    }

    public IsMax(INDArray x, INDArray z) {
        super(x, z);
    }

    public IsMax() {}

    public IsMax(INDArray x, INDArray z, long n) {
        super(x, z, n);
    }

    public IsMax(INDArray x, INDArray y, INDArray z, long n) {
        super(x, y, z, n);
    }

    public IsMax(INDArray x) {
        super(x);
    }

    public IsMax(INDArray x, INDArray z, long n, int... dimensions) {
        super(x, z, n);
        this.extraArgs = new Object[dimensions.length + 1];
        this.extraArgs[0] = dimensions.length;
        for (int i = 0; i < dimensions.length; i++)
            this.extraArgs[i + 1] = dimensions[i];
    }

    public IsMax(INDArray x, INDArray y, INDArray z, long n, int... dimensions) {
        super(x, y, z, n);
        this.extraArgs = new Object[dimensions.length + 1];
        this.extraArgs[0] = dimensions.length;
        for (int i = 0; i < dimensions.length; i++)
            this.extraArgs[i + 1] = dimensions[i];
    }

    public IsMax(INDArray x, int... dimensions) {
        super(x);
        this.extraArgs = new Object[dimensions.length + 1];
        this.extraArgs[0] = dimensions.length;
        for (int i = 0; i < dimensions.length; i++)
            this.extraArgs[i + 1] = dimensions[i];
    }

    @Override
    public int opNum() {
        return 41;
    }

    @Override
    public String opName() {
        return "ismax";
    }


    @Override
    public String onnxName() {
        throw new NoOpNameFoundException("No onnx op opName found for " +  opName());
    }

    @Override
    public String tensorflowName() {
        throw new NoOpNameFoundException("No tensorflow op opName found for " +  opName());
    }



    @Override
    public boolean isExecSpecial() {
        return true;
    }


    @Override
    public List<SDVariable> doDiff(List<SDVariable> f1) {
        return Collections.singletonList(f().zerosLike(arg()));
    }
}
