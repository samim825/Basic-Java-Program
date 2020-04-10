
package Inheritence;


public class Desktop extends ComputingSystem{
    private int monitorDisplaySize;
    
    public Desktop(String systemName,String processorModel,int ramSize,int hardDisk,int monitorDisplaySize){
        super(systemName, processorModel, ramSize, hardDisk);
        this.monitorDisplaySize = monitorDisplaySize;
    }  

    @Override
    public String toString() {
        return super.toString()+"Desktop" + "\nMonitorDisplaySize=" + monitorDisplaySize;
    }
    
    
    
}
