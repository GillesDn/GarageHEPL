/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicules;

/**
 *
 * @author gilles
 * @author varga
 */
public class TypeVoiture 
{
    private String _marque;
    private String _type;
    private int _nbportes;
    private String _proprietaire;

    public String getMarque()
    {
        return _marque;
    }
    public void setMarque(String Marque)
    {
        _marque = Marque;
    }
    public String getType()
    {
        return _type;
    }
    public void setType(String Type)
    {
        _type = Type;
    }
    public int getNbPortes()
    {
        return _nbportes;
    }
    public void setNbPortes(int NbPortes)
    {
        _nbportes = NbPortes;
    }
    public String getProrietaire()
    {
        return _proprietaire;
    }
    public void setProrietaire(String Proprietaire)
    {
        _proprietaire = Proprietaire;
    }
    /*public TypeVoiture(String Marque,String Type,int NbPortes,String Proprietaire)
    {
        if(Marque == null)
        {
           
        }
    }*/
}
