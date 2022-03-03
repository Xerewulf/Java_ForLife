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
public class hıs {
   final int fin=10;
   private patient[] mypatient=new patient[fin];
   private static int index=0;
   
   public int indexOf(int id){
       int ind=-1;
   for(int i=0;i<fin;i++){
       if(this.mypatient[i].getId()==id)
           ind=i;
   }
   return ind;
   }

   
   
 public int indexOf(patient a){
 int ind=-1;
 for(int i =0;i<fin;i++)
     if(mypatient[i]==a)
         ind=i;
 return ind;
 }
     

 public boolean addPatient(patient a){
     boolean q=false;
     
        if(index<=fin){
            if(indexOf(a)!=-1)
                q=false;
            else{
            mypatient[index]=a;
            index++;
            q= true;             
            }
        
        
        }
 
     return q;
 }
     
 public boolean removePatient(int id){
 boolean r=false;
  
     if(indexOf(id)!=-1){
       mypatient[indexOf(id)] = mypatient[index]; 
        //assing last patient into the removed patient
        index--;
        r=true;
     }
        
        return r;
        }
 
  public patient[] getAll(){
 
 return mypatient;
 }

    @Override
    public String toString() {
        
     return ""+mypatient;
    }
        
    }

  
 
 
    