/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz3_2;

/**
 *
 * @author Admin
 */

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
   ParkLot garage= new ParkLot();
        
   car chevy=new car();
   car camry=new car();
   MotorCycle honda=new MotorCycle();
   MotorCycle harley=new MotorCycle(3);
    
   garage.park(chevy);
   garage.park(camry);
   garage.park(honda);
   garage.park(harley);
   
   
        System.out.println(""+garage.nrParked());
        System.out.println(""+garage.totalWheels());
        System.out.println(""+garage.toString());
   
   
    }
}
