package com.payilagam.sbl.SBL;

import org.springframework.stereotype.Component;

@Component("isp")
public class ISP {
    private String ipaddress;
    private int speed;

    public void switchOn(){
        System.out.println("ISP Switching On....");
    }
    public String getIpaddress() {
        return ipaddress;
    }
    public int getSpeed() {
        return speed;
    }
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
}
