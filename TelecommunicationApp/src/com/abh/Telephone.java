package com.abh;

public interface Telephone {
    //powerOn
    //Dial a number
    //answer phone call
    //call another phone
    //is ringing

    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();


}
