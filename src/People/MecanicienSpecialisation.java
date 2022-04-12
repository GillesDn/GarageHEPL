/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

/**
 *
 * @author gilles
 * @author Varga
 */
public class MecanicienSpecialisation 
{
    public static final MecanicienSpecialisation Motorisation = new MecanicienSpecialisation("Motorisation");
    public static final MecanicienSpecialisation Electricite = new MecanicienSpecialisation("Electricite");
    public static final MecanicienSpecialisation Carrosserie = new MecanicienSpecialisation("Carrosserie");
    
    private String _specialisation;
    
    public MecanicienSpecialisation(String Specialisation)
    {
        _specialisation = Specialisation;
    }
    
    public String getMecanicienSpecialisation()
    {
        return _specialisation;
    }
    public void setMecanicienSpecialisation(String Specialisation)
    {
        _specialisation = Specialisation;
    }
    
    
}
