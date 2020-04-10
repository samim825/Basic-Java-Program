
package FirstClassTest;


public class DemoClassInherit extends DemoClass{
    private String homeDistrict;
    
    public void setHomeDistrict(String hmDstct){
        this.homeDistrict = hmDstct;
    }
    public String getHomeDistrict(){
        return homeDistrict;
    }
    public DemoClassInherit(int roll, String name,String hmDsrct){
        super(roll, name);
        this.homeDistrict = hmDsrct;
        
    }
    @Override
    public void printInfo(){
        System.out.println(getCollegeName()+getRoll()+ getName() + homeDistrict);
    }
    
}
