package com.melnikov.part2.Task2_3_4_6_7_8_9_10_12;

public class WebMaster extends User implements Cloneable {
    private String siteAddress;

    public WebMaster(int id, String login, String password, String siteAddress) {
        super(id, login, password);
        this.siteAddress = siteAddress;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    @Override
    public void printData() {
        System.out.println(super.getId() + " " + super.getLogin() + " " + super.getPassword() + " " + siteAddress);
    }

    public WebMaster clone(){
        return new WebMaster(getId(), getLogin(), getPassword(), getSiteAddress());
    }

    @Override
    public String toString() {
        return "WebMaster{" +
                "siteAddress='" + siteAddress + '\'' +
                "} " + super.toString();
    }
}
