
package Inheritence;

public class ComputingSystem {
    private String systemName; 
    private String processorModel;
    private int ramSize;
    private int hardDiskSize;
    public ComputingSystem(String systemName,String processorModel,int ramSize,int hardDisk){
        this.systemName = systemName;
        this.processorModel = processorModel ;
        this.hardDiskSize = hardDisk;
        this.ramSize = ramSize;
    }

    public String getSystemName() {
        return systemName;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHardDiskSize() {
        return hardDiskSize;
    }
    
//   public void display(){
//            System.out.println("System Name : "+systemName);
//            System.out.println("Peocessor Model : "+processorModel);
//            System.out.println("Ram Size : "+ramSize);
//            System.out.println("Hard Disk Size : "+hardDiskSize);
//            
//                    
//        } 

    @Override
    public String toString() {
        return "systemName=" + systemName + "\n processorModel=" + processorModel + "\n "
                + "ramSize=" + ramSize + "\n hardDiskSize=" + hardDiskSize;
    }
    
}
