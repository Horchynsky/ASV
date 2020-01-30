package com.horch.ASV.businessLogic.implamentation;

import com.horch.ASV.businessLogic.interfaces.IMath;
import com.horch.ASV.dataAccess.interfaces.IConfigEnterData;


public class Math implements IMath {

    public IConfigEnterData iConfigEnterData;

    public Math(IConfigEnterData configEnterData) {
        iConfigEnterData = configEnterData;
        
    }

    @Override
    public double runFormula() {
        return iConfigEnterData.getResult();
    }

    @Override
    public double runZp() {
        return iConfigEnterData.getzp();
    }

}
