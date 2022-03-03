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
public class Vehicle {
    
     private  int nrWheels=4;

    
    
    public int Vehicle(){
        
      return nrWheels;
        
    }
    
     public int Vehicle(int x){
         
         this.nrWheels = x;
        
        return nrWheels;
    }
    
     public int getWheels(){
     
     return nrWheels;
     
     }

    public void setNrWheels(int nrWheels) {
        this.nrWheels = nrWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "nrWheels=" + nrWheels + '}';
    }
    
     
     
     
     
     
     
}
