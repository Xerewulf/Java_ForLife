/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Admin
 */
public class patient {
       private static int id=100;
       private String name= new String();
       private String disease= new String();
       
       
       public void member(String name, String disease){
          
           this.name=name;
           this.disease=disease;
           id+=1;
       }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    } 

    public String getDisease() {
        return disease;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"Disease: "+this.disease+"id: "+this.id; 
    }

    @Override
    public boolean equals(Object obj) {
        if(this.name==((patient)obj).getName()) 
            return true;
        else 
            return false;
    }

    
    
 
    
    
    
    }
       
       
       
       
       
    

