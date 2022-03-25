package com.example.fee_management_new.Api;



import java.util.ArrayList;

public class GetGroupStandardsResponse {
    //@JsonProperty("6353 class")
    public ArrayList<Class> Class;
    //@JsonProperty("IX")
    public ArrayList<IX> iX;
    //@JsonProperty("JEE")
    public ArrayList<JEE> jEE;
    //@JsonProperty("NEET")
    public ArrayList<NEET> nEET;
   // @JsonProperty("SRI CLASS")
    public ArrayList<SRICLASS> sRICLASS;
    //@JsonProperty("VI")
    public ArrayList<VI> vI;
   // @JsonProperty("VII")
    public ArrayList<VII> vII;
   // @JsonProperty("VIII")
    public ArrayList<VIII> vIII;
   // @JsonProperty("X")
    public ArrayList<X> x;
    //@JsonProperty("XI")
    public ArrayList<XI> xI;
    //@JsonProperty("fee management")
    public ArrayList<FeeManagement> feeManagement;
    public ArrayList<Io> ios;

    public GetGroupStandardsResponse(ArrayList<Class> Class, ArrayList<IX> iX, ArrayList<JEE> jEE, ArrayList<NEET> nEET, ArrayList<SRICLASS> sRICLASS, ArrayList<VI> vI, ArrayList<VII> vII, ArrayList<VIII> vIII, ArrayList<X> x, ArrayList<XI> xI, ArrayList<FeeManagement> feeManagement, ArrayList<Io> ios) {
        Class = Class;
        this.iX = iX;
        this.jEE = jEE;
        this.nEET = nEET;
        this.sRICLASS = sRICLASS;
        this.vI = vI;
        this.vII = vII;
        this.vIII = vIII;
        this.x = x;
        this.xI = xI;
        this.feeManagement = feeManagement;
        this.ios = ios;
    }

    public ArrayList<Class> getClass1() {
        return Class;
    }

    public ArrayList<IX> getiX() {
        return iX;
    }

    public ArrayList<JEE> getjEE() {
        return jEE;
    }

    public ArrayList<NEET> getnEET() {
        return nEET;
    }

    public ArrayList<SRICLASS> getsRICLASS() {
        return sRICLASS;
    }

    public ArrayList<VI> getvI() {
        return vI;
    }

    public ArrayList<VII> getvII() {
        return vII;
    }

    public ArrayList<VIII> getvIII() {
        return vIII;
    }

    public ArrayList<X> getX() {
        return x;
    }

    public ArrayList<XI> getxI() {
        return xI;
    }

    public ArrayList<FeeManagement> getFeeManagement() {
        return feeManagement;
    }

    public ArrayList<Io> getIos() {
        return ios;
    }
}


