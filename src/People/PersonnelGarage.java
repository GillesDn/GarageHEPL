/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

import authenticate.AValider;
import authenticate.Identifiable;
import java.util.HashMap;


/**
 *
 * @author gilles
 * @author Varga
 */
public abstract class PersonnelGarage extends Personne implements Identifiable, AValider
{
    protected String _id;

    public PersonnelGarage(String Nom, String Prenom, String Adresse, int NumeroTel) {
        super(Nom, Prenom, Adresse, NumeroTel);
        this.PersoGarage = new  HashMap<String, String>();
    }
    
    
    @Override
    public String getId()
    {
        return _id;
    }
    @Override
    public void setId(String i)
    {
        _id = i;
    }
   @Override
   public boolean isValid(String Nom)
   {
       if(_nom == Nom)
       {
           
       }
   }
    
    HashMap<String, String>PersoGarage;
    
}
