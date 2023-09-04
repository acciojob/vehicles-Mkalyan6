package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 2, 5, isManual, "passenger", 6);
    }
    public String getName(){
        return super.getName();
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        if(newSpeed<0)newSpeed=0;
        int gear=1;
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */


        //for all other cases, change the gear accordingly

        if (newSpeed<51) {
           gear=1;
        }
        else if(newSpeed<101){
            gear=2;
        }
        else if(newSpeed<151){
            gear=3;
        }
        else if(newSpeed<201){
            gear=4;
        }
        else if(newSpeed<251){
            gear=5;
        }
        else{
            gear=6;
        }
        changeSpeed(newSpeed, getCurrentDirection());

        changeGear(gear);


    }

}
