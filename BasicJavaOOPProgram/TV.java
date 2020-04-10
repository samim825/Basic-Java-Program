
package BasicJavaOOPProgram;

public class TV {
    public int channel = 1;
    public int volumeLevel = 1;
    public boolean on = false;
    
    public TV() {
        
    }
    public void turnOn(){
       on = true;
    }
    public void turnOff(){
        on = false;
        System.out.println("TV is Off now.");
    }
    public void setChannel(int newChannel){
        if(newChannel>=1 && newChannel <=120)
            channel = newChannel;
    }
    public void setVolume(int newVolume){
        if(newVolume>=1 && newVolume<=7)
            volumeLevel = newVolume;
    }
    public void volumeUp(){
        if(on && volumeLevel<7)
            volumeLevel++;
    }
    public void volumeDown(){
        if(on && volumeLevel > 1)
            volumeLevel--;
    }
    public void channelUp(){
        if(on && channel<120)
            channel++;
    }
    public void channelDown(){
        if(on && channel >1)
            channel--;
    }

   
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
         tv2.channelUp();
        tv2.volumeUp();
        tv2.volumeDown();
        tv2.volumeDown();
        
        System.out.println(tv1.channel+ " "+tv1.volumeLevel);
        System.out.println(tv2.channel+ " "+tv2.volumeLevel);
    }
    
}
