/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

/**
 *
 * @author gilles
 */
public class Mecanicien extends PersonnelGarage 
{

    public Mecanicien(String Nom, String Prenom, String Adresse, int NumeroTel) {
        super(Nom, Prenom, Adresse, NumeroTel);
    }

    @Override
    public boolean isValid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
