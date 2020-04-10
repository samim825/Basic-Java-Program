
package Inheritence;


public class MobilePhone extends ComputingSystem {
    private int mobileDisplaySize;
    
    public MobilePhone(String systemName,String processorModel,int ramSize,int hardDisk,int mobileDisplaySize){
        super(systemName, processorModel, ramSize, hardDisk);
        this.mobileDisplaySize = mobileDisplaySize;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "MobilePhone" + "\nMobileDisplaySize=" + mobileDisplaySize;
    }

  
    
    
}
