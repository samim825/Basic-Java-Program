package Inheritence;


public class Laptop extends ComputingSystem {
    private int laptopDisplaySize;
    public Laptop(String systemName,String processorModel,int ramSize,int hardDisk,int laptopDisplaySize){
        super(systemName, processorModel, ramSize, hardDisk);
        this.laptopDisplaySize = laptopDisplaySize;
    }
    @Override
    public String toString(){
        return super.toString()+"\nLaptop Display : "+laptopDisplaySize;
    }
}
