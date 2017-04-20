/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author RoshaNz
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car m = new Car();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input MaxSpeed: ");
        int mx = scan.nextInt();
        m.setMaxSpeed(mx);
        m.accelerator();
        m.accelerator();
        m.accelerator();
        m.accelerator();
        m.accelerator();
        m.brake();

    }

}
