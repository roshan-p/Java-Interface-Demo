/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author RoshaNz
 */
public class Car implements Vehicle {

    int  currentSpeed = getMaxSpeed();
    int maxSpeed=0;
   
    @Override
    public void accelerator() {
      
        if ( currentSpeed >= 100) {
            currentSpeed = currentSpeed + 10;
              System.out.println("Accelerate: Current Speed is "+currentSpeed);
        } else {
            currentSpeed = currentSpeed + 30;
             System.out.println("Accelerate: Current Speed is "+currentSpeed);
             
        }
       
    }

    @Override
    public void brake() {
        if (currentSpeed >= 100) {
            currentSpeed = currentSpeed - 30;
             System.out.println("Brake: Current Speed is "+currentSpeed);
        } else {
            currentSpeed = currentSpeed - 10;
              System.out.println("Brake: Current Speed is "+currentSpeed);
        }
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int setMaxSpeed(int maxSpeed) {
        return this.maxSpeed = maxSpeed;
    }


}
