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
public class ParkLot {
    
    private int nrVehicle=0;
     private final int maxVehicle=20;
    private  Vehicle Vehicle[] = new Vehicle[maxVehicle];
 
    
    public int ParkLot(){
    
     return nrVehicle;
    }
    
    
    public void park(Vehicle v){
    
        Vehicle[nrVehicle++]=v;
 
        
    }
    
    
    
    public int nrParked(){
    return nrVehicle;
    }
    
    public int totalWheels(){
    int total=0;
        for(int i=0;i<nrVehicle;i++){
            total += Vehicle[i].getWheels();
        
        }
    
    
    return total;
    }

    @Override
    public String toString() {
        for(int i=0;i<nrVehicle;i++)
            System.out.println("parking "+Vehicle[i]);
        return "";
    }
    
  

    
    
    
    
    
    
    
    
    
   
}
