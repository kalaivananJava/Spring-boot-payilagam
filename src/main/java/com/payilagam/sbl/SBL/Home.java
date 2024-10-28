package com.payilagam.sbl.SBL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//pojo classes -Plain old java classes
@Component
@Scope(value="prototype")
public class Home {
    private String owner;
    private int doorNo;
    //@Component nu ISP class la kudutha udane SB container la SB object for ISP create aagidum
    //but ennathaan Home & ISP SB objects same SB container la iruthaalum avangalukku ulla entha connection um illa
    // so athukku ISP ku one reference variable create pani @Autowired nu kuduthaa modem.switchOn() which is inside the ISP method thaa call panraanga nu understand panikkum.


    @Autowired  // search by type
    @Qualifier("isp") // search by name..in @Component("isp")
    private ISP modem;


    public Home() {
        System.out.println("home...");
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getDoorNo() {
        return doorNo;
    }
    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }
    public void connect(){
        // ISP c=new ISP();
        // c.switchOn();
       //there is no memory 
        modem.switchOn();

        System.out.println("Connecting to internet..");
    }
    
}
