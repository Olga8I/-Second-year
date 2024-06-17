package com.Java;

public class Koleso {
    private String KolesoType="";
    public Koleso(String KolesoType){
        this.KolesoType=KolesoType;
    }
    public String getKoleso() {
        return this.KolesoType;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        Koleso guest = (Koleso) obj;
        return KolesoType == guest.KolesoType;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((KolesoType == null) ? 0 : KolesoType.hashCode());
        return result;

    }

}
