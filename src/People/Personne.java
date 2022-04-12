/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

/**
 *
 * @author gilles
 * @author varga
 */
public class Personne {
    protected String _nom;
    public String _prenom;
    public String _adresse;
    public int _numeroTel;
    
    public Personne(String Nom,String Prenom,String Adresse,int NumeroTel)
    {
        _nom = Nom;
        _prenom = Prenom;
        _adresse = Adresse;
        _numeroTel = NumeroTel;
    }
    public String getNom()
    {
        return _nom;
    }
    public void setNom(String Nom)
    {
        _nom = Nom;
    }
    public String getPrenom()
    {
        return _prenom;
    }
    public void setPrenim(String Prenom)
    {
        _prenom = Prenom;
    }
    public String getAdresse()
    {
        return _adresse;
    }
    public void setAdresse(String Adresse)
    {
        _adresse = Adresse;
    }
    public int getNumero()
    {
        return _numeroTel;
    }
    public void setNumero(int Numero)
    {
        _numeroTel = Numero;
    }
    
    
    
}
