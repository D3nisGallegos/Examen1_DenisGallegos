/*Clase para el objeto ARMA
 */
package examen1_denisgallegos;


public class Arma {
    
    private String tipo; 
    private int porcentage; 
    
    //CONSTRUCTORES: 

    public Arma() {
    }

    public Arma(String tipo, int porcentage) {
        this.tipo = tipo;
        this.porcentage = porcentage;
    }
    
    //MUTADORES: 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPorcentage() {
        return porcentage;
    }

    public void setPorcentage(int porcentage) {
        this.porcentage = porcentage;
    }
    
    //MA: 
    public String toStringArma(){
        return "[Tipo: "+tipo+", Damage: "+porcentage+"%"+"] "+"\n"; 
    }
    
    
    
    
}//Fin de la clase.
