package com.Java;

public class Dvigatel {

    private String DvigatelType="";
    public Dvigatel(String DvigatelType){
        this.DvigatelType=DvigatelType;
    }
    public String getDvigatel() {
        return this.DvigatelType;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        Dvigatel guest = (Dvigatel) obj;
        return DvigatelType == guest.DvigatelType;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((DvigatelType == null) ? 0 : DvigatelType.hashCode());
        return result;
    }

}

